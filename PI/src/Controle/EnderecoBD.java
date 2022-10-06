package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.Endereco;

public class EnderecoBD {

	public Endereco InserirEndereco(Endereco endereco) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into endereco (cep, uf, cidade, bairro, endereco, numero, complemento) values (?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, endereco.getCep());
			stmt.setString(2, endereco.getUf());
			stmt.setString(3, endereco.getCidade());
			stmt.setString(4, endereco.getBairro());
			stmt.setString(5, endereco.getEndereco());
			stmt.setInt(6, endereco.getNumero());
			stmt.setString(7, endereco.getComplemento());
			
			stmt.execute();
			
			 try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
		            if (generatedKeys.next()) {
		                endereco.setIdEndereco(generatedKeys.getInt(1));
		                return endereco;
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
