package Controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import Modelo.Fornecedor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class TelaListagemFornecedorController {

    @FXML
    private Button btnAcessoCadastroCliente;

    @FXML
    private Button btnAcessoCadastroProduto;

    @FXML
    private Button btnAcessoConsultaPreco;

    @FXML
    private Button btnAcessoVenda;

    @FXML
    private Button btnAlterar;

    @FXML
    private Button btnCadastroFornecedor;

    @FXML
    private Button btnCadastroLivro;

    @FXML
    private Button btnClienteCadastro;

    @FXML
    private Button btnConsultaCliente;

    @FXML
    private Button btnConsultaLivro;

    @FXML
    private Button btnConsultaPreco;

    @FXML
    private Button btnConsultaVenda;

    @FXML
    private Button btnDevolucao;

    @FXML
    private Button btnEmissaoNF;

    @FXML
    private Button btnEmissaoRelatorio;

    @FXML
    private Button btnExcluir;

    @FXML
    private Button btnPesquisarCliente;

    @FXML
    private Button btnVendaConsulta;

    @FXML
    private TableColumn<Fornecedor, String> clmCNPJ;

    @FXML
    private TableColumn<Fornecedor, Integer> clmCodigo;

    @FXML
    private TableColumn<Fornecedor, String> clmEmail;

    @FXML
    private TableColumn<Fornecedor, String> clmInsEstadual;

    @FXML
    private TableColumn<Fornecedor, String> clmNome;

    @FXML
    private TableColumn<Fornecedor, String> clmTelefone;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<Fornecedor> tblListagem;

    @FXML
    private TextField txtPesquisarLivro;

    @FXML
    void AcessoCadastroCliente(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroClientes.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void AcessoCadsatroProdutos(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void AcessoConsultaPreco(ActionEvent event) {

    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) {

    }

    @FXML
    void ActionAlterarCliente(ActionEvent event) {

    }

    @FXML
    void ActionExcluirCliente(ActionEvent event) {

    }

    @FXML
    void ActionPesquisarCliente(ActionEvent event) {

    }

    @FXML
    void CadastroCliente(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroClientes.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void CadastroFornecedor(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroFornecedor.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void CadastroLivro(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void ConsultaCliente(ActionEvent event) {

    }

    @FXML
    void ConsultaLivro(ActionEvent event) {

    }

    @FXML
    void ConsultaPreco(ActionEvent event) {

    }

    @FXML
    void ConsultaVenda(ActionEvent event) {

    }

    @FXML
    void Devolucao(ActionEvent event) {

    }

    @FXML
    void EmissaoNF(ActionEvent event) {

    }

    @FXML
    void EmissaoRelatorio(ActionEvent event) {

    }

    @FXML
    void PesquisarLivro(ActionEvent event) {

    }

    
    @FXML
    public void initialize() throws SQLException {
		FornecedorBD forbd = new FornecedorBD();
		List<Fornecedor> l  = forbd.BuscarFornecedor();
		
		clmCodigo.setCellValueFactory(new PropertyValueFactory<>("idFornecedor"));
		clmNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clmCNPJ.setCellValueFactory(new PropertyValueFactory<>("cnpj"));
		clmInsEstadual.setCellValueFactory(new PropertyValueFactory<>("insEstadual"));
		clmEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		clmTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));	
		
		
		tblListagem.setItems(FXCollections.observableArrayList(l));
		
	}
}
