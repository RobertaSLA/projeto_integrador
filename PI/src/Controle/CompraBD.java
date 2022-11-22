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
			String sql = "insert into compra (Quantidade, Valor, IdFornecedor, Data) values (?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, compra.getQuantidade());
			stmt.setFloat(2, compra.getValor());
			stmt.setInt(3, compra.getFornecedor().getIdFornecedor());
			stmt.setDate(4, new java.sql.Date(compra.getData().getTime()));
			
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
