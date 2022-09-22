package Modelo;

import java.util.Date;

public class Compra {
	 
	private int idCompra;
	private int skuLivro;
	private int idFornecedor;
	private int quantidade;
	private float valor;
	private Date data;
	
	
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public int getSkuLivro() {
		return skuLivro;
	}
	public void setSkuLivro(int skuLivro) {
		this.skuLivro = skuLivro;
	}
	public int getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	 
}
