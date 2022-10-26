package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TelaListarClienteController {

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnPesquisar;

    @FXML
    private TableColumn<?, ?> clmCPFVendedor;

    @FXML
    private TableColumn<?, ?> clmCodCliente;

    @FXML
    private TableColumn<?, ?> clmNomeVendedor;

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

}
