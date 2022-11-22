package Controle;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import Modelo.Livro;
import Modelo.Venda;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

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
    private TableColumn<Venda, Date> clmlData;

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
		clmlID.setCellValueFactory(new PropertyValueFactory<>("data"));
		
		TableView.setItems(FXCollections.observableArrayList(vendas));
		
	}
	

}
