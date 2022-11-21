package Controle;

import java.sql.SQLException;

import Modelo.FormaPagamento;
import Modelo.Venda;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;

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

	private Venda<FormaPagamento> venda;
	
	private String bandeiraCartao;
	
	private Float ValorTroco;

    @FXML
    void ConfirmarPagamento(ActionEvent event) throws SQLException {
    	FormaPagamento pagamento = new FormaPagamento(choiceBoxFormaPgmt.getValue(), bandeiraCartao, Float.parseFloat(txtValorTotalPagamento.getText()), Float.parseFloat(txtValorRecebido.getText()), Float.parseFloat(txtValorTroco.getText()));
    	FormaPagamentoBD fpBD = new FormaPagamentoBD();
    	fpBD.InserirFormaPagamento(pagamento);
    	venda.setFormaPagamento(pagamento);
    	VendaBD vendaBD = new VendaBD();
    	vendaBD.InserirVenda(venda);

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

	}

}

