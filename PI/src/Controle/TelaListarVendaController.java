package Controle;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import Modelo.Livro;
import Modelo.Venda;
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

public class TelaListarVendaController {

    @FXML
    private TableView<Venda> TableView;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Button btnPesquisar;

    @FXML
    private TableColumn<Venda, String> clmNomeCliente;

    @FXML
    private TableColumn<Venda, Float> clmValor;

    @FXML
    private TableColumn<Venda, Integer> clmlID;

    @FXML
    private AnchorPane telaCadastroPane;

    @FXML
    private TextField txtNome;

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
    void ConfimarCadastro(ActionEvent event) {
    	Venda venda = TableView.getSelectionModel().getSelectedItem();
    	this.telaDevolucaoController.addVenda(venda);
    	Node source = (Node) event.getSource();
    	Stage stage = (Stage) source.getScene().getWindow();
    	stage.close();
    }

    @FXML
    void TableView(ActionEvent event) {

    }
    
	public void setTelaDevolucaoController(TelaDevolucaoController telaDevolucaoController) {
		this.telaDevolucaoController=telaDevolucaoController;
		
	}
	
	@FXML
    public void initialize() throws SQLException {
		VendaBD vend = new VendaBD();
		List<Venda> vendas = vend.BuscarVendas();
		
		clmlID.setCellValueFactory(new PropertyValueFactory<>("idVenda"));
		clmNomeCliente.setCellValueFactory(new PropertyValueFactory<>("nomeCliente"));
		clmValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
		
		TableView.setItems(FXCollections.observableArrayList(vendas));
		
	}
	

}
