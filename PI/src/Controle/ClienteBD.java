package Controle;

import java.sql.*;
import javax.swing.JOptionPane;
import Modelo.Cliente;


public class ClienteBD {
	
	public void InserirCliente(Cliente cliente) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into cliente (Nome, CPF, DataNascimento, Sexo, Fone, Celular, Email, idEndereco) values (?, ?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTime()));
			stmt.setString(4, cliente.getSexo());
			stmt.setString(5, cliente.getTelefone());
			stmt.setString(6, cliente.getCelular());
			stmt.setString(7, cliente.getEmail());
			stmt.setInt(8, cliente.getEndereco().getIdEndereco());
			
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

}
