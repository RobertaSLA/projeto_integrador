package Controle;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class TelaHomeController {

    @FXML
    private Button btnAcessoCadastroProduto;
    	
    @FXML
    private Button btnAcessoConsultaPreco;

    @FXML
    private Button btnAcessoVenda;

    @FXML
    private Button btnCadastroCliente;

    @FXML
    private Button btnCadastroFornecedor;

    @FXML
    private Button btnCadsatroLivros;

    @FXML
    private Button btnConsultaCliente;

    @FXML
    private Button btnConsultaLivros;

    @FXML
    private Button btnConsultaPreco;

    @FXML
    private Button btnConsultaVenda;

    @FXML
    private Button btnDevolucao;

    @FXML
    private Button btnEmissaoNF;

    @FXML
    private Button btnVenda;

    @FXML
    private Button btnaAcessoCadastroCliente;

    @FXML
    private AnchorPane idTelaHome;

    @FXML
    void AcessoCadastroCliente(ActionEvent event) {

    }

    @FXML
    void AcessoCadsatroProdutos(ActionEvent event) throws IOException {
    	AnchorPane telaCadastroPane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	idTelaHome.getChildren().setAll(telaCadastroPane);
    }

    @FXML
    void AcessoConsultaPreco(ActionEvent event) {

    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) {

    }

    @FXML
    void CadastroCliente(ActionEvent event) {

    }

    @FXML
    void CadastroFornecedor(ActionEvent event) {

    }

    @FXML
    void CadsatroLivros(ActionEvent event) {

    }

    @FXML
    void ConsultaCliente(ActionEvent event) {

    }

    @FXML
    void ConsultaPreco(ActionEvent event) {

    }

    @FXML
    void ConsultaVenda(ActionEvent event) {

    }

    @FXML
    void Devolucao(ActionEvent event) {

    }

    @FXML
    void EmissaoNF(ActionEvent event) {

    }

    @FXML
    void EmissaoRelatorio(ActionEvent event) {

    }

}
