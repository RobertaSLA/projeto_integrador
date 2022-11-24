package Controle;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import com.gluonhq.charm.glisten.control.TextArea;

import Modelo.Cliente;
import Modelo.Devolucao;
import Modelo.Fornecedor;
import Modelo.Compra;
import Modelo.Livro;
import Modelo.LivroCompra;
import Modelo.LivroDevolucao;
import Modelo.LivroVenda;
import Modelo.Venda;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaDevolucaoController {
	
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
    private Button btnCompraProdutos;
    
    @FXML
    private Button btnClienteCadastro;

    @FXML
    private Button btnCodCliente;
    
    @FXML
    private Button btnCodProduto;

    @FXML
    private Button btnCodVenda;

    @FXML
    private Button btnInserirItem;

    @FXML
    private Button btnConsultaCliente;

    @FXML
    private Button btnConsultaLivro;

    @FXML
    private Button btnConsultaPreco;

    @FXML
    private Button btnHistoricoVenda;

    @FXML
    private Button btnDevolucao;
    
    @FXML
    private Button btnConfirmar;

    @FXML
    private Button btnEmissaoNF;

    @FXML
    private Button btnEmissaoRelatorio;

    @FXML
    private Button btnExcluirItem;

    @FXML
    private Button btnVendaConsulta;

    @FXML
    private TableColumn<LivroDevolucao, Integer> clmItem;

    @FXML
    private TableColumn<LivroDevolucao, Float> clmPrecoVenda;

    @FXML
    private TableColumn<LivroDevolucao, Integer> clmSKUVenda;

    @FXML
    private TableColumn<LivroDevolucao, String> clmTituloVenda;

    @FXML
    private DatePicker dtDataDevolução;

    @FXML
    private DatePicker dtDataVenda;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<LivroDevolucao> tblVenda;

    @FXML
    private TextField txtCodCliente;

    @FXML
    private TextField txtCodProduto;

    @FXML
    private TextField txtCodVenda;

    @FXML
    private TextField txtDescricaoProduto;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TextField txtQtdItens;

    @FXML
    private TextField txtQuantidade;

    @FXML
    private TextField txtValorTotal;
    
    @FXML
    private TextField txtMotivo;
    
    private Devolucao devolucao = new Devolucao();
    
    private float valorItens;
    
    private float valorTotal;
    
    private int estoque;
    
    private float valorVenda;
    
    private ArrayList<LivroDevolucao> listaitens = new ArrayList<LivroDevolucao>();
    
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
    void CompraProduto(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaCompra.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaVenda.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
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
    void CodCliente(ActionEvent event) throws IOException {
    	 FXMLLoader fxmlLoader = new FXMLLoader(
  	    	   getClass().getResource(
  	    			   "/visao/ListarCliente.fxml"
  	    	   )
  	    	 );
  	        Node node;
  	        Parent parent = fxmlLoader.load();
  	        node = (Node) parent;
  	        TelaListarClienteController controller = fxmlLoader.getController();
  	        controller.setTelaDevolucaoController(this);
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
    	        controller.setTelaDevolucaoController(this);
    	        Scene scene = new Scene(parent, 574, 473);
    	        Stage stage = new Stage();
    	        stage.setScene(scene);
    	        stage.show();
    }

    @FXML
    void CodVenda(ActionEvent event) throws IOException {
    	 FXMLLoader fxmlLoader = new FXMLLoader(
  	    	   getClass().getResource(
  	    			   "/visao/ListarVenda.fxml"
  	    	   )
  	    	 );
  	        Node node;
  	        Parent parent = fxmlLoader.load();
  	        node = (Node) parent;
  	        TelaListarVendaController controller = fxmlLoader.getController();
  	        controller.setTelaDevolucaoController(this);
  	        Scene scene = new Scene(parent, 574, 473);
  	        Stage stage = new Stage();
  	        stage.setScene(scene);
  	        stage.show();
    }

    @FXML
    void InserirItem(ActionEvent event) throws NumberFormatException, SQLException {
    	LivroBD liv = new LivroBD();
    	Livro livro = liv.CriarLivro(Integer.valueOf(txtCodProduto.getText()));
    	
    	estoque = livro.getEstoque() + Integer.parseInt(txtQuantidade.getText());
		livro.setEstoque(estoque);
    	
    	valorItens = livro.getPreco() * Integer.parseInt(txtQuantidade.getText());
    	
    	LivroDevolucao livdev = new LivroDevolucao(devolucao, livro, Integer.parseInt(txtQuantidade.getText()),
    			valorItens);
    	
    	listaitens.add(livdev);
    	
    	valorTotal = Float.parseFloat(txtValorTotal.getText()) + valorItens;
    	txtValorTotal.setText(String.valueOf(valorTotal));
    	
    	tblVenda.setItems(FXCollections.observableArrayList(listaitens));
    	
    	txtCodProduto.setText(null);
    	txtDescricaoProduto.setText(null);
    	txtQuantidade.setText(null);
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
    void ConsultaPreco(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHistoricoDePrecos.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
    @FXML
    void Motivo(ActionEvent event) {

    }

    @FXML
    void HistoricoVenda(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/RegistroVendas.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void DataVenda(ActionEvent event) {

    }

    @FXML
    void DescricaoProduto(ActionEvent event) {

    }

    @FXML
    void Devolucao(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaDevolucao.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void EmissaoNF(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaCompra.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void EmissaoRelatorio(ActionEvent event) {

    }

    @FXML
    void ExcluirItem(ActionEvent event) {
    	LivroDevolucao livro = tblVenda.getSelectionModel().getSelectedItem();

    	listaitens.remove(livro);
    	tblVenda.setItems(FXCollections.observableArrayList(listaitens));
    }

    @FXML
    void InserirCodCliente(ActionEvent event) {

    }

    @FXML
    void InserirCodProduto(ActionEvent event) {

    }

    @FXML
    void InserirCodVenda(ActionEvent event) {

    }

    @FXML
    void NomeCliente(ActionEvent event) {

    }

    @FXML
    void Quantidade(ActionEvent event) {

    }

    @FXML
    void QuantidadeItens(ActionEvent event) {

    }

    @FXML
    void TabelaVenda(ActionEvent event) {

    }

    @FXML
    void ValorTotal(ActionEvent event) {

    }
    
    @FXML
    void Confirmar(ActionEvent event) throws SQLException, IOException {
    	LocalDate localdate = dtDataDevolução.getValue();
		Date date = Date.from(localdate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		devolucao.setData(date);
		
		devolucao.setMotivo(txtMotivo.getText());
		devolucao.setListaitens(listaitens);

		VendaBD vendbd = new VendaBD();
		devolucao.setVenda(vendbd.CriarVenda(Integer.parseInt(txtCodVenda.getText())));
		
		valorVenda = devolucao.getVenda().getValor() - Float.parseFloat(txtValorTotal.getText());
		
		vendbd.AtualizarVenda(valorVenda, devolucao.getVenda().getIdVenda());
		
		DevolucaoBD dev = new DevolucaoBD();
		dev.InserirDevolucao(devolucao);
		
		for (LivroDevolucao lv: devolucao.getListaitens()) {
			LivroBD livbd = new LivroBD();
			livbd.AtualizarEstoque(lv.getLivro().getSku(), lv.getLivro().getEstoque());
		}
		
		AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
    @FXML
    public void initialize() throws SQLException { 
    	clmItem.setCellValueFactory(new PropertyValueFactory<>("item"));
		clmSKUVenda.setCellValueFactory(new PropertyValueFactory<>("sku"));
		clmTituloVenda.setCellValueFactory(new PropertyValueFactory<>("titulo"));
		clmPrecoVenda.setCellValueFactory(new PropertyValueFactory<>("valor"));
		
		
		tblVenda.setItems(FXCollections.observableArrayList(listaitens));
    }

    
	public void addVenda(Venda venda) {
		txtCodVenda.setText(String.valueOf(venda.getIdVenda()));
	}

	public void addLivro(Livro livro) {
		txtCodProduto.setText(String.valueOf(livro.getSku()));
		txtDescricaoProduto.setText(livro.getNome());
	}

	public void addCliente(Cliente cliente) {
		txtCodCliente.setText(String.valueOf(cliente.getIdCliente()));
		txtNomeCliente.setText(cliente.getNome());
	}

}