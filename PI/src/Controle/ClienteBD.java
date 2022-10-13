package Controle;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Autor;
import Modelo.Cliente;
import Modelo.Endereco;
import Modelo.Livro;


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
	
	public ArrayList<Cliente> BuscarCliente() throws SQLException {
		ArrayList<Cliente> Lista = new ArrayList<Cliente>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select livro.sku, livro.nome, autor.idAutor, autor.nome, livro.editora, livro.genero, livro.isbn, livro.preco, livro.estoque from livro inner join autor where autor.idAutor=livro.idAutor;";
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				Endereco end = new Endereco(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
				Cliente cli = new Cliente(rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12), end, rs.getDate(13), rs.getString(14), rs.getString(15), rs.getString(16));
				Lista.add(cli);
			}
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Inserido com sucesso");
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}

}
