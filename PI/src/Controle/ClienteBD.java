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
import Modelo.Vendedor;

public class ClienteBD {
	
	public void InserirCliente(Cliente cliente) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into cliente (Nome, CPF, DataNascimento, Sexo, Fone, Celular, Email, idEndereco) values (?, ?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getDataNascimento());
			stmt.setString(4, cliente.getSexo());
			stmt.setString(5, cliente.getTelefone());
			stmt.setString(6, cliente.getCelular());
			stmt.setString(7, cliente.getEmail());
			stmt.setInt(8, cliente.getEndereco().getIdEndereco());
			
			System.out.println(stmt);
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
	public void DeletarCliente(Cliente cliente) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "delete from cliente where IdCliente = ? ";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, cliente.getIdCliente());
			
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso");
		}catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
	public void AtualizarLivro(Cliente cliente) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "update cliente set Nome = ?, CPF = ?, DataNascimento = ?, Sexo = ?, Fone = ?, Celular = ? where idCliente = ?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(7, cliente.getIdCliente());
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getDataNascimento());
			stmt.setString(4, cliente.getSexo());
			stmt.setString(5, cliente.getTelefone());
			stmt.setString(6, cliente.getCelular());
		
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
		}catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
	public ArrayList<Cliente> BuscarCliente() throws SQLException {
		ArrayList<Cliente> Lista = new ArrayList<Cliente>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select endereco.idEndereco, endereco.cep, endereco.uf, endereco.cidade, endereco.bairro, "
					+ "endereco.endereco, endereco.numero, endereco.complemento, cliente.idCliente, cliente.nome, "
					+ "cliente.fone, cliente.cpf, cliente.dataNascimento, cliente.sexo, cliente.celular, cliente.email "
					+ "from cliente inner join endereco where cliente.idEndereco=endereco.idEndereco;";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				Endereco end = new Endereco(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
				Cliente cli = new Cliente(rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12), 
						end, rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16));
				Lista.add(cli);
			}
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Seletado com sucesso");
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
	
	public ArrayList<Cliente> BuscarCodCliente() throws SQLException {
		ArrayList<Cliente> Lista = new ArrayList<Cliente>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select idCliente, nome, cpf from cliente;";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				Cliente clie = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
				Lista.add(clie);
			}
			
			stmt.close(); 
			con.close();

			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
	
	public ArrayList<Cliente> BuscarCliente(String filtro) throws SQLException {
		ArrayList<Cliente> Lista = new ArrayList<Cliente>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			
			String query = "select cliente.codigo, cliente.nome, cliente.CPF, cliente.telefone, cliente.email, endereco.idEndereco, endereco.cep,"
					+ "from cliente inner join endereco using (idEndereco) where cliente.nome like ?;";
			
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, filtro);
			
			
			ResultSet rs = stmt.executeQuery();
			
	
			while(rs.next()){
				Endereco endereco = new Endereco(rs.getString(6));
				Cliente cli = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
				Lista.add(cli);
			}
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Seletado com sucesso");
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
	}
}
