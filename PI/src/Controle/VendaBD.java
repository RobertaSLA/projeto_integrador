package Controle;

import java.sql.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Autor;
import Modelo.Cliente;
import Modelo.Livro;
import Modelo.LivroVenda;
import Modelo.Venda;
import Modelo.Vendedor;

public class VendaBD {
	
	public void InserirVenda(Venda venda) throws SQLException {
		try {
		Connection con = ConexaoBD.Conexao_BD();
		String sql = "insert into venda (IdFormaPagamento, Data, Valor, Desconto, Cliente_idCliente, Vendedor_idVendedor) values (?, ?, ?, ?, ?, ?);";

		PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		stmt.setInt(1, venda.getFormaPagamento().getIdFormaPagamento());
		stmt.setDate(2, new java.sql.Date(venda.getData().getTime()));
		stmt.setFloat(3, venda.getValor());
		stmt.setFloat(4, venda.getDesconto());
		stmt.setInt(5, venda.getCliente().getIdCliente());
		stmt.setInt(6, venda.getVendedor().getIdVendedor());

		stmt.execute();

		int idVenda = 0;
		ResultSet rs = stmt.getGeneratedKeys();
		
		if (rs.next()){
			idVenda=rs.getInt(1);
		}
		
		sql = "Insert into Livro_has_Venda (Livro_SKU, Venda_idVenda, QuantidadeItem, "
				+ "DescontoItem, ValorItens) values (?, ?, ?, ?, ?) ";
		PreparedStatement stmtLV = con.prepareStatement(sql);
		for (LivroVenda lv: venda.getListaitens()) {
			stmtLV.setInt(2, idVenda);
			stmtLV.setInt(1, lv.getLivro().getSku());
			stmtLV.setInt(3, lv.getQuantidade());
			stmtLV.setFloat(4, lv.getDesconto());
			stmtLV.setFloat(5, lv.getValor());
			stmtLV.execute();
		}
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
				
				String query = "select idVenda, Cliente.idCliente, Cliente.nome, Desconto, Valor, Vendedor.idVendedor, Vendedor.nome from venda inner join Cliente on (Cliente_idCliente = idCliente) inner join Vendedor on (Vendedor_idVendedor = idVendedor);";
				
				
				ResultSet rs = stmt.executeQuery(query);
				
		
				while(rs.next()){
					Cliente cliente = new Cliente(rs.getInt(2), rs.getString(3));
					Vendedor vendedor = new Vendedor(rs.getInt(6), rs.getString(7));
					Venda vend = new Venda(rs.getInt(1), rs.getFloat(5), rs.getFloat(4), cliente, vendedor);
					
					venda.add(vend);
				}
				
				stmt.close(); 
				con.close();
				
			}catch (SQLException e){
				throw new SQLException(e);
			}
			return venda;
			
		}
		
		public ArrayList<Venda> ListarVendas() throws SQLException {
			ArrayList<Venda> venda = new ArrayList<Venda>();
			try {
				Connection con = ConexaoBD.Conexao_BD();
				Statement stmt = con.createStatement();
				
				String query = "select idVenda, Cliente.idCliente, Cliente.nome, Valor from venda inner join Cliente on (Cliente_idCliente = idCliente);";
				
				
				ResultSet rs = stmt.executeQuery(query);
				
		
				while(rs.next()){
					Cliente cliente = new Cliente(rs.getInt(2), rs.getString(3));
					Venda vend = new Venda(rs.getInt(1), rs.getFloat(4), cliente);
					
					venda.add(vend);
				}
				
				stmt.close(); 
				con.close();
				
			}catch (SQLException e){
				throw new SQLException(e);
			}
			return venda;
			
		}
		
		public Venda CriarVenda(int cod) throws SQLException {
			Venda venda = new Venda();
			try {
				Connection con = ConexaoBD.Conexao_BD();
				Statement stmt = con.createStatement();
				
				String query = "select Cliente_idCliente from venda inner "
						+ "join cliente on Cliente_idCliente = idCliente where idVenda=" +cod + ";";
				
				ResultSet rs = stmt.executeQuery(query);
				
				while(rs.next()){
					Cliente cli = new Cliente(rs.getInt(1));
					venda.setIdVenda(cod);
					venda.setCliente(cli);
				}
				
				stmt.close(); 
				con.close();
				
			} catch (SQLException e){
				throw new SQLException(e);
			}
			return venda;
	}
		
}
