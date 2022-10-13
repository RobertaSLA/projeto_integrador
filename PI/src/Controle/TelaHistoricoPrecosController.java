package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TelaHistoricoPrecosController {

    @FXML
    private Button btnCancelarBusca;

    @FXML
    private Button btnPesquisarLivro;

    @FXML
    private TableColumn<?, ?> clmPrecoAntigo;

    @FXML
    private TableColumn<?, ?> clmPrecoAtual;

    @FXML
    private TableColumn<?, ?> clmSku;

    @FXML
    private TableColumn<?, ?> clmUltimaAlteracao;

    @FXML
    private TableColumn<?, ?> clmUsuarioAlterou;

    @FXML
    private TableView<?> tblHistoricodePrecos;

    @FXML
    private AnchorPane telaCadastroPane;

    @FXML
    private TextField txtPesquisarLivro;

    @FXML
    void CancelarBusca(ActionEvent event) {

    }

    @FXML
    void HistoricodePrecos(ActionEvent event) {

    }

    @FXML
    void PesquisarLivro(ActionEvent event) {

    }

}
