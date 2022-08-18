package modelo;

import java.sql.Date;

public class Venda {
	
	private int idVenda;
	private int SKULivro;
	private String formaPagamento;
	private Date data;
	private double valor;

	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getSKULivro() {
		return SKULivro;
	}
	public void setSKULivro(int sKULivro) {
		SKULivro = sKULivro;
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
