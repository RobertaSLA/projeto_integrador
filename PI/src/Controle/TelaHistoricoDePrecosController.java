package Controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Modelo.HistoricoDePrecos;
import Modelo.Livro;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaHistoricoDePrecosController {

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
    private Button btnConsultaCliente;

    @FXML
    private Button btnConsultaLivro;

    @FXML
    private Button btnConsultaPreco;

    @FXML
    private Button btnConsultaVenda;

    @FXML
    private Button btnConsultarHistorico;

    @FXML
    private Button btnDevolucao;

    @FXML
    private Button btnEmissaoNF;

    @FXML
    private Button btnEmissaoRelatorio;

    @FXML
    private Button btnPesquisarSKU;

    @FXML
    private Button btnVendaConsulta;

    @FXML
    private TableColumn<HistoricoDePrecos, String> clmNomeUsuario;

    @FXML
    private TableColumn<HistoricoDePrecos, Float> clmPrecoAnterior;

    @FXML
    private TableColumn<HistoricoDePrecos, Float> clmPrecoAtual;

    @FXML
    private TableColumn<HistoricoDePrecos, Integer> clmSKU;

    @FXML
    private TableColumn<HistoricoDePrecos, String> clmTituloLivro;

    @FXML
    private TableColumn<HistoricoDePrecos, String> clmUltimaAlteracao;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<HistoricoDePrecos> tblHistoricoPrecos;

    @FXML
    private TextField txtSKULivro;

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
    void ActionBotaoHome(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/TelaHome.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
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
    void ConsultarHistorico(ActionEvent event) throws NumberFormatException, SQLException {
    	HistoricoDePrecosBD hist = new HistoricoDePrecosBD();
    	List<HistoricoDePrecos> l  = hist.BuscarHistoricoSKU(Integer.parseInt(txtSKULivro.getText()));
    	tblHistoricoPrecos.setItems(FXCollections.observableArrayList(l));
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
    void HistoricoDePrecos(ActionEvent event) {

    }
    
    @FXML
    void SKULivro(ActionEvent event) {
    	System.out.println("oie");
    }
    
    @FXML
    void PesquisarSKU(ActionEvent event) throws IOException {
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(
 	    	   getClass().getResource(
 	    			   "/visao/ListarProduto.fxml"
 	    	   )
 	    	 );
 	        Node node;
 	        Parent parent = fxmlLoader.load();
 	        node = (Node) parent;
 	        TelaListarProdutoController controller = fxmlLoader.getController();
 	        controller.setTelaHistoricoDePrecosController(this);
 	        Scene scene = new Scene(parent, 574, 473);
 	        Stage stage = new Stage();
 	        stage.setScene(scene);
 	        stage.show();
 	        
    }


    
    @FXML
    public void initialize() throws SQLException {
    	HistoricoDePrecosBD hist = new HistoricoDePrecosBD();
		List<HistoricoDePrecos> l  = hist.BuscarHistorico();
		
		clmSKU.setCellValueFactory(new PropertyValueFactory<>("skuLivro"));
		clmTituloLivro.setCellValueFactory(new PropertyValueFactory<>("livro"));
		clmPrecoAnterior.setCellValueFactory(new PropertyValueFactory<>("precoAnterior"));
		clmPrecoAtual.setCellValueFactory(new PropertyValueFactory<>("precoAtual"));
		clmUltimaAlteracao.setCellValueFactory(new PropertyValueFactory<>("dataAlteracao"));
		
		tblHistoricoPrecos.setItems(FXCollections.observableArrayList(l));
		
	}

	public void addLivro(Livro livro) {
		txtSKULivro.setText(String.valueOf(livro.getSku()));
	}
	

}
