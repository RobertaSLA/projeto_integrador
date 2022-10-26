package Controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Modelo.Livro;
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
  	   
  	   
   	 	FXMLLoader loader = new FXMLLoader(
   	 			getClass().getResource(
   	 					"/visao/TelaVenda.fxml"
   	 			)
   	 	);  
   	 
   	 	Node node;
   	 	node = (Node)loader.load();
   	   
   	 	TelaVendaController controller = loader.getController();
   	 	System.out.println(controller);
   	 	controller.DefinirLivro(livro);

   	 	telaCadastroPane.getChildren().setAll(node);
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
    

}