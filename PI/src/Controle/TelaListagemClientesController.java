package Controle;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Modelo.Cliente;
import Modelo.Endereco;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaListagemClientesController {
	
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
    private Button btnPesquisarCliente;

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
    private TableColumn<Endereco, String> clmCEP;

    @FXML
    private TableColumn<Cliente, String> clmCPF;

    @FXML
    private TableColumn<Cliente, String> clmCodigo;

    @FXML
    private TableColumn<Cliente, String> clmEmail;

    @FXML
    private TableColumn<Cliente, String> clmNome;

    @FXML
    private TableColumn<Cliente, String> clmTelefone;

    @FXML
    private TitledPane filtroCompras;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<Cliente> tblListagemCliente;

    @FXML
    private TextField txtPesquisarCliente;
    
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
    void AcessoConsultaPreco(ActionEvent event) {

    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) {

    }
    
    @FXML
    void Pesquisar(ActionEvent event) {

    }

    @FXML
    void ActionAlterarCliente(ActionEvent event) throws IOException {
    	Cliente cliente = tblListagemCliente.getSelectionModel().getSelectedItem();
 	   
 	   
   	 	FXMLLoader loader = new FXMLLoader(
   	 		getClass().getResource(
   	 				"/visao/EditarCliente.fxml")
   	 	);  
   	 
   	 	Node node;
   	 	node = (Node)loader.load();
   	 	
   	   
   	 	TelaEditarClienteController controller = loader.getController();
   	 	System.out.println(controller);
   	 	controller.DefinirCliente(cliente);

   	 	layoutListagem.getChildren().setAll(node);
    }

    @FXML
    void ActionExcluirCliente(ActionEvent event) throws SQLException {
    	ClienteBD clibd = new ClienteBD();
    	Cliente cliente = tblListagemCliente.getSelectionModel().getSelectedItem();
    	tblListagemCliente.getItems().remove(cliente);
    	clibd.DeletarCliente(cliente);
    }

    @FXML
    void ActionPesquisarCliente(ActionEvent event) {

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
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource("/visao/ListagemClientes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 837);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ConsultaLivro(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource("/visao/ListagemProdutos.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 858);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
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
    void PesquisarCliente(ActionEvent event) {

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
		ClienteBD clibd = new ClienteBD();
		List<Cliente> l  = clibd.BuscarCliente();
		
		clmCodigo.setCellValueFactory(new PropertyValueFactory<>("idCliente"));
		clmNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clmCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		clmEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		clmTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		clmCEP.setCellValueFactory(new PropertyValueFactory<>("CEP"));		
		
		tblListagemCliente.setItems(FXCollections.observableArrayList(l));
		

    }

}