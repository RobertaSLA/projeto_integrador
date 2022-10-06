package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Endereco;

public class EnderecoBD {

	public void InserirEndereco(Endereco endereco) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into endereco (cep, uf, cidade, bairro, endereco, numero, complemento) values (?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, endereco.getCep());
			stmt.setString(2, endereco.getUf());
			stmt.setString(3, endereco.getCidade());
			stmt.setString(4, endereco.getBairro());
			stmt.setString(4, endereco.getEndereco());
			stmt.setInt(4, endereco.getNumero());
			stmt.setString(4, endereco.getComplemento());
			
			
			stmt.execute();
			stmt.close(); 
			con.close();
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}
}
