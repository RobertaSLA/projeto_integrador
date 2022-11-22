package Controle;

import java.sql.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Autor;
import Modelo.Cliente;
import Modelo.Livro;
import Modelo.Venda;

public class VendaBD {
	public void InserirVenda(Venda venda) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into venda (IdFormaPagamento, Data, Valor, Desconto, Cliente_idCliente, Vendedor_idVendedor) values (?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, venda.getFormaPagamento().getIdFormaPagamento());
			stmt.setDate(2, new java.sql.Date(venda.getData().getTime()));
			stmt.setFloat(3, venda.getValor());
			stmt.setFloat(4, venda.getDesconto());
			stmt.setInt(5, venda.getCliente().getIdCliente());
			stmt.setInt(6, venda.getVendedor().getIdVendedor());
			
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
		
		public ArrayList<Venda> BuscarVendas() throws SQLException {
			ArrayList<Venda> venda = new ArrayList<Venda>();
			try {
				Connection con = ConexaoBD.Conexao_BD();
				Statement stmt = con.createStatement();
				
				String query = "select idVenda, Cliente.idCliente, Cliente.nome, Data from venda inner join Cliente on (Cliente_idCliente = idCliente);";
				
				
				ResultSet rs = stmt.executeQuery(query);
				
		
				while(rs.next()){
					Cliente cliente = new Cliente(rs.getInt(2), rs.getString(3));
					Venda vend = new Venda(rs.getInt(1), rs.getDate(4), cliente);
					
					venda.add(vend);
				}
				
				stmt.close(); 
				con.close();
				
			}catch (SQLException e){
				throw new SQLException(e);
			}
			return venda;
			
		}
}
