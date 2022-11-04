package Controle;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.Compra;

public class CompraBD {
	
	public void InserirCompra(Compra compra) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into compra (SKULivro, Quantidade, Valor, IdFornecedor, Data) values (?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, compra.getSkuLivro());
			stmt.setInt(2, compra.getQuantidade());
			stmt.setFloat(3, compra.getValor());
			stmt.setInt(4, compra.getIdFornecedor());
			stmt.setDate(3, new java.sql.Date(compra.getData().getTime()));
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Compra cadastrada com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
	public void DeletarCompra(Compra compra) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "delete from compra where IdCompra = ? ";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, compra.getIdCompra());
			
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Compra excluída com sucesso");
		}catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
}
