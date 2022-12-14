package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Autor;
import Modelo.Cliente;
import Modelo.Endereco;
import Modelo.Livro;
import Modelo.Venda;
import Modelo.Vendedor;

public class VendedorBD{
	
	public void InserirVendedor(Vendedor vendedor) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into vendedor (Nome, CPF, DataNascimento, Sexo, fone, Celular, email, idEndereco) values (?, ?, ?, ?, ?, ?, ?, ?);";
			
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, vendedor.getNome());
			stmt.setString(2, vendedor.getCpf());
			stmt.setString(3, vendedor.getDataNascimento());
			stmt.setString(4, vendedor.getSexo());
			stmt.setString(5, vendedor.getTelefone());
			stmt.setString(6, vendedor.getCelular());
			stmt.setString(7, vendedor.getEmail());
			stmt.setInt(8, vendedor.getEndereco().getIdEndereco());
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e); 
		}
	}
	
	public void DeletarVendedor(Vendedor vendedor) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "delete from vendedor where IdVendedor = ?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, vendedor.getIdVendedor());
			
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Vendedor excluída com sucesso");
		}catch (SQLException e){
			throw new SQLException(e);
		}
}
	public ArrayList<Vendedor> BuscarVendedor() throws SQLException {
		ArrayList<Vendedor> Lista = new ArrayList<Vendedor>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select idVendedor, nome, cpf from vendedor;";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				Vendedor vend = new Vendedor(rs.getInt(1), rs.getString(2), rs.getString(3));
				Lista.add(vend);
			}
			
			stmt.close(); 
			con.close();
						
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
	
	public Vendedor CriarVendedor(int idVendedor) throws SQLException {
		Vendedor vend = new Vendedor();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select idVendedor, comissao from vendedor where idVendedor = " + idVendedor;
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				vend.setIdVendedor(1);
				vend.setComissao(2);
			}
			
			stmt.close(); 
			con.close();
						
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return vend;	
	}
	
	public void AtualizarComissao(int idVendedor, float comissao) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "update vendedor set comissao = ? where idVendedor = ?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setFloat(1, comissao);
			stmt.setInt(2, idVendedor);
		
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
	
	public ArrayList<Vendedor> BuscarListagemVendedor() throws SQLException {
		ArrayList<Vendedor> Lista = new ArrayList<Vendedor>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select idVendedor, nome, cpf, endereco.cep, fone, email, comissao from vendedor inner join endereco "
					+ "using (idEndereco)";
			
			ResultSet rs = stmt.executeQuery(query);
	
			while(rs.next()){
				Endereco end = new Endereco(rs.getString(4));
				Vendedor vend = new Vendedor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(5),
						rs.getString(6), rs.getFloat(7), end);
				Lista.add(vend);
			}
			
			stmt.close(); 
			con.close();
						
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
	
	public ArrayList<Vendedor> BuscarVendedor(String filtro) throws SQLException {
		ArrayList<Vendedor> Lista = new ArrayList<Vendedor>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			
			String query = "select idVendedor, nome, CPF, fone, comissao, cep "
					+ "from vendedor inner join endereco using (idendereco) where cpf like ?;";
			
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, filtro);
			
			
			ResultSet rs = stmt.executeQuery();
			
	
			while(rs.next()){
				Endereco endereco = new Endereco(rs.getString(6));
				Vendedor ven = new Vendedor(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getFloat(5), endereco);
				Lista.add(ven);
			}
			
			stmt.close(); 
			con.close();
			
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
	}	
}

