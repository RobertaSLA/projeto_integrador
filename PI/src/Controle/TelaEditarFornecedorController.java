package Controle;


import java.io.IOException;
import Modelo.Fornecedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TelaEditarFornecedorController {

    @FXML
    private ChoiceBox<String> ChoiceBoxUF;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnPesquisarFornecedor;

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
    void ActionEditarCadastro(ActionEvent event) {

    }

    @FXML
    void ActionPesquisarFornecedor(ActionEvent event) {

    }

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
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/ListagemFornecedor.fxml"));
    	telaCadastroPane.getChildren().setAll(telaListagemPane);
    }
    
    public void DefinirFornecedor(Fornecedor fornecedor) {
    	txtCodFornecedor.setText(String.valueOf(fornecedor.getIdFornecedor()));
    	txtNomeFant.setText(fornecedor.getNome());
    	txtCNPJ.setText(fornecedor.getCnpj());
    	txtInscEstd.setText(fornecedor.getInsEstadual());
    	txtCEP.setText(fornecedor.getEndereco().getCep());
    	ChoiceBoxUF.setValue(fornecedor.getEndereco().getUf());
    	txtCidade.setText(fornecedor.getEndereco().getCidade());
    	txtBairro.setText(fornecedor.getEndereco().getBairro());
    	txtEndereco.setText(fornecedor.getEndereco().getEndereco());
    	txtNum.setText(String.valueOf(fornecedor.getEndereco().getNumero()));
    	txtComplemento.setText(fornecedor.getEndereco().getComplemento());
    	txtFone.setText(fornecedor.getTelefone());
    	txtCelular.setText(fornecedor.getCelular());
    	txtEmail.setText(fornecedor.getEmail());
 
	}


}
