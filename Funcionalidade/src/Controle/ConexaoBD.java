package Controle;
import java.sql.*;

import Modelo.Conexao;
public class ConexaoBD {
	
	public static Connection Conexao_BD() throws SQLException {
		
		try {
			
			return DriverManager.getConnection(Conexao.getCaminho(), Conexao.getUsuario(), Conexao.getSenha());
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}
}