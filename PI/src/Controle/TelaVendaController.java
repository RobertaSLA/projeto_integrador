package Controle;


import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

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
    private Button btnCompraProdutos;

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
    private Button btnHistoricoVenda;

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
    private TableColumn<LivroVenda, Integer> clmPrecoVenda;

    @FXML
    private TableColumn<LivroVenda, Integer> clmSKUVenda;

    @FXML
    private TableColumn<LivroVenda, Integer> clmTituloVenda;
    
    @FXML
    private TableColumn<LivroVenda, Float> clmDesconto;
    
    @FXML
    private TableColumn<LivroVenda, Integer> clmQuantidadeItem;
    
    @FXML
    private TableColumn<LivroVenda, Float> clmValorFinal;
    
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
    private TextField txtDescri????oProduto;

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
    
    private Float valorTotal;
    
    private Float valorItem;
    
    private Float valorDesconto;
    
    private Float valor;
    
    private Venda venda = new Venda();
    
	private ArrayList<LivroVenda> listaitens = new ArrayList<LivroVenda>();

	private int estoque;

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
    void CompraProduto(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaCompra.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
    @FXML
    void ConsultarFornecedor(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemFornecedor.fxml"));
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
    	
    	if (livro.getEstoque() > Integer.parseInt(txtQuantidade.getText())) {
    		estoque = livro.getEstoque() - Integer.parseInt(txtQuantidade.getText());
    		livro.setEstoque(estoque);
    		
    		valor = (livro.getPreco() - Float.parseFloat(txtDesconto.getText())) * Integer.parseInt(txtQuantidade.getText());
        	
        	LivroVenda livenda = new LivroVenda(livro, venda, Integer.parseInt(txtQuantidade.getText()),
        			Float.parseFloat(txtDesconto.getText()), valor);
        	
        	listaitens.add(livenda);
        	
        	tblVenda.setItems(FXCollections.observableArrayList(listaitens));
        	
        	valorItem = (livro.getPreco()- Float.parseFloat(txtDesconto.getText()))*Integer.valueOf(txtQuantidade.getText());
        
        	valorTotal = valorItem + Float.parseFloat(txtValorTotal.getText());
        	
        	valorDesconto = Float.parseFloat(txtDescontos.getText()) + Float.parseFloat(txtDesconto.getText());
        	
        	
        	txtValorTotal.setText(String.valueOf(valorTotal));
        	txtDescontos.setText(String.valueOf(valorDesconto));
        	txtCodProduto.setText(null);
        	txtDescri????oProduto.setText(null);
        	txtDesconto.setText(null);
        	txtQuantidade.setText(null);
    	} else {
    		JOptionPane.showMessageDialog(null, "Quantidade insuficiente em estoque");
    	}
    	
    	
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
    void DataVenda(ActionEvent event) {

    }

    @FXML
    void Descontos(ActionEvent event) {

    }

    @FXML
    void Descri????oProduto(ActionEvent event) {

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
    	Vendedor vend = new Vendedor(Integer.parseInt(txtCodVendedor.getText()));
    	Cliente cli = new Cliente(Integer.parseInt(txtCodCliente.getText()));
    	
		venda.setVendedor(vend);
		venda.setCliente(cli);
		venda.setValor(Float.parseFloat(txtValorTotal.getText()));
		venda.setDesconto(Float.parseFloat(txtDescontos.getText()));
		venda.setListaitens(listaitens);
		venda.setData(String.valueOf(dtDataVenda.getValue()));
	

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
		        Scene scene = new Scene(parent, 585, 545);
		        Stage stage = new Stage();
		        stage.setScene(scene);
		        stage.show();
		
		        AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
		    	layoutListagem.getChildren().setAll(telaHomePane);      
		
    }
    
    
    @FXML
    public void initialize() throws SQLException { 
		clmSKUVenda.setCellValueFactory(new PropertyValueFactory<>("idCompra"));
		clmTituloVenda.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clmPrecoVenda.setCellValueFactory(new PropertyValueFactory<>("preco"));
		clmDesconto.setCellValueFactory(new PropertyValueFactory<>("desconto"));
		clmQuantidadeItem.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
		clmValorFinal.setCellValueFactory(new PropertyValueFactory<>("valor"));
		
		tblVenda.setItems(FXCollections.observableArrayList(listaitens));
    }

	public void addLivro(Livro livro) {
		txtCodProduto.setText(String.valueOf(livro.getSku()));
		txtDescri????oProduto.setText(livro.getNome());
		
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
