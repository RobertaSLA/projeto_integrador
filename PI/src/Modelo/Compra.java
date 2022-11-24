package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
	 
	private int idCompra;
	private Fornecedor fornecedor;
	private int quantidade;
	private float valor;
	private String data;
	private ArrayList<LivroCompra> listaitens = new ArrayList<LivroCompra>();
	
	
	
	public Compra() {
		super();
	}
	
	public Compra(int idCompra, String data, float valor, int quantidade, Fornecedor fornecedor) {
		super();
		this.idCompra = idCompra;
		this.fornecedor = fornecedor;
		this.quantidade = quantidade;
		this.valor = valor;
		this.data = data;
	}
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ArrayList<LivroCompra> getListaitens() {
		return listaitens;
	}
	public void setListaitens(ArrayList<LivroCompra> listaitens) {
		this.listaitens = listaitens;
	}
	
	public String getNomeFornecedor() {
		return fornecedor.getNome();
	}
	 
}
