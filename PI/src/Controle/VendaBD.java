package Controle;

import java.sql.*;
import javax.swing.JOptionPane;

import Modelo.Livro;
import Modelo.Venda;

public class VendaBD {
	public void InserirVenda(Venda venda) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into venda (SKULivro, IdFormaPagamento, Data, Valor, idCliente, idVendedor) values (?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, venda.getSkuLivro());
			stmt.setInt(2, venda.getIdFormaPagamento());
			stmt.setDate(3, new java.sql.Date(venda.getData().getTime()));
			stmt.setFloat(4, venda.getValor());
			stmt.setInt(5, venda.getIdCliente());
			stmt.setInt(6, venda.getIdVendedor());
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}
		
		public void DeletarVenda(Venda venda) throws SQLException {
			try {
				Connection con = ConexaoBD.Conexao_BD();
				String sql = "delete from venda where IdVenda = ?";
				
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setInt(1, venda.getIdVenda());
				
				stmt.executeUpdate();
				
				stmt.close(); 
				con.close();
				
				JOptionPane.showMessageDialog(null, "Venda excluída com sucesso");
			}catch (SQLException e){
				throw new SQLException(e);
			}
}
}
