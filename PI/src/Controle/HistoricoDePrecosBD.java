package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Autor;
import Modelo.HistoricoDePrecos;
import Modelo.Livro;

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
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
}
	public ArrayList<HistoricoDePrecos> BuscarHistorico() throws SQLException {
		ArrayList<HistoricoDePrecos> Lista = new ArrayList<HistoricoDePrecos>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select sku, nomeLivro, isbn, precoAnterior, precoAtual, dataAlteracao "
					+ "from HistoricoDePrecos;";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				HistoricoDePrecos hist = new HistoricoDePrecos(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getFloat(4), rs.getFloat(5), rs.getString(6));
				
				Lista.add(hist);
			}
			
			stmt.close(); 
			con.close();
			
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
	
	public ArrayList<HistoricoDePrecos> BuscarHistoricoSKU(int sku) throws SQLException {
		ArrayList<HistoricoDePrecos> Lista = new ArrayList<HistoricoDePrecos>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select sku, nomeLivro, isbn, precoAnterior, precoAtual, dataAlteracao "
					+ "from HistoricoDePrecos where sku=" + sku + ";";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				HistoricoDePrecos hist = new HistoricoDePrecos(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getFloat(4), rs.getFloat(5), rs.getString(6));
				
				Lista.add(hist);
			}
			
			stmt.close(); 
			con.close();
			
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
}
