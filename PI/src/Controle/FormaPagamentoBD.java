package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.FormaPagamento;

public class FormaPagamentoBD {
	
	public void InserirFormaPagamento(FormaPagamento pagamento) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into FormaDePagamento (idFormaDePagamento, FormaDePagamento, BandeiraCartao, ValorTotal, ValorRecebido, ValorTroco) values (?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, pagamento.getIdFormaPagamento());
			stmt.setString(2, pagamento.getFormaPagamento());
			stmt.setString(3, pagamento.getBandeiraCartao());
			stmt.setFloat(4, pagamento.getValorTotal());
			stmt.setFloat(5, pagamento.getValorRecebido());
			stmt.setFloat(5, pagamento.getValorTroco());
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Pagamento cadastrada com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}

}
