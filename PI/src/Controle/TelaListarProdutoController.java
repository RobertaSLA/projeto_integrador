package Controle;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Modelo.Livro;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaListarProdutoController {

    @FXML
    private TableView<Livro> TableView;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Button btnPesquisar;

    @FXML
    private TableColumn<Livro, String> clmISBN;

    @FXML
    private TableColumn<Livro, String> clmNomeProduto;

    @FXML
    private TableColumn<Livro, String> clmSKU;

    @FXML
    private AnchorPane telaCadastroPane;

    @FXML
    private TextField txtNome;

	private TelaVendaController telaVendaController;

	private TelaCompraController telaCompraController;

	private TelaDevolucaoController telaDevolucaoController;

    @FXML
    void ActionPesquisarCodigoVendedor(ActionEvent event) {

    }

    @FXML
    void AdicionarNome(ActionEvent event) {

    }

    @FXML
    void CancelarCadastro(ActionEvent event) {

    }

    @FXML
    void ConfimarCadastro(ActionEvent event) throws IOException {
    	Livro livro = TableView.getSelectionModel().getSelectedItem();
    	this.telaVendaController.addLivro(livro);
    	Node source = (Node) event.getSource();
    	Stage stage = (Stage) source.getScene().getWindow();
    	stage.close();
    }

    @FXML
    void TableView(ActionEvent event) {

    }
    
    @FXML
    public void initialize() throws SQLException {
		LivroBD livr = new LivroBD();
		List<Livro> l  = livr.BuscarCodLivro();
		
		clmISBN.setCellValueFactory(new PropertyValueFactory<>("isbn"));
		clmNomeProduto.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clmSKU.setCellValueFactory(new PropertyValueFactory<>("sku"));
		
		
		TableView.setItems(FXCollections.observableArrayList(l));
		
	}

	public void setTelaVendaController(TelaVendaController telaVendaController) {
		this.telaVendaController=telaVendaController;
		
	}
	
	public void setTelaCompraController(TelaCompraController telaCompraController) {
		this.telaCompraController=telaCompraController;
		
	}
	
	public void setTelaDevolucaoController(TelaDevolucaoController telaDevolucaoController) {
		this.telaDevolucaoController=telaDevolucaoController;
		
	}
	
	
    

}
