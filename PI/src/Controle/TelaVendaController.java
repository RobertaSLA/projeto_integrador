package Controle;


import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import Modelo.Cliente;
import Modelo.Livro;
import Modelo.LivroVenda;
import Modelo.Venda;
import Modelo.Vendedor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class TelaVendaController {
	
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
    private Button btnCodCliente;

    @FXML
    private Button btnCodProduto;

    @FXML
    private Button btnCodVendedor;

    @FXML
    private Button btnConfirmar;

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
    private Button btnEditarItem;
    
    @FXML
    private Button btnInserirItem;

    @FXML
    private Button btnVendaConsulta;

    @FXML
    private TableColumn<TelaVendaController, Integer> clmItem;

    @FXML
    private TableColumn<Livro, Integer> clmPrecoVenda;

    @FXML
    private TableColumn<Livro, Integer> clmSKUVenda;

    @FXML
    private TableColumn<Livro, Integer> clmTituloVenda;
    
    @FXML
    private TextField txtDesconto;

    @FXML
    private DatePicker dtDataVenda;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<LivroVenda> tblVenda;

    @FXML
    private TextField txtCodCliente;

    @FXML
    private TextField txtCodProduto;

    @FXML
    private TextField txtCodVendedor;

    @FXML
    private TextField txtDescontos;

    @FXML
    private TextField txtDescriçãoProduto;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TextField txtNomeVendedor;

    @FXML
    private TextField txtQtdItens;

    @FXML
    private TextField txtQuantidade;

    @FXML
    private TextField txtValorTotal;
    
    @FXML
    private Button btnAvancar;
    
    @FXML
    private Button btnConsultaFornecedor;
    
    private Float ValorTotal;
    
    private Float ValorItem;
    
    private Float ValorDesconto;
    
    private int Item;
    
    private Venda venda = new Venda();
    
    @FXML
    void ActionBotaoHome(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void AcessoCadastroCliente(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroClientes.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void AcessoCadsatroProdutos(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void AcessoConsultaPreco(ActionEvent event) {

    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) {

    }
    
    @FXML
    void ConsultarFornecedor(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemFornecedor.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void CadastroCliente(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroClientes.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void CadastroFornecedor(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroFornecedor.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void CadastroLivro(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
    @FXML
    void Desconto(ActionEvent event) {

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
       controller.setTelaVendaController(this);
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
        controller.setTelaVendaController(this);
        Scene scene = new Scene(parent, 574, 473);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    void CodVendedor(ActionEvent event) throws IOException {
    	 FXMLLoader fxmlLoader = new FXMLLoader(
    	    	   getClass().getResource(
    	    			   "/visao/ListarVendedor.fxml"
    	    	   )
    	    	 );
    	        Node node;
    	        Parent parent = fxmlLoader.load();
    	        node = (Node) parent;
    	        TelaListarVendedorController controller = fxmlLoader.getController();
    	        controller.setTelaVendaController(this);
    	        Scene scene = new Scene(parent, 574, 473);
    	        Stage stage = new Stage();
    	        stage.setScene(scene);
    	        stage.show();
    }


    @FXML
    void ActionEditarItem(ActionEvent event) {

    }
    
    @FXML
    void InserirItem(ActionEvent event) throws SQLException {
    	LivroBD liv = new LivroBD();
    	Livro livro = liv.CriarLivro(Integer.valueOf(txtCodProduto.getText()));
    	
    	LivroVenda livenda = new LivroVenda(livro, venda, Integer.parseInt(txtQuantidade.getText()));
    	
    	venda.getListaitens().add(livenda);
    	
    	tblVenda.refresh();
    	
    	ValorItem = (livro.getPreco()- Float.parseFloat(txtDesconto.getText()))*Integer.valueOf(txtQuantidade.getText());
    
    	ValorTotal = ValorItem + Float.parseFloat(txtValorTotal.getText());
    	
    	ValorDesconto = Float.parseFloat(txtDescontos.getText()) + Float.parseFloat(txtDesconto.getText());
    	
    	
    	txtValorTotal.setText(String.valueOf(ValorTotal));
    	txtDescontos.setText(String.valueOf(ValorDesconto));
    	txtQtdItens.setText(String.valueOf(Item));
    	txtCodProduto.setText(null);
    	txtDescriçãoProduto.setText(null);
    	txtDesconto.setText(null);
    	txtQuantidade.setText(null);
    }
    
    @FXML
    void ConfirmarProduto(ActionEvent event) {

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
    void ConsultaPreco(ActionEvent event) {

    }

    @FXML
    void ConsultaVenda(ActionEvent event) {

    }

    @FXML
    void DataVenda(ActionEvent event) {

    }

    @FXML
    void Descontos(ActionEvent event) {

    }

    @FXML
    void DescriçãoProduto(ActionEvent event) {

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
    void ExcluirItem(ActionEvent event) {
    	LivroVenda livro = tblVenda.getSelectionModel().getSelectedItem();
    	venda.getListaitens().remove(livro);
    	tblVenda.refresh();
    }

    @FXML
    void InserirCodCliente(ActionEvent event) {
    	
    }

    @FXML
    void InserirCodProduto(ActionEvent event) {

    }

    @FXML
    void InserirCodVendedor(ActionEvent event) {

    }
    

    @FXML
    void NomeCliente(ActionEvent event) {

    }

    @FXML
    void NomeVendedor(ActionEvent event) {

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
    void AvancarVenda(ActionEvent event) throws IOException {
		venda.setSkuLivro(Integer.parseInt(txtCodProduto.getText()));
		venda.setIdVendedor(Integer.parseInt(txtCodVendedor.getText()));
		venda.setIdCliente(Integer.parseInt(txtCodCliente.getText()));
		venda.setValor(Float.parseFloat(txtValorTotal.getText()));
		venda.setDesconto(Float.parseFloat(txtDescontos.getText()));
		
		LocalDate localdate = dtDataVenda.getValue();
		Date date = (Date) Date.from(localdate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		venda.setData(date);
		
		FXMLLoader fxmlLoader = new FXMLLoader(
		    	   getClass().getResource(
		    			   "/visao/TelaPagamento.fxml"
		    	   )
		    	 );
		        Node node;
		        Parent parent = fxmlLoader.load();
		        node = (Node) parent;
		        TelaFormaPagamentoController controller = fxmlLoader.getController();
		        controller.setVenda(venda);
		        Scene scene = new Scene(parent, 574, 473);
		        Stage stage = new Stage();
		        stage.setScene(scene);
		        stage.show();
    }
    
    
    @FXML
    public void initialize() throws SQLException { 
		clmSKUVenda.setCellValueFactory(new PropertyValueFactory<>("sku"));
		clmTituloVenda.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clmPrecoVenda.setCellValueFactory(new PropertyValueFactory<>("preco"));
		
		tblVenda.setItems(FXCollections.observableArrayList(venda.getListaitens()));
    }

	public void addLivro(Livro livro) {
		txtCodProduto.setText(String.valueOf(livro.getSku()));
		txtDescriçãoProduto.setText(livro.getNome());
		
	}

	public void addVendedor(Vendedor vendedor) {
		txtCodVendedor.setText(String.valueOf(vendedor.getIdVendedor()));
		txtNomeVendedor.setText(vendedor.getNome());

	}

	public void addCliente(Cliente cliente) {
		txtCodCliente.setText(String.valueOf(cliente.getIdCliente()));
		txtNomeCliente.setText(String.valueOf(cliente.getNome()));
		
	}
    
}
