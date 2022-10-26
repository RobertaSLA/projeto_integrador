package Controle;

import java.sql.SQLException;
import java.util.List;

import Modelo.Fornecedor;
import Modelo.Vendedor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class TelaListarFornecedorController {

    @FXML
    private TableView<Fornecedor> TableView;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Button btnPesquisar;

    @FXML
    private TableColumn<Fornecedor, String> clmCNPJFornecedor;

    @FXML
    private TableColumn<Fornecedor, String> clmCodFornecedor;

    @FXML
    private TableColumn<Fornecedor, String> clmNomeFornecedor;

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
    void ConfimarCadastro(ActionEvent event) {

    }

    @FXML
    void TableView(ActionEvent event) {

    }
    
    @FXML
    public void initialize() throws SQLException {
		FornecedorBD forn = new FornecedorBD();
		List<Fornecedor> l  = forn.BuscarCodFornecedor();
		
		clmCodFornecedor.setCellValueFactory(new PropertyValueFactory<>("idFornecedor"));
		clmCNPJFornecedor.setCellValueFactory(new PropertyValueFactory<>("cnpj"));
		clmNomeFornecedor.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		
		TableView.setItems(FXCollections.observableArrayList(l));
		
	}

}

