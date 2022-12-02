package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Autor;


public class AutorBD {
	public void InserirAutor(Autor autor) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into Autor (Nome) values (?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, autor.getNome());
			
			stmt.execute();
			stmt.close(); 
			con.close();
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
}
