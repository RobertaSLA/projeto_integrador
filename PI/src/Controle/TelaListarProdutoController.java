package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TelaListarProdutoController {

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnPesquisar;

    @FXML
    private TableColumn<?, ?> clmISBN;

    @FXML
    private TableColumn<?, ?> clmNomeVendedor;

    @FXML
    private TableColumn<?, ?> clmSKU;

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
