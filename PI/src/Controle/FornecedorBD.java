package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import Modelo.Fornecedor;

public class FornecedorBD {
	public void InserirFornecedor(Fornecedor fornecedor) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into fornecedor (Nome, CNPJ, Inscricao_Estadual, Fone, Celular, Email, idEndereco) values (?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, fornecedor.getNome());
			stmt.setString(2, fornecedor.getCnpj());
			stmt.setString(3, fornecedor.getInsEstadual());
			stmt.setString(4, fornecedor.getTelefone());
			stmt.setString(5, fornecedor.getCelular());
			stmt.setString(6, fornecedor.getEmail());
			stmt.setInt(7, fornecedor.getEndereco().getIdEndereco());
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}
}
