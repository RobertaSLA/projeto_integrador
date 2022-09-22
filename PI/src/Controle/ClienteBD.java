package Controle;

import java.sql.*;
import javax.swing.JOptionPane;
import Modelo.Cliente;
import Modelo.Livro;


public class ClienteBD {
	
	public void InserirCliente(Cliente cliente) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into cliente (Nome, Telefone, CPF, Endereco, CEP) values (?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getCpf());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getCep());
			
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
