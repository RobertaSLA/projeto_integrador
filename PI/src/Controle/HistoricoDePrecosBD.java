package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.HistoricoDePrecos;

public class HistoricoDePrecosBD {
	
	public void InserirHistorico(HistoricoDePrecos historico) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into HistoricoDePrecos (NomeLivro, SKU, ISBN, PrecoAnterior, PrecoAtual, DataAlteracao) values (?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(2, historico.getSkuLivro());
			stmt.setString(1, historico.getLivro());
			stmt.setString(3, historico.getIsbn());
			stmt.setFloat(4, historico.getPrecoAnterior());
			stmt.setFloat(5, historico.getPrecoAtual());
			stmt.setString(6, historico.getDataAlteracao());
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Historico cadastrado com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
}
}
