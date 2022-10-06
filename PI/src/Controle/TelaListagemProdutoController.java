package Controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Modelo.Autor;
import Modelo.Livro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class TelaListagemProdutoController {

    @FXML
    private Button btnAcessoCadastroCliente;

    @FXML
    private Button btnAcessoCadastroProduto;

    @FXML
    private Button btnAcessoConsultaPreco;

    @FXML
    private Button btnAcessoVenda;

    @FXML
    private Button btnCadastroFornecedor;

    @FXML
    private Button btnCadastroLivro;

    @FXML
    private Button btnClienteCadastro;

    @FXML
    private Button btnConsultaCliente;

    @FXML
    private Button btnConsultaLivro;

    @FXML
    private Button btnConsultaPreco;

    @FXML
    private Button btnConsultaVenda;

    @FXML
    private Button btnDevolucao;

    @FXML
    private Button btnEmissaoNF;

    @FXML
    private Button btnEmissaoRelatorio;

    @FXML
    private Button btnVendaConsulta;

    @FXML
    private CheckBox chkAcaoAventura;

    @FXML
    private CheckBox chkAutoajuda;

    @FXML
    private CheckBox chkFiccao;

    @FXML
    private CheckBox chkGastronomia;

    @FXML
    private CheckBox chkRomance;

    @FXML
    private CheckBox chkTerror;

    @FXML
    private CheckBox chkValor1030;

    @FXML
    private CheckBox chkValor1101130;

    @FXML
    private CheckBox chkValor3050;

    @FXML
    private CheckBox chkValor5070;

    @FXML
    private CheckBox chkValor7090;

    @FXML
    private CheckBox chkValorAcima130;

    @FXML
    private TableColumn<Livro, String> clmAutor;

    @FXML
    private TableColumn<Livro, String> clmEditora;

    @FXML
    private TableColumn<Livro, String> clmGenero;

    @FXML
    private TableColumn<Livro, String> clmSKU;

    @FXML
    private TableColumn<Livro, String> clmTitulo;

    @FXML
    private AnchorPane layoutListagem;

    @FXML
    private TableView<Livro> tblListagem;

    @FXML
    private TextField txtPesquisarLivro;

    @FXML
    void AcaoAventura(ActionEvent event) {

    }

    @FXML
    void AcessoCadastroCliente(ActionEvent event) {

    }

    @FXML
    void AcessoCadsatroProdutos(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }
    
    @FXML
    void AcessoConsultaPreco(ActionEvent event) {

    }

    @FXML
    void AcessoProcessamentoVenda(ActionEvent event) {

    }

    @FXML
    void Autoajuda(ActionEvent event) {

    }

    @FXML
    void CadastroCliente(ActionEvent event) {

    }

    @FXML
    void CadastroFornecedor(ActionEvent event) {

    }

    @FXML
    void CadastroLivro(ActionEvent event) throws IOException {
    	AnchorPane telaListagemPane = FXMLLoader.load(getClass().getResource("/visao/CadastroProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaListagemPane);
    }
    
    @FXML
    void ConsultaCliente(ActionEvent event) {

    }

    @FXML
    void ConsultaLivro(ActionEvent event) throws IOException {
    	AnchorPane telaHomePane = FXMLLoader.load(getClass().getResource("/visao/ListagemProdutos.fxml"));
    	layoutListagem.getChildren().setAll(telaHomePane);
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

    @FXML
    void Ficcao(ActionEvent event) {

    }

    @FXML
    void Gastronomia(ActionEvent event) {

    }

    @FXML
    void PesquisarLivro(ActionEvent event) {

    }

    @FXML
    void Romance(ActionEvent event) {

    }

    @FXML
    void Terror(ActionEvent event) {

    }

    @FXML
    void VAlor1101130(ActionEvent event) {

    }

    @FXML
    void Valor1030(ActionEvent event) {

    }

    @FXML
    void Valor3050(ActionEvent event) {

    }

    @FXML
    void Valor5070(ActionEvent event) {

    }

    @FXML
    void Valor7090(ActionEvent event) {

    }

    @FXML
    void ValorAcima130(ActionEvent event) {

    }
    
    @FXML
    public void initialize() throws SQLException {
    	System.out.println(clmAutor);
		LivroBD liv = new LivroBD();
		List<Livro> l  = liv.BuscarLivro();
		clmAutor.setCellValueFactory(new PropertyValueFactory<>("nome"));
		System.out.print(l.size());
		Autor autor = new Autor(2, "j");
		List<Livro> pessoas = Arrays.asList(
                new Livro(1, "a", "a", "a", 1, "a", (float) 2.5, autor)
                );
		tblListagem.setItems(FXCollections.observableArrayList(pessoas));

	}

}