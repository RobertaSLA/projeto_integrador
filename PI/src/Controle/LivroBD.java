package Controle;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Autor;
import Modelo.Livro;

public class LivroBD {
	
	

	public void InserirLivro(Livro livro) throws SQLException {
			try {
				Connection con = ConexaoBD.Conexao_BD();
				String sql = "insert into livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco, idAutor) values (?, ?, ?, ?, ?, ?, ?, ?);";
				
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setInt(1, livro.getSku());
				stmt.setString(2, livro.getIsbn());
				stmt.setString(3, livro.getNome());
				stmt.setString(4, livro.getEditora());
				stmt.setInt(5, livro.getEstoque());
				stmt.setString(6, livro.getGenero());
				stmt.setFloat(7, livro.getPreco());
				stmt.setInt(8, livro.getAutor().getIdAutor());
				
				stmt.execute();
				stmt.close(); 
				con.close();
				JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");
				
			} catch (SQLException e){
				throw new SQLException(e);
			}
	}
	
	public void DeletarLivro(Livro livro) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "delete from livro where SKU = ?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, livro.getSku());
			
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Livro excluído com sucesso");
		}catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
	public void AtualizarLivro(Livro livro) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "update livro set SKU = ?, ISBN = ?, Nome = ?, Editora = ?, Estoque = ?, Genero = ?, Preco = ?) where SKU = ?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, livro.getSku());
			stmt.setString(2, livro.getIsbn());
			stmt.setString(3, livro.getNome());
			stmt.setString(4, livro.getEditora());
			stmt.setInt(5, livro.getEstoque());
			stmt.setString(6, livro.getGenero());
			stmt.setFloat(7, livro.getPreco());
			
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
		}catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
	public ArrayList<Livro> BuscarLivro() throws SQLException {
		ArrayList<Livro> Lista = new ArrayList<Livro>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select livro.sku, livro.nome, autor.idAutor, autor.nome, livro.editora, livro.genero, "
					+ "livro.isbn, livro.preco, livro.estoque from livro inner join autor where autor.idAutor=livro.idAutor";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				Autor autor = new Autor(rs.getInt(3), rs.getString(4));
				Livro liv = new Livro(rs.getInt(1), rs.getString(7), rs.getString(2), rs.getString(5), rs.getInt(9), rs.getString(6), rs.getFloat(8), autor);
				Lista.add(liv);
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
