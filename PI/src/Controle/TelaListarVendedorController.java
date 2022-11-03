
package Controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Modelo.Livro;
import Modelo.Venda;
import Modelo.Vendedor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaListarVendedorController {

    @FXML
    private TableView<Vendedor> TableView;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Button btnPesquisar;

    @FXML
    private TableColumn<Vendedor, String> clmCPFVendedor;

    @FXML
    private TableColumn<Vendedor, Integer> clmCodVendedor;

    @FXML
    private TableColumn<Vendedor, String> clmNomeVendedor;

    @FXML
    private AnchorPane telaCadastroPane;

    @FXML
    private TextField txtNome;

	private Venda venda;

	private TelaVendaController telaVendaController ;

    @FXML
    void ActionPesquisarCodigoVendedor(ActionEvent event) {

    }

    @FXML
    void AdicionarNome(ActionEvent event) {

    }

    @FXML
    void CancelarCadastro(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/TelaVenda.fxml"));
    	telaCadastroPane.getChildren().setAll(telaListagemPane);
    }

    @FXML
    void ConfimarCadastro(ActionEvent event) throws IOException {
    	
    	Vendedor vendedor = TableView.getSelectionModel().getSelectedItem();
    	this.telaVendaController.addVendedor(vendedor);
    	Node source = (Node) event.getSource();
    	Stage stage = (Stage) source.getScene().getWindow();
    	stage.close();


    }

    @FXML
    void TableView(ActionEvent event) {

    }
    
    @FXML
    public void initialize() throws SQLException {
		VendedorBD vend = new VendedorBD();
		List<Vendedor> l  = vend.BuscarVendedor();
		
		clmCPFVendedor.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		clmCodVendedor.setCellValueFactory(new PropertyValueFactory<>("idVendedor"));
		clmNomeVendedor.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		
		TableView.setItems(FXCollections.observableArrayList(l));
		
	}

	public void setVenda(Venda venda) {
		this.venda=venda;
		
	}

	public void setTelaVendaController(TelaVendaController telaVendaController) {
		this.telaVendaController = telaVendaController;
		
	}
    

}

