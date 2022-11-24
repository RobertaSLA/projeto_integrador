package Controle;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import Modelo.Autor;
import Modelo.Livro;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
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
    private Button btnExcluirFiltro;

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
    private Button btnCompraProdutos;

    @FXML
    private Button btnHistoricoVenda;

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
    void ActionBotaoHome(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void AcaoAventura(ActionEvent event) throws SQLException {
    	
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosGeneroAcaoeAventura("%Aca%", "%Avent%");
		
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }

    @FXML
    void CompraProduto(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaCompra.fxml"));
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
    void AlterarProduto(ActionEvent event) throws IOException {
    	Livro livro = tblListagem.getSelectionModel().getSelectedItem();
    	   
    	   
    	 FXMLLoader loader = new FXMLLoader(
    	   getClass().getResource(
    	     "/visao/EditarProdutos.fxml"
    	   )
    	 );  
    	 
    	 Node node;
    	 node = (Node)loader.load();
    	   
    	 TelaEditarProdutoController controller = loader.getController();
    	 System.out.println(controller );
    	 controller.DefinirLivro(livro);

    	 layoutListagem.getChildren().setAll(node);
    	
    }

    @FXML
    void Autoajuda(ActionEvent event) throws SQLException {
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosGenero("%Auto%");
		
		tblListagem.setItems(FXCollections.observableArrayList(l));
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
    void HistoricoVenda(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/RegistroVendas.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }
    
    @FXML
    void ConsultaVenda(ActionEvent event) throws IOException {
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
    void ExcluirProduto(ActionEvent event) throws SQLException {
    	LivroBD livbd = new LivroBD();
    	Livro livro = tblListagem.getSelectionModel().getSelectedItem();
    	tblListagem.getItems().remove(livro);
    	livbd.DeletarLivro(livro);
    	
    }

    @FXML
    void Ficcao(ActionEvent event) throws SQLException {
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosGenero("%Fic%");
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }
    
    
    
    @FXML
    void ExcluirFiltro(ActionEvent event) throws SQLException {
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarLivro();
		
		tblListagem.setItems(FXCollections.observableArrayList(l));
    }
    
    @FXML
    void CriarRelatorio(ActionEvent event) throws FileNotFoundException, MalformedURLException, SQLException {
    	RelatorioProdutos rel = new RelatorioProdutos();
    	rel.Relatorio();
    }	
    
    @FXML
    void Gastronomia(ActionEvent event) throws SQLException {
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosGenero("%Gastro%");
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }
    
    @FXML
    void Pesquisar(ActionEvent event) throws SQLException {
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarLivro("%" + txtPesquisarLivro.getText() + "%");
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }


    @FXML
    void PesquisarLivro(ActionEvent event) {
    }

    @FXML
    void Romance(ActionEvent event) throws SQLException {
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosGenero("%Roman%");
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }

    @FXML
    void Terror(ActionEvent event) throws SQLException {
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosGenero("%Terr%");
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }

    @FXML
    void Valor1030(ActionEvent event) throws SQLException {
    	
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosPreco(10, 30);
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }

    @FXML
    void Valor3050(ActionEvent event) throws SQLException {
    	
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosPreco(30, 50);
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }

    @FXML
    void Valor5070(ActionEvent event) throws SQLException {
    	
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosPreco(50, 70);
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }

    @FXML
    void Valor7090(ActionEvent event) throws SQLException {
    	
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosPreco(70, 90);
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }

    @FXML
    void Valor90110(ActionEvent event) throws SQLException {
    	
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosPreco(90, 110);
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }

    @FXML
    void ValorAcima110(ActionEvent event) throws SQLException {
    	
    	LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarFiltrosPrecoAcima110(110);
		
		tblListagem.setItems(FXCollections.observableArrayList(l));

    }
    
    @FXML
    public void initialize() throws SQLException {
		LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarLivro();
		
		clmAutor.setCellValueFactory(new PropertyValueFactory<>("nomeAutor"));
		clmEditora.setCellValueFactory(new PropertyValueFactory<>("editora"));
		clmEstoque.setCellValueFactory(new PropertyValueFactory<>("estoque"));
		clmGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
		clmISBN.setCellValueFactory(new PropertyValueFactory<>("isbn"));
		clmPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));		
		clmSKU.setCellValueFactory(new PropertyValueFactory<>("sku"));
		clmTitulo.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		
		tblListagem.setItems(FXCollections.observableArrayList(l));
		
	}

}