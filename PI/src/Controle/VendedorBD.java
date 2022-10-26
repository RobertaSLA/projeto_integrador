package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Autor;
import Modelo.Livro;
import Modelo.Venda;
import Modelo.Vendedor;

public class VendedorBD{
	
	public void InserirVendedor(Vendedor vendedor) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into vendedor (Nome, CPF, Telefone, Celular, idEndereco) values (?, ?, ?, ?, ?);";
			
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, vendedor.getNome());
			stmt.setString(2, vendedor.getCpf());
			stmt.setString(3, vendedor.getTelefone());
			stmt.setString(4, vendedor.getCelular());
			stmt.setInt(5, vendedor.getEndereco().getIdEndereco());
			
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
			String sql = "delete from venda where IdVenda = ?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, vendedor.getIdVendedor());
			
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Venda excluída com sucesso");
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
			
			JOptionPane.showMessageDialog(null, "Seletado com sucesso");
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
}

