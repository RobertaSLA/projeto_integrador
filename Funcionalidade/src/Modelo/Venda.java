package Modelo;

import java.util.Date;

public class Venda {
	
	private int idVenda;
	private int skuLivro;
	private String formaPagamento;
	private Date data;
	private float valor;
	private int idCliente;
	private int idVendedor;
	
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getSkuLivro() {
		return skuLivro;
	}
	public void setSkuLivro(int skuLivro) {
		this.skuLivro = skuLivro;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	
	
	
	
	
}
