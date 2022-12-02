package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Modelo.FormaPagamento;

public class FormaPagamentoBD {
	
	public FormaPagamento InserirFormaPagamento(FormaPagamento pagamento) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into FormaDePagamento (FormaDePagamento, BandeiraCartao, ValorTotal, ValorRecebido, ValorTroco) values (?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, pagamento.getFormaPagamento());
			stmt.setString(2, pagamento.getBandeiraCartao());
			stmt.setFloat(3, pagamento.getValorTotal());
			stmt.setFloat(4, pagamento.getValorRecebido());
			stmt.setFloat(5, pagamento.getValorTroco());
			
			stmt.execute();
			
			
			try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
	            if (generatedKeys.next()) {
	                pagamento.setIdFormaPagamento(generatedKeys.getInt(1));
	                return pagamento;
	            }
	            else {
	                throw new SQLException("Creating user failed, no ID obtained.");
	            }
	        }
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}

}
