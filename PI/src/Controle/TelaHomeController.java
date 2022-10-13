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
    private Button btnCadastroLivros;

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
    void AcessoCadastroCliente(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroClientes.fxml"));
    	idTelaHome.getChildren().setAll(telaHomePane);
    }

    @FXML
    void AcessoCadsatroProdutos(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	idTelaHome.getChildren().setAll(telaHomePane);
    }

    @FXML
    void AcessoConsultaPreco(ActionEvent event) {

    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) {

    }

    @FXML
    void CadastroCliente(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroClientes.fxml"));
    	idTelaHome.getChildren().setAll(telaHomePane);
    }

    @FXML
    void CadastroFornecedor(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroFornecedor.fxml"));
    	idTelaHome.getChildren().setAll(telaHomePane);
    }

    @FXML
    void CadastroLivros(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	idTelaHome.getChildren().setAll(telaHomePane);
    }

    @FXML
    void ConsultaCliente(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemClientes.fxml"));
    	idTelaHome.getChildren().setAll(telaHomePane);
    }

    @FXML
    void ConsultaLivro(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemProdutos.fxml"));
    	idTelaHome.getChildren().setAll(telaHomePane);
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
