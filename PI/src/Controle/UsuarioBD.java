package Controle;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.Usuario;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;


public class UsuarioBD {

	
	public void AutenticarLogin(Usuario user) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "select * from usuario where user=? and senha=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getSenha());
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
			}else {
				JOptionPane.showMessageDialog(null, "Esse usuario n�o existe");
			}
			
			stmt.close();
			con.close();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}
}
