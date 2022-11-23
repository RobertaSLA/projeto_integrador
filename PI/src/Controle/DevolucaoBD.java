package Controle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.Compra;
import Modelo.Devolucao;
import Modelo.LivroCompra;
import Modelo.LivroDevolucao;

public class DevolucaoBD {
	
	public void InserirDevolucao(Devolucao devolucao) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into devolucao (Motivo, Data, Venda_idVenda, Venda_Cliente_idCliente) values (?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, devolucao.getMotivo());
			stmt.setDate(2, new java.sql.Date(devolucao.getData().getTime()));
			stmt.setInt(3, devolucao.getVenda().getIdVenda());
			stmt.setInt(4, devolucao.getVenda().getCliente().getIdCliente());
			
			int idDevolucao = 0;
			ResultSet rs = stmt.getGeneratedKeys();
			
			if (rs.next()){
				idDevolucao=rs.getInt(1);
			}
			
			sql = "Insert into Livro_has_Devolucao (LivroSKU, Devolucao_IdDevolucao, Quantidade, "
					+ "ValorItem, ValorTotal) values (?, ?, ?, ?, ?) ";
			PreparedStatement stmtLC = con.prepareStatement(sql);
			for (LivroDevolucao ld: devolucao.getListaitens()) {
				stmtLC.setInt(2, idDevolucao);
				stmtLC.setInt(1, ld.getLivro().getSku());
				stmtLC.setInt(3, ld.getQuantidade());
				stmtLC.setFloat(4, ld.getValorItem());
				stmtLC.setFloat(5, ld.getValor());
				stmtLC.execute();
			}
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Devolucao cadastrada com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}

}
