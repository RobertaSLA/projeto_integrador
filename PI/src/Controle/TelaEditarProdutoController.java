
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

public class TelaEditarProdutoController {

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnPesquisarSKU;

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
    
    private Livro livro1;

    @FXML
    void ActionCancelarCadastro(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/ListagemProdutos.fxml"));
    	telaCadastroPane.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void ActionEditarCadastro(ActionEvent event) throws SQLException, IOException {
    	Autor aut = new Autor(txtAutor.getText());
    	Livro liv = new Livro(Integer.parseInt(txtSKU.getText()), txtISBN.getText(), txtTitulo.getText(), 
    			txtEditora.getText(), Integer.parseInt(txtQuantidade.getText()), txtGenero.getText(), Float.parseFloat(txtPrecoVenda.getText()), aut);
    	
    	if (livro1.getPreco() != Float.parseFloat(txtPrecoVenda.getText())) {
    		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        	Date date = new Date();
        	
    		HistoricoDePrecos hist = new HistoricoDePrecos(Integer.parseInt(txtSKU.getText()), txtTitulo.getText(),
    				txtISBN.getText(), livro1.getPreco(), Float.parseFloat(txtPrecoVenda.getText()), dateFormat.format(date));
    		
    		HistoricoDePrecosBD his = new HistoricoDePrecosBD();
    		his.InserirHistorico(hist);
    	}
    	
    	LivroBD livbd = new LivroBD();
    	livbd.AtualizarLivro(liv);
    	
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/ListagemProdutos.fxml"));
    	telaCadastroPane.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void ActionPesquisarSKU(ActionEvent event) {

    }

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

	public void DefinirLivro(Livro livro) {
		livro1 = livro;
		txtSKU.setText(String.valueOf(livro.getSku()));
    	txtISBN.setText(livro.getIsbn());
    	txtTitulo.setText(livro.getNome());
    	txtAutor.setText(livro.getAutor().getNome());
    	txtEditora.setText(livro.getEditora());
    	txtGenero.setText(livro.getGenero());
    	txtPrecoVenda.setText(String.valueOf(livro.getPreco()));
    	txtQuantidade.setText(String.valueOf(livro.getEstoque()));
	}

}