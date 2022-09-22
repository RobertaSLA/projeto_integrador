package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.Livro;

public class LivroBD {

	public void InserirLivro(Livro livro) throws SQLException {
			try {
				Connection con = ConexaoBD.Conexao_BD();
				String sql = "insert into livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (?, ?, ?, ?, ?, ?, ?);";
				
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setInt(1, livro.getSku());
				stmt.setInt(2, livro.getIsbn());
				stmt.setString(3, livro.getNome());
				stmt.setString(4, livro.getEditora());
				stmt.setInt(5, livro.getEstoque());
				stmt.setString(6, livro.getGenero());
				stmt.setFloat(7, livro.getPreco());
				
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
			stmt.setInt(2, livro.getIsbn());
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
}
