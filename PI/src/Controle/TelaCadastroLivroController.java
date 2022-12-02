package Controle;


import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Modelo.Autor;
import Modelo.HistoricoDePrecos;
import Modelo.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TelaCadastroLivroController {

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnSalvar;

    @FXML
    private AnchorPane telaCadastroPane;

    @FXML
    private TextField txtAutor;

    @FXML
    private TextField txtEditora;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtISBN;

    @FXML
    private TextField txtPrecoVenda;

    @FXML
    private TextField txtQuantidade;

    @FXML
    private TextField txtSKU;

    @FXML
    private TextField txtTitulo;

    @FXML
    void AdicionarAutor(ActionEvent event) {
    	
    }

    @FXML
    void AdicionarCodigoSKU(ActionEvent event) {

    }

    @FXML
    void AdicionarEditora(ActionEvent event) {

    }

    @FXML
    void AdicionarGenero(ActionEvent event) {

    }

    @FXML
    void AdicionarISBN(ActionEvent event) {

    }

    @FXML
    void AdicionarPrecoVenda(ActionEvent event) {

    }

    @FXML
    void AdicionarQuantidade(ActionEvent event) {

    }

    @FXML
    void AdicionarTitulo(ActionEvent event) {

    }

    @FXML
    void CancelarCadastro(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	telaCadastroPane.getChildren().setAll(telaHomePane);
    }
   
    @FXML
    void SalvarCadastro(ActionEvent event) throws SQLException {
    	Autor aut = new Autor(txtAutor.getText());
    	Livro liv = new Livro(Integer.parseInt(txtSKU.getText()), txtISBN.getText(), txtTitulo.getText(), txtEditora.getText(), Integer.parseInt(txtQuantidade.getText()), txtGenero.getText(), Float.parseFloat(txtPrecoVenda.getText()), aut);
    	
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    	Date date = new Date();
    	
    	HistoricoDePrecos his = new HistoricoDePrecos(Integer.parseInt(txtSKU.getText()), txtTitulo.getText(), txtISBN.getText(), Float.parseFloat(txtPrecoVenda.getText()), Float.parseFloat(txtPrecoVenda.getText()), dateFormat.format(date));
    	
    	AutorBD autbd = new AutorBD();
    	autbd.InserirAutor(aut);
    	
    	LivroBD livbd = new LivroBD();
    	livbd.InserirLivro(liv);
    	
    	HistoricoDePrecosBD hist = new HistoricoDePrecosBD();
    	hist.InserirHistorico(his);
    }

}