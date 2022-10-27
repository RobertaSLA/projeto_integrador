package Controle;

import java.awt.event.KeyEvent;
import java.io.IOException;

import Modelo.Cliente;
import Modelo.Livro;
import Modelo.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    private TableColumn<?, ?> clmItem;

    @FXML
    private TableColumn<?, ?> clmPrecoVenda;

    @FXML
    private TableColumn<?, ?> clmSKUVenda;

    @FXML
    private TableColumn<?, ?> clmTituloVenda;

    @FXML
    private DatePicker dtDataVenda;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<?> tblVenda;

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
    }

    @FXML
    void CodProduto(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/visao/ListarProduto.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 574, 473);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void CodVendedor(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/visao/ListarVendedor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 574, 473);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void ActionEditarItem(ActionEvent event) {

    }
    
    @FXML
    void InserirItem(ActionEvent event) {

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
    void AvancarVenda(ActionEvent event) {

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

}
