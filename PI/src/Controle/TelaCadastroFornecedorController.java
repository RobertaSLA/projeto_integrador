package Controle;

import java.io.IOException;
import java.sql.SQLException;

import Modelo.Endereco;
import Modelo.Fornecedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TelaCadastroFornecedorController {

    @FXML
    private ChoiceBox<?> ChoiceBoxUF;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnSalvar;

    @FXML
    private AnchorPane telaCadastroPane;

    @FXML
    private TextField txtBairro;

    @FXML
    private TextField txtCEP;

    @FXML
    private TextField txtCNPJ;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtCodFornecedor;

    @FXML
    private TextField txtComplemento;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtEndereco;

    @FXML
    private TextField txtFone;

    @FXML
    private TextField txtInscEstd;

    @FXML
    private TextField txtNomeFant;

    @FXML
    private TextField txtNum;

    @FXML
    void AdicionarBairro(ActionEvent event) {

    }

    @FXML
    void AdicionarCEP(ActionEvent event) {

    }

    @FXML
    void AdicionarCNPJ(ActionEvent event) {

    }

    @FXML
    void AdicionarCelular(ActionEvent event) {

    }

    @FXML
    void AdicionarCidade(ActionEvent event) {

    }

    @FXML
    void AdicionarCodFornecedor(ActionEvent event) {

    }

    @FXML
    void AdicionarComplemento(ActionEvent event) {

    }

    @FXML
    void AdicionarEmail(ActionEvent event) {

    }

    @FXML
    void AdicionarEndereco(ActionEvent event) {

    }

    @FXML
    void AdicionarFone(ActionEvent event) {

    }

    @FXML
    void AdicionarInscEstd(ActionEvent event) {

    }

    @FXML
    void AdicionarNomeFant(ActionEvent event) {

    }

    @FXML
    void AdicionarNum(ActionEvent event) {

    }

    @FXML
    void CancelarCadastro(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	telaCadastroPane.getChildren().setAll(telaHomePane);
    }

    @FXML
    void SalvarCadastro(ActionEvent event) throws SQLException {
    	Endereco end = new Endereco(txtCEP.getText(), ChoiceBoxUF.getTypeSelector(), txtCidade.getText(), txtBairro.getText(), txtEndereco.getText(), Integer.parseInt(txtNum.getText()), txtComplemento.getText());
    	Fornecedor forn = new Fornecedor(txtNomeFant.getText(), txtCNPJ.getText(), txtInscEstd.getText(), txtFone.getText(), txtCelular.getText(), txtEmail.getText(), end);
    	
    	EnderecoBD endbd = new EnderecoBD();
    	endbd.InserirEndereco(end);
    	
    	FornecedorBD forbd = new FornecedorBD();
    	forbd.InserirFornecedor(forn);
    	
    }

}