package Controle;

import java.io.IOException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Modelo.Autor;
import Modelo.Livro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaListagemProdutoController {

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
    private Button btnVendaConsulta;

    @FXML
    private CheckBox chkAcaoAventura;

    @FXML
    private CheckBox chkAutoajuda;

    @FXML
    private CheckBox chkFiccao;

    @FXML
    private CheckBox chkGastronomia;

    @FXML
    private CheckBox chkRomance;

    @FXML
    private CheckBox chkTerror;

    @FXML
    private CheckBox chkValor1030;

    @FXML
    private CheckBox chkValor3050;

    @FXML
    private CheckBox chkValor5070;

    @FXML
    private CheckBox chkValor7090;

    @FXML
    private CheckBox chkValor90110;

    @FXML
    private CheckBox chkValorAcima110;

    @FXML
    private TableColumn<Autor, String> clmAutor;

    @FXML
    private TableColumn<Livro, String> clmEditora;

    @FXML
    private TableColumn<Livro, String> clmEstoque;

    @FXML
    private TableColumn<Livro, String> clmGenero;

    @FXML
    private TableColumn<Livro, String> clmISBN;

    @FXML
    private TableColumn<Livro, String> clmPreco;

    @FXML
    private TableColumn<Livro, String> clmSKU;

    @FXML
    private TableColumn<Livro, String> clmTitulo;

    @FXML
    private TitledPane filtroGenero;

    @FXML
    private TitledPane filtroPreco;
    
    @FXML
    private ImageView imgAlterar;

    @FXML
    private ImageView imgExcluir;

    @FXML
    private ImageView imgFiltro;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<Livro> tblListagem;

    @FXML
    private TextField txtPesquisarLivro;

    @FXML
    void AcaoAventura(ActionEvent event) {

    }

    @FXML
    void AcessoCadastroCliente(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroClientes.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void AcessoCadsatroProdutos(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void AcessoConsultaPreco(ActionEvent event) {

    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) {

    }
    
    @FXML
    void AlterarProduto(ActionEvent event) throws IOException {
    	Livro livro = tblListagem.getSelectionModel().getSelectedItem();
    	
    	
    	  Node node = (Node) event.getSource();
    	  // Step 3
    	  Stage stage = (Stage) node.getScene().getWindow();
    	  stage.setUserData(livro);
    	  
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/EditarProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void Autoajuda(ActionEvent event) {

    }

    @FXML
    void CadastroCliente(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroClientes.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void CadastroFornecedor(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroFornecedor.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void CadastroLivro(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void ConsultaCliente(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/ListagemClientes.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
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
    void Devolucao(ActionEvent event) {

    }

    @FXML
    void EmissaoNF(ActionEvent event) {

    }

    @FXML
    void EmissaoRelatorio(ActionEvent event) {

    }
    
    @FXML
    void ExcluirProduto(ActionEvent event) throws SQLException {
    	LivroBD livbd = new LivroBD();
    	Livro livro = tblListagem.getSelectionModel().getSelectedItem();
    	tblListagem.getItems().remove(livro);
    	livbd.DeletarLivro(livro);
    	
    }

    @FXML
    void Ficcao(ActionEvent event) {

    }

    @FXML
    void Gastronomia(ActionEvent event) {

    }

    @FXML
    void PesquisarLivro(ActionEvent event) {

    }

    @FXML
    void Romance(ActionEvent event) {

    }

    @FXML
    void Terror(ActionEvent event) {

    }

    @FXML
    void Valor1030(ActionEvent event) {

    }

    @FXML
    void Valor3050(ActionEvent event) {

    }

    @FXML
    void Valor5070(ActionEvent event) {

    }

    @FXML
    void Valor7090(ActionEvent event) {

    }

    @FXML
    void Valor90110(ActionEvent event) {

    }

    @FXML
    void ValorAcima110(ActionEvent event) {

    }
    
    @FXML
    public void initialize() throws SQLException {
		LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarLivro();
		
		clmAutor.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clmEditora.setCellValueFactory(new PropertyValueFactory<>("editora"));
		clmEstoque.setCellValueFactory(new PropertyValueFactory<>("estoque"));
		clmGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
		clmISBN.setCellValueFactory(new PropertyValueFactory<>("isbn"));
		clmPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));		
		clmSKU.setCellValueFactory(new PropertyValueFactory<>("sku"));
		clmTitulo.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		System.out.println(l.size());
		tblListagem.setItems(FXCollections.observableArrayList(l));
		
	}

}