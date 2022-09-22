package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.Venda;
import Modelo.Vendedor;

public class VendedorBD{
	
	public void CadastrarVendedor(Vendedor vendedor) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into vendedor (Nome, CPF, CEP, Endereco, Telefone) values (?, ?, ?, ?, ?);";
			
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, vendedor.getNome());
			stmt.setString(2, vendedor.getCpf());
			stmt.setString(3, vendedor.getCep());
			stmt.setString(4, vendedor.getEndereco());
			stmt.setString(5, vendedor.getTelefone());
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e); 
		}
	}
	
	public void DeletarVenda(Vendedor vendedor) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "delete from venda where IdVenda = ?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, vendedor.getIdVendedor());
			
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Venda excluída com sucesso");
		}catch (SQLException e){
			throw new SQLException(e);
		}
}
}

