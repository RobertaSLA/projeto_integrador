package Controle;

import java.io.IOException;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import Modelo.Cliente;
import Modelo.Endereco;
import Modelo.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TelaEditarClienteController {

    @FXML
    private DatePicker ChoiceBoxNascimento;

    @FXML
    private ChoiceBox<String> ChoiceBoxSexo;

    @FXML
    private ChoiceBox<String> ChoiceBoxUF;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnPesquisarCod;

    @FXML
    private AnchorPane telaCadastroPane;

    @FXML
    private TextField txtBairro;

    @FXML
    private TextField txtCEP;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtCodCliente;

    @FXML
    private TextField txtComplemento;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtEndereco;

    @FXML
    private TextField txtFone;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtNum;

    @FXML
    void ActionPesquisarCodigoCliente(ActionEvent event) {

    }

    @FXML
    void AdicionarBairro(ActionEvent event) {

    }

    @FXML
    void AdicionarCEP(ActionEvent event) {

    }

    @FXML
    void AdicionarCPF(ActionEvent event) {

    }

    @FXML
    void AdicionarCelular(ActionEvent event) {

    }

    @FXML
    void AdicionarCidade(ActionEvent event) {

    }

    @FXML
    void AdicionarCodCliente(ActionEvent event) {

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
    void AdicionarNome(ActionEvent event) {

    }

    @FXML
    void AdicionarNum(ActionEvent event) {

    }

    @FXML
    void CancelarCadastro(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/ListagemClientes.fxml"));
    	telaCadastroPane.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void EditarCadastro(ActionEvent event) throws SQLException, IOException {
    	Endereco end = new Endereco(txtCEP.getText(), ChoiceBoxUF.getValue(), txtCidade.getText(), 
    		txtBairro.getText(), txtEndereco.getText(), Integer.parseInt(txtNum.getText()), txtComplemento.getText());
    	
    	LocalDate localDate = ChoiceBoxNascimento.getValue();
    	Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
    	Date date = Date.from(instant);
    	
    	Cliente cli = new Cliente(txtNome.getText(), txtFone.getText(), txtCPF.getText(), end, 
    			date.toString(), ChoiceBoxSexo.getValue(), txtCelular.getText(), txtEmail.getText());
    	
    	ClienteBD clibd = new ClienteBD();
    	clibd.AtualizarLivro(cli);
    	
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemClientes.fxml"));
    	telaCadastroPane.getChildren().setAll(telaHomePane);
    }
    
    public void DefinirCliente(Cliente cliente) {
    	txtCodCliente.setText(String.valueOf(cliente.getIdCliente()));
    	txtNome.setText(cliente.getNome());
    	txtCPF.setText(cliente.getCpf());
    	ChoiceBoxSexo.setValue(cliente.getSexo());
    	
    	String data = cliente.getDataNascimento();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	LocalDate ld = LocalDate.parse(data, formatter);
    	
    	ChoiceBoxNascimento.setValue(ld);
    	txtCEP.setText(cliente.getEndereco().getCep());
    	ChoiceBoxUF.setValue(cliente.getEndereco().getUf());
    	txtCidade.setText(cliente.getEndereco().getCidade());
    	txtBairro.setText(cliente.getEndereco().getBairro());
    	txtEndereco.setText(cliente.getEndereco().getEndereco());
    	txtNum.setText(String.valueOf(cliente.getEndereco().getNumero()));
    	txtComplemento.setText(cliente.getEndereco().getComplemento());
    	txtFone.setText(cliente.getTelefone());
    	txtCelular.setText(cliente.getCelular());
    	txtEmail.setText(cliente.getEmail());
	}

}