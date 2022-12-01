package Controle;

import java.sql.SQLException;
import java.util.List;

import Modelo.Fornecedor;
import Modelo.Vendedor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class TelaListagemVendedoresController {

    @FXML
    private Button IDBotaoHome;

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
    private Button btnConsultaFornecedor;

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
    private Button btnRelatorio;

    @FXML
    private Button btnVendaConsulta;

    @FXML
    private TableColumn<Vendedor, String> clmCEP;

    @FXML
    private TableColumn<Vendedor, String> clmCPF;

    @FXML
    private TableColumn<Vendedor, Integer> clmCodigo;

    @FXML
    private TableColumn<Vendedor, Float> clmComissao;

    @FXML
    private TableColumn<Vendedor, String> clmEmail;

    @FXML
    private TableColumn<Vendedor, String> clmNome;

    @FXML
    private TableColumn<Vendedor, String> clmTelefone;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<Vendedor> tblListagemVendedor;

    @FXML
    private TextField txtPesquisarVendedor;

    @FXML
    void AcessoCadastroCliente(ActionEvent event) {

    }

    @FXML
    void AcessoCadsatroProdutos(ActionEvent event) {

    }

    @FXML
    void AcessoConsultaPreco(ActionEvent event) {

    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) {

    }

    @FXML
    void ActionAlterarVendedor(ActionEvent event) {

    }

    @FXML
    void ActionBotaoHome(ActionEvent event) {

    }

    @FXML
    void ActionExcluirVendedor(ActionEvent event) {

    }

    @FXML
    void CadastroCliente(ActionEvent event) {

    }

    @FXML
    void CadastroFornecedor(ActionEvent event) {

    }

    @FXML
    void CadastroLivro(ActionEvent event) {

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
    void ConsultarFornecedor(ActionEvent event) {

    }

    @FXML
    void CriarRelatorio(ActionEvent event) {

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
    public void initialize() throws SQLException {
		VendedorBD vendbd = new VendedorBD();
		List<Vendedor> l  = vendbd.BuscarVendedor();
		
		clmCodigo.setCellValueFactory(new PropertyValueFactory<>("idVendedor"));
		clmNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clmCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		clmCEP.setCellValueFactory(new PropertyValueFactory<>("cep"));
		clmEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		clmTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));	
		clmComissao.setCellValueFactory(new PropertyValueFactory<>("comissao"));
		
		tblListagemVendedor.setItems(FXCollections.observableArrayList(l));
		
	}
}
