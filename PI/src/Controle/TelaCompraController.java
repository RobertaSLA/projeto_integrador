package Controle;

	
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.Fornecedor;
import Modelo.Livro;
import Modelo.LivroCompra;
import Modelo.LivroVenda;
import Modelo.Vendedor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

	public class TelaCompraController {

	    @FXML
	    private ChoiceBox<String> ChoiceBoxCondicao; 
	    private String[] condicao = {"Boleto 60 dias", "Boleto 45 dias", "Boleto 30 dias", "Boleto 15 dias", "À vista"};
	   
	    
	    	

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
	    private Button btnCadastroFornecedor;

	    @FXML
	    private Button btnCadastroLivro;

	    @FXML
	    private Button btnClienteCadastro;

	    @FXML
	    private Button btnCodFornecedor;

	    @FXML
	    private Button btnCodProduto;

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
	    private Button btnExcluirItem;

	    @FXML
	    private Button btnInserirItem;

	    @FXML
	    private Button btnVendaConsulta;

	    @FXML
	    private TableColumn<LivroCompra, Integer> clmItem;

	    @FXML
	    private TableColumn<LivroCompra, Integer> clmQuantidadeItem;

	    @FXML
	    private TableColumn<LivroCompra, Integer> clmSKUCompra;

	    @FXML
	    private TableColumn<LivroCompra, String> clmTituloCompra;

	    @FXML
	    private TableColumn<LivroCompra, Float> clmValorTotalItem;

	    @FXML
	    private TableColumn<LivroCompra, Float> clmValorUnitario;

	    @FXML
	    private DatePicker dtDataCompra;

	    @FXML
	    private AnchorPane layoutListagem;

	    @FXML
	    private TableView<LivroCompra> tblCompra;

	    @FXML
	    private TextField txtCodFornecedor;

	    @FXML
	    private TextField txtCodProduto;

	    @FXML
	    private TextField txtDescriçãoProduto;

	    @FXML
	    private TextField txtNomeFornecedor;

	    @FXML
	    private TextField txtQtdItens;

	    @FXML
	    private TextField txtQuantidade;

	    @FXML
	    private TextField txtValorCompra;

	    @FXML
	    private TextField txtValorTotal;
	    
	    private ArrayList<LivroCompra> listaitens = new ArrayList<LivroCompra>();

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
	    void AcessoConsultaPreco(ActionEvent event) {

	    }

	    @FXML
	    void AcessoProcessamentoVenda(ActionEvent event) {

	    }

	    @FXML
	    void ActionBotaoHome(ActionEvent event) throws IOException {
	    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
	    	layoutListagem.getChildren().setAll(telaHomePane);
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
	    void CodFornecedor(ActionEvent event) throws IOException {
	    	FXMLLoader fxmlLoader = new FXMLLoader(
	    	    	   getClass().getResource(
	    	    			   "/visao/ListarFornecedor.fxml"
	    	    	   )
	    	    	 );
	    	        Node node;
	    	        Parent parent = fxmlLoader.load();
	    	        node = (Node) parent;
	    	        TelaListarFornecedorController controller = fxmlLoader.getController();
	    	        controller.setTelaCompraController(this);
	    	        Scene scene = new Scene(parent, 574, 473);
	    	        Stage stage = new Stage();
	    	        stage.setScene(scene);
	    	        stage.show();
	    }

	    @FXML
	    void CodProduto(ActionEvent event) throws IOException {
	    	FXMLLoader fxmlLoader = new FXMLLoader(
	    	    	   getClass().getResource(
	    	    			   "/visao/ListarProduto.fxml"
	    	    	   )
	    	    	 );
	    	        Node node;
	    	        Parent parent = fxmlLoader.load();
	    	        node = (Node) parent;
	    	        TelaListarProdutoController controller = fxmlLoader.getController();
	    	        controller.setTelaCompraController(this);
	    	        Scene scene = new Scene(parent, 574, 473);
	    	        Stage stage = new Stage();
	    	        stage.setScene(scene);
	    	        stage.show();
	    	        
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
	    void DataVenda(ActionEvent event) {

	    }

	    @FXML
	    void DescriçãoProduto(ActionEvent event) {

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
	    void ExcluirItem(ActionEvent event) {

	    }

	    @FXML
	    void InserirCodFornecedor(ActionEvent event) {

	    }

	    @FXML
	    void InserirCodProduto(ActionEvent event) {

	    }

	    @FXML
	    void InserirItem(ActionEvent event) {

	    }

	    @FXML
	    void NomeFornecedor(ActionEvent event) {

	    }

	    @FXML
	    void Quantidade(ActionEvent event) {

	    }

	    @FXML
	    void QuantidadeItensVenda(ActionEvent event) {

	    }

	    @FXML
	    void TabelaVenda(ActionEvent event) {

	    }

	    @FXML
	    void ValorTotal(ActionEvent event) {

	    }
	    
	    @FXML
	    public void initialize() throws SQLException { 
	    	clmItem.setCellValueFactory(new PropertyValueFactory<>("item"));
			clmSKUCompra.setCellValueFactory(new PropertyValueFactory<>("sku"));
			clmTituloCompra.setCellValueFactory(new PropertyValueFactory<>("titulo"));
			clmValorUnitario.setCellValueFactory(new PropertyValueFactory<>("valor"));
			clmValorTotalItem.setCellValueFactory(new PropertyValueFactory<>("valorTotal"));
			clmQuantidadeItem.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
			
			tblCompra.setItems(FXCollections.observableArrayList(listaitens));
			ChoiceBoxCondicao.getItems().addAll(condicao);
	    }

	    
	    public void addLivro(Livro livro) {
			txtCodProduto.setText(String.valueOf(livro.getSku()));
			txtDescriçãoProduto.setText(livro.getNome());
		}
	    
	    public void addFornecedor(Fornecedor fornecedor) {
			txtCodFornecedor.setText(String.valueOf(fornecedor.getIdFornecedor()));
			txtNomeFornecedor.setText(fornecedor.getNome());
		}
	}


