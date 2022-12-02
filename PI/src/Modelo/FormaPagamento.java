package Modelo;

public class FormaPagamento {
	
	private int idFormaPagamento;
	private String FormaPagamento;
	private String bandeiraCartao;
	private Float valorTotal;
	private Float valorRecebido;
	private Float valorTroco;
	
	public FormaPagamento(int idFormaPagamento, String formaPagamento, String bandeiraCartao, Float valorTotal,
			Float valorRecebido, Float valorTroco) {
		super();
		this.idFormaPagamento = idFormaPagamento;
		FormaPagamento = formaPagamento;
		this.bandeiraCartao = bandeiraCartao;
		this.valorTotal = valorTotal;
		this.valorRecebido = valorRecebido;
		this.valorTroco = valorTroco;
	}
	
	
	public FormaPagamento(String formaPagamento, String bandeiraCartao, Float valorTotal, Float valorRecebido,
			Float valorTroco) {
		super();
		FormaPagamento = formaPagamento;
		this.bandeiraCartao = bandeiraCartao;
		this.valorTotal = valorTotal;
		this.valorRecebido = valorRecebido;
		this.valorTroco = valorTroco;
	}




	public int getIdFormaPagamento() {
		return idFormaPagamento;
	}
	public void setIdFormaPagamento(int idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}
	public String getFormaPagamento() {
		return FormaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		FormaPagamento = formaPagamento;
	}
	public String getBandeiraCartao() {
		return bandeiraCartao;
	}
	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}
	public Float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Float getValorRecebido() {
		return valorRecebido;
	}
	public void setValorRecebido(Float valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
	public Float getValorTroco() {
		return valorTroco;
	}
	public void setValorTroco(Float valorTroco) {
		this.valorTroco = valorTroco;
	}
	
	

}
