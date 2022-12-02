package Controle;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.List;
import Modelo.Fornecedor;
import Modelo.Livro;
import Modelo.Venda;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaListagemFornecedorController {
	
	@FXML
    private Button IDBotaoHome;
	
	 @FXML
	 private Button btnPesquisar;

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
    private Button btnHistoricoVenda;

    @FXML
    private Button btnRelatorio;

    @FXML
    private Button btnDevolucao;
    
    @FXML
    private Button btnCompraProdutos;

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
    private TextField txtPesquisarFornecedor;
    
    
    @FXML
    void ActionBotaoHome(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

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
    void ActionAlterarCliente(ActionEvent event) throws IOException {
    	Fornecedor fornecedor = tblListagem.getSelectionModel().getSelectedItem();
  	   
  	   
   	 	FXMLLoader loader = new FXMLLoader(
   	 		getClass().getResource(
   	 				"/visao/EditarFornecedor.fxml")
   	 	);  
   	 	
   	 
   	 	Node node;
   	 	node = (Node)loader.load();
   	 	
   	   
   	 	TelaEditarFornecedorController controller = loader.getController();
   	 	controller.DefinirFornecedor(fornecedor);

   	 	layoutListagem.getChildren().setAll(node);
    }

    @FXML
    void ActionExcluirCliente(ActionEvent event) throws SQLException {
    	FornecedorBD forbd = new FornecedorBD();
    	Fornecedor fornecedor = tblListagem.getSelectionModel().getSelectedItem();
    	tblListagem.getItems().remove(fornecedor);
    	forbd.DeletarFornecedor(fornecedor);    
    }

    @FXML
    void ActionPesquisarCliente(ActionEvent event) {

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
    void CompraProduto(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaCompra.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }


    @FXML
    void ConsultaLivro(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource("/visao/ListagemProdutos.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1601, 858);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ConsultaPreco(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHistoricoDePrecos.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
    @FXML
    void ConsultarFornecedor(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/ConsultarFornecedor.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void ConsultaVenda(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/RegistroVendas.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
    @FXML
    void HistoricoVenda(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/RegistroVendas.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
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
    void Pesquisar(ActionEvent event) throws SQLException {
    	FornecedorBD forn = new FornecedorBD();
		List<Fornecedor> l  = forn.BuscarFornecedor("%" + txtPesquisarFornecedor.getText() + "%");
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }
    
    @FXML
    void CriarRelatorio(ActionEvent event) throws FileNotFoundException, MalformedURLException, SQLException {
    	RelatorioFornecedor rel = new RelatorioFornecedor();
    	rel.Relatorio();
    }

    @FXML
    void PesquisarFornecedor(ActionEvent event) {

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
