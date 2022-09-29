package Controle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class TelaLoginController {

    @FXML
    private Button btnLogin;

    @FXML
    private BorderPane TelaLoginBorder;

    @FXML
    private Text txtFacaLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;

    @FXML
    void Login(ActionEvent event) throws SQLException, IOException {
    	Usuario us = new Usuario(txtUsuario.getText(), txtSenha.getText());
    	
    	try {
    		Connection con = ConexaoBD.Conexao_BD();
    		String sql = "select * from usuario where user=? and senha=?";
    		PreparedStatement stmt = con.prepareStatement(sql);
    		
    		stmt.setString(1, us.getUsername());
    		stmt.setString(2, us.getSenha());
    		
    		ResultSet rs = stmt.executeQuery();
    		
    		if(rs.next()) {
    			AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	        TelaLoginBorder.getChildren().setAll(telaHomePane);
    		}else {
    			JOptionPane.showMessageDialog(null, "Esse usuario não existe");
    		}
    		
    		stmt.close();
    		con.close();
        	
    	} catch (SQLException e1) {
			e1.printStackTrace();
		}
    	
    	
    	}
   
    	
    }


