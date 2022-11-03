package Controle;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Cliente;
import Modelo.Livro;
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
    private DatePicker dtDataVenda;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<Livro> tblVenda;

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
    
    private ObservableList<Livro> listaItens = FXCollections.observableArrayList();
    
    private Venda venda = new Venda();
    
    
    @FXML
    void ActionBotaoHome(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaVenda.fxml"));
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
    void ConsultarFornecedor(ActionEvent event) {

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
    void CodCliente(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/visao/ListarCliente.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 574, 473);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        venda.setIdCliente(1);
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
        controller.setVenda(venda);
        controller.setTelaVendaController(this);
        Scene scene = new Scene(parent, 574, 473);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    void CodVendedor(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/visao/ListarVendedor.fxml"));
        TelaListarVendedorController controller = fxmlLoader.getController();
        controller.setVenda(venda);
        Scene scene = new Scene(fxmlLoader.load(), 574, 473);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        venda.setIdVendedor(1);
    }


    @FXML
    void ActionEditarItem(ActionEvent event) {

    }
    
    @FXML
    void InserirItem(ActionEvent event) throws SQLException {
    	LivroBD liv = new LivroBD();
    	Livro livro = liv.CriarLivro(Integer.valueOf(txtCodProduto.getText()));
    	
    	listaItens.add(livro);
    	
    	ValorItem = livro.getPreco()*Integer.valueOf(txtQuantidade.getText());
    
    	ValorTotal = ValorItem + Float.parseFloat(txtValorTotal.getText());
    	System.out.println(ValorTotal);
    	txtValorTotal.setText(String.valueOf(ValorTotal));
    	tblVenda.refresh();
    }
    
    @FXML
    void ConfirmarProduto(ActionEvent event) {

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
    	Livro livro = tblVenda.getSelectionModel().getSelectedItem();
    	listaItens.remove(livro);
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
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaPagamento.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
    public void DefinirVendedor(Vendedor vendedor) {
    	txtCodVendedor.setText(String.valueOf(vendedor.getIdVendedor()));
    	txtNomeVendedor.setText(String.valueOf(vendedor.getNome()));
    	
	}
    
    public void DefinirCliente(Cliente cliente) {
    	txtCodCliente.setText(String.valueOf(cliente.getIdCliente()));
    	txtNomeCliente.setText(String.valueOf(cliente.getNome()));
	}
    
    public void DefinirLivro(Livro livro) {
    	txtCodProduto.setText(String.valueOf(livro.getSku()));
    	txtDescriçãoProduto.setText(String.valueOf(livro.getNome()));
	}
    
    @FXML
    public void initialize() throws SQLException {
		
		clmSKUVenda.setCellValueFactory(new PropertyValueFactory<>("sku"));
		clmTituloVenda.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clmPrecoVenda.setCellValueFactory(new PropertyValueFactory<>("preco"));
		
		tblVenda.setItems(listaItens);
    }

	public void addLivro(Livro livro) {
		System.out.println(livro);
		listaItens.add(livro);
		tblVenda.refresh();
		
	}
    
}
