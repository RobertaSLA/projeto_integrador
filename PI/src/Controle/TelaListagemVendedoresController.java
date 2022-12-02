package Controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Modelo.Cliente;
import Modelo.Fornecedor;
import Modelo.Livro;
import Modelo.Vendedor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    void AcessoCadastroCliente(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource("/visao/CadastroClientes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 650);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void AcessoCadsatroProdutos(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource("/visao/CadastroProdutos.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 650);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void AcessoConsultaPreco(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHistoricoDePrecos.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaVenda.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    

    @FXML
    void ActionAlterarVendedor(ActionEvent event) {

    }

    @FXML
    void ActionBotaoHome(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void ActionExcluirVendedor(ActionEvent event) throws SQLException {
    	VendedorBD vendbd = new VendedorBD();
    	Vendedor vendedor = tblListagemVendedor.getSelectionModel().getSelectedItem();
    	tblListagemVendedor.getItems().remove(vendedor);
    	vendbd.DeletarVendedor(vendedor);
    }

    @FXML
    void CadastroCliente(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource("/visao/CadastroClientes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 650);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void CadastroFornecedor(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource("/visao/CadastroFornecedor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 650);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void CadastroLivro(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource("/visao/CadastroProdutos.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 650);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ConsultaCliente(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemClientes.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void ConsultaLivro(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void HistoricoVenda(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/RegistroVendas.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void ConsultaPreco(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHistoricoDePrecos.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
    @FXML
    void ConsultaVenda(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/RegistroVendas.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
   
    @FXML
    void ConsultarFornecedor(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemFornecedor.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void CriarRelatorio(ActionEvent event) {

    }

    @FXML
    void Devolucao(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaDevolucao.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
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
		List<Vendedor> l  = vendbd.BuscarListagemVendedor();
		
		clmCodigo.setCellValueFactory(new PropertyValueFactory<>("idVendedor"));
		clmNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clmCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		clmCEP.setCellValueFactory(new PropertyValueFactory<>("cep"));
		clmTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));	
		clmComissao.setCellValueFactory(new PropertyValueFactory<>("comissao"));
		
		tblListagemVendedor.setItems(FXCollections.observableArrayList(l));
		
	
	}
    
    @FXML
    void btnPesquisarVendedor(ActionEvent event) throws SQLException {
    	VendedorBD ven = new VendedorBD();
		List<Vendedor> c  = ven.BuscarVendedor("%" + txtPesquisarVendedor.getText() + "%");
		
		tblListagemVendedor.setItems(FXCollections.observableArrayList(c));

    }
}
