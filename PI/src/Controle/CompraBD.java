package Controle;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Autor;
import Modelo.Cliente;
import Modelo.Compra;
import Modelo.Fornecedor;
import Modelo.Livro;
import Modelo.LivroCompra;
import Modelo.LivroVenda;
import Modelo.Venda;
import Modelo.Vendedor;

public class CompraBD {
	
	public void InserirCompra(Compra compra) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into compra (Quantidade, Valor, IdFornecedor, Data) values (?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, compra.getQuantidade());
			stmt.setFloat(2, compra.getValor());
			stmt.setInt(3, compra.getFornecedor().getIdFornecedor());
			stmt.setString(4, compra.getData());
			
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
	
	public ArrayList<Compra> BuscarCompras() throws SQLException {
		ArrayList<Compra> compra = new ArrayList<Compra>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select idCompra, Data, Valor, Quantidade, Fornecedor.IdFornecedor, Fornecedor.nome"
					+ " from compra inner join fornecedor using (idFornecedor);";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				Fornecedor forne = new Fornecedor(rs.getInt(5), rs.getString(6));
				Compra comp = new Compra(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), forne);
				
				compra.add(comp);
			}
			
			stmt.close(); 
			con.close();
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return compra;
		
	}
	
	public ArrayList<Compra> BuscarFiltrosPreco(int filtro, int filtro2) throws SQLException {
		ArrayList<Compra> Lista = new ArrayList<Compra>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			
			String query = "select idCompra, quantidade, valor, data, nome "
					+ "from compra inner join fornecedor using (idfornecedor) where valor between ? and ?;";
			
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setInt(1, filtro);
			stmt.setInt(2, filtro2);
			
			
			ResultSet rs = stmt.executeQuery();
			
	
			while(rs.next()){
				Fornecedor fornecedor = new Fornecedor(rs.getInt(5));
				Compra com = new Compra(rs.getInt(1), fornecedor, rs.getInt(2), rs.getFloat(3), rs.getString(4));
				Lista.add(com);
			}
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Seletado com sucesso");
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
	
}
