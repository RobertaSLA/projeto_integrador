package modelo;

import java.sql.Date;

public class Compra {
	
	private int idCompra;
	private int SKULivro;
	private int Quantidade;
	private double Valor;
	private String Fornecedor;
	private Date data;
	
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public int getSKULivro() {
		return SKULivro;
	}
	public void setSKULivro(int sKULivro) {
		SKULivro = sKULivro;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public String getFornecedor() {
		return Fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
