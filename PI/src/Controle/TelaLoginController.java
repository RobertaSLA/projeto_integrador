package Controle;

import java.io.IOException;
import java.sql.SQLException;

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
    private AnchorPane telaLoginArchorPaneLeft;

    @FXML
    private AnchorPane telaLoginArchorPaneRight;

    @FXML
    private BorderPane telaLoginBorderPane;

    @FXML
    private Text txtFacaLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;

    @FXML
    void Login(ActionEvent event) throws SQLException, IOException {
    	Usuario us = new Usuario(txtUsuario.getText(), txtSenha.getText());
    	
    	UsuarioBD usuario = new UsuarioBD();
    	usuario.AutenticarLogin(us);
    	
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("visao/TelaHome.fxml"));
    	telaLoginArchorPaneRight.getChildren().setAll(telaHomePane);
    }

}

