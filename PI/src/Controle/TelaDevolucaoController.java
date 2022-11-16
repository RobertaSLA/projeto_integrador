package Controle;

import java.io.IOException;

import Modelo.LivroVenda;
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
    private Button btnClienteCadastro;

    @FXML
    private Button btnCodCliente;
    
    @FXML
    private Button btnCodProduto;

    @FXML
    private Button btnCodVenda;

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
    private Button btnVendaConsulta;

    @FXML
    private TableColumn<LivroVenda, Integer> clmItem;

    @FXML
    private TableColumn<LivroVenda, Float> clmPrecoVenda;

    @FXML
    private TableColumn<LivroVenda, Integer> clmSKUVenda;

    @FXML
    private TableColumn<LivroVenda, String> clmTituloVenda;

    @FXML
    private DatePicker dtDataDevolução;

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
    private TextField txtCodVenda;

    @FXML
    private TextField txtDescriçãoProduto;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TextField txtQtdItens;

    @FXML
    private TextField txtQuantidade;

    @FXML
    private TextField txtValorTotal;
    
    @FXML
    void ActionBotaoHome(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

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
    void CadastroCliente(ActionEvent event) {

    }

    @FXML
    void CadastroFornecedor(ActionEvent event) {

    }

    @FXML
    void CadastroLivro(ActionEvent event) {

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

}