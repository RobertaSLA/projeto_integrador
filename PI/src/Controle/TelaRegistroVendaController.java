package Controle;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import Modelo.Cliente;
import Modelo.Venda;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaRegistroVendaController {

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
    private Button btnAlterar;
    
    @FXML
    private Button btnExcluirFiltro;

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
    private Button btnPesquisar;

    @FXML
    private Button btnDevolucao;

    @FXML
    private Button btnEmissaoNF;

    @FXML
    private Button btnEmissaoRelatorio;

    @FXML
    private Button btnExcluir;
    
    @FXML
    private Button btnCadastroCliente;
    
    @FXML
    private Button btnRelatorio;
    
    @FXML
    private Button btnVendaConsulta;

    @FXML
    private CheckBox chkValor100;

    @FXML
    private CheckBox chkValor200;

    @FXML
    private CheckBox chkValor300;

    @FXML
    private CheckBox chkValor500;

    @FXML
    private CheckBox chkValor750;

    @FXML
    private CheckBox chkValorAcima1000;

    @FXML
    private TableColumn<Venda, String> clmCliente;

    @FXML
    private TableColumn<Venda, Integer> clmCodVenda;

    @FXML
    private TableColumn<Venda, Date> clmData;

    @FXML
    private TableColumn<Venda, Float> clmPreço;

    @FXML
    private TableColumn<Venda, Integer> clmQuantidade;
    
    @FXML
    private TableColumn<Venda, String> clmVendedor;


    @FXML
    private TitledPane filtroVendas;

    @FXML
    private ImageView imgAlterar;

    @FXML
    private ImageView imgExcluir;

    @FXML
    private ImageView imgFiltro;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<Venda> tblRegistroVendas;

    @FXML
    private TextField txtPesquisarVenda;

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
    void AcessoConsultaPreco(ActionEvent event)  throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHistoricoDePrecos.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaVenda.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
    }

    @FXML
    void ActionBotaoHome(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);

    }

    @FXML
    void AlterarProduto(ActionEvent event) {

    }
    
    @FXML
    void CriarRelatorio(ActionEvent event) {

    }
    
    @FXML
    void Pesquisar(ActionEvent event) {

    }
    
    @FXML
    void ExcluirFiltro(ActionEvent event) {

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
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemProdutos.fxml"));
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
    void ExcluirProduto(ActionEvent event) {

    }

    @FXML
    void PesquisarLivro(ActionEvent event) {

    }

    @FXML
    void Valor100(ActionEvent event) {

    }

    @FXML
    void Valor200(ActionEvent event) {

    }

    @FXML
    void Valor300(ActionEvent event) {

    }

    @FXML
    void Valor500(ActionEvent event) {

    }

    @FXML
    void Valor750(ActionEvent event) {

    }

    @FXML
    void ValorAcima1000(ActionEvent event) {

    }
    
    @FXML
    public void initialize() throws SQLException {
		VendaBD vendabd = new VendaBD();
		List<Venda> l  = vendabd.BuscarVendas();
		
		clmCodVenda.setCellValueFactory(new PropertyValueFactory<>("idVenda"));
		clmCliente.setCellValueFactory(new PropertyValueFactory<>("nomeCliente"));
		clmData.setCellValueFactory(new PropertyValueFactory<>("data"));
		clmPreço.setCellValueFactory(new PropertyValueFactory<>("valor"));
		clmVendedor.setCellValueFactory(new PropertyValueFactory<>("nomeVendedor"));		
		
		tblRegistroVendas.setItems(FXCollections.observableArrayList(l));
		

    }

}
