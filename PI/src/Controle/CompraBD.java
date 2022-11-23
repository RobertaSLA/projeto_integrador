package Controle;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.Compra;
import Modelo.LivroCompra;
import Modelo.LivroVenda;

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
			
			int idCompra = 0;
			ResultSet rs = stmt.getGeneratedKeys();
			
			if (rs.next()){
				idCompra=rs.getInt(1);
			}
			
			sql = "Insert into Livro_has_Venda (Livro_SKU, Compra_IdCompra, Quantidade, "
					+ "ValorItem, ValorTotal) values (?, ?, ?, ?, ?) ";
			PreparedStatement stmtLC = con.prepareStatement(sql);
			for (LivroCompra lc: compra.getListaitens()) {
				stmtLC.setInt(2, idCompra);
				stmtLC.setInt(1, lc.getLivro().getSku());
				stmtLC.setInt(3, lc.getQuantidade());
				stmtLC.setFloat(4, lc.getValor());
				stmtLC.setFloat(5, lc.getValorTotal());
				stmtLC.execute();
			}
			
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
