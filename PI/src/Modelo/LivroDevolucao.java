package Modelo;

import java.util.ArrayList;

public class LivroDevolucao {
	
	private Devolucao devolucao;
	private Livro livro;
	private int quantidade;
	private float valorItem;
	private ArrayList<LivroDevolucao> listaitens = new ArrayList<LivroDevolucao>();
	
	
	public LivroDevolucao(Devolucao devolucao, Livro livro, int quantidade, float valorItem) {
		super();
		this.devolucao = devolucao;
		this.livro = livro;
		this.quantidade = quantidade;
		this.valorItem = valorItem;
	}
	
	public Devolucao getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValorItem() {
		return valorItem;
	}
	public void setValorItem(float valorItem) {
		this.valorItem = valorItem;
	}
	public ArrayList<LivroDevolucao> getListaitens() {
		return listaitens;
	}
	public void setListaitens(ArrayList<LivroDevolucao> listaitens) {
		this.listaitens = listaitens;
	}
	public int getSku() {
		return livro.getSku();
	}
	public String getTitulo() {
		return livro.getNome();
	}
	public float getValor() {
		return livro.getPreco();
	}
}
