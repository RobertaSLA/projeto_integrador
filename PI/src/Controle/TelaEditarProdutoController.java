
package Controle;

import java.io.IOException;

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

    @FXML
    void ActionCancelarCadastro(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaListagemProdutos.fxml"));
    	telaCadastroPane.getChildren().setAll(telaHomePane);
    }

    @FXML
    void ActionEditarCadastro(ActionEvent event) {

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

}