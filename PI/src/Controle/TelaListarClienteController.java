
package Controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Modelo.Cliente;
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

public class TelaListarClienteController {

    @FXML
    private TableView<Cliente> TableView;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Button btnPesquisar;

    @FXML
    private TableColumn<Cliente, String> clmCPFCliente;

    @FXML
    private TableColumn<Cliente, String> clmCodCliente;

    @FXML
    private TableColumn<Cliente, String> clmNomeCliente;

    @FXML
    private AnchorPane telaCadastroPane;

    @FXML
    private TextField txtNome;

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
    void ConfirmarCadastro(ActionEvent event) throws IOException {
    		Cliente clie = TableView.getSelectionModel().getSelectedItem();
   	   
   	   
   	 		FXMLLoader loader = new FXMLLoader(
   	 				getClass().getResource(
   	 						"/visao/TelaVenda.fxml"
   	 					)
   	 		);  
   	 
   	 		Node node;
   	 		node = (Node)loader.load();
   	   
   	 		TelaVendaController controller = loader.getController();
   	 		System.out.println(controller);
   	 		controller.DefinirCliente(clie);

   	 		telaCadastroPane.getChildren().setAll(node);
    }

    @FXML
    void TableView(ActionEvent event) {

    }
    
    @FXML
    public void initialize() throws SQLException {
		ClienteBD cli = new ClienteBD();
		List<Cliente> l  = cli.BuscarCodCliente();
		
		clmCPFCliente.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		clmCodCliente.setCellValueFactory(new PropertyValueFactory<>("idCliente"));
		clmNomeCliente.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		
		TableView.setItems(FXCollections.observableArrayList(l));
		
	}

}

