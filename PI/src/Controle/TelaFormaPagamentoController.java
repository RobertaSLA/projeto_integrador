package Controle;

import java.sql.SQLException;

import Modelo.FormaPagamento;
import Modelo.LivroVenda;
import Modelo.Venda;
import Modelo.Vendedor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class TelaFormaPagamentoController {

    @FXML
    private Button MastercardDebito;

    @FXML
    private Button btnConfirmarPagamento;

    @FXML
    private Button btnEloDebito;

    @FXML
    private Button btnHipercardDebito;

    @FXML
    private Button btnVisaDebito;

    @FXML
    private ChoiceBox<String> choiceBoxFormaPgmt;

    @FXML
    private TextField txtValorRecebido;

    @FXML
    private TextField txtValorTotalPagamento;

    @FXML
    private TextField txtValorTroco;

	private Venda venda;
	
	private String bandeiraCartao = " ";
	
	private Float ValorTroco;
	
	private Float comissao;

    @FXML
    void ConfirmarPagamento(ActionEvent event) throws SQLException {
    	FormaPagamento pagamento = new FormaPagamento(choiceBoxFormaPgmt.getValue(), bandeiraCartao, Float.parseFloat(txtValorTotalPagamento.getText()), Float.parseFloat(txtValorRecebido.getText()), Float.parseFloat(txtValorTroco.getText()));
    	FormaPagamentoBD fpBD = new FormaPagamentoBD();
    	fpBD.InserirFormaPagamento(pagamento);
    	venda.setFormaPagamento(pagamento);
    	VendaBD vendaBD = new VendaBD();
    	vendaBD.InserirVenda(venda);
    	
    	for (LivroVenda lv: venda.getListaitens()) {
			LivroBD livbd = new LivroBD();
			livbd.AtualizarEstoque(lv.getLivro().getSku(), lv.getLivro().getEstoque());
		}
    	
    	VendedorBD vendbd = new VendedorBD();
    	Vendedor vendedor = vendbd.CriarVendedor(venda.getVendedor().getIdVendedor()); 
    	
    	comissao = vendedor.getComissao() + (venda.getValor()*10/100);
    	
    	vendbd.AtualizarComissao(vendedor.getIdVendedor(), comissao);
    	
    	Node source = (Node) event.getSource();
    	Stage stage = (Stage) source.getScene().getWindow();
    	stage.close();
    }

    @FXML
    void EloDebito(ActionEvent event) {
    	bandeiraCartao = "Elo";
    }

    @FXML
    void HipercardDebito(ActionEvent event) {
    	bandeiraCartao = "HiperCard";
    }

    @FXML
    void MastercardDebito(ActionEvent event) {
    	bandeiraCartao = "MasterCard";
    }

    @FXML
    void ValorRecebido(ActionEvent event) {

    }

    @FXML
    void ValorTotalPagamento(ActionEvent event) {

    }

    @FXML
    void ValorTroco(ActionEvent event) {

    }
    
    @FXML
    void ValorRecebidoTab(KeyEvent event) {
    	ValorTroco = Float.parseFloat(txtValorRecebido.getText()) - Float.parseFloat(txtValorTotalPagamento.getText()) ;
    	txtValorTroco.setText(String.valueOf(ValorTroco));
    }

    @FXML
    void VisaDebito(ActionEvent event) {
    	bandeiraCartao = "Visa";
    }
    
	public void setVenda(Venda venda) {
		this.venda = venda;
		txtValorTotalPagamento.setText(String.valueOf(venda.getValor()));
		txtValorRecebido.setText(String.valueOf(venda.getValor()));
		txtValorTroco.setText("0.00");
	}

}

