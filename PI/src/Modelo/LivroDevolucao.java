package Modelo;

import java.util.ArrayList;

public class LivroDevolucao {
	
	private int idDevolucao;
	private Livro livro;
	private int quantidade;
	private float valorItem;
	private ArrayList<LivroDevolucao> listaitens = new ArrayList<LivroDevolucao>();
	
	
	public int getIdDevolucao() {
		return idDevolucao;
	}
	public void setIdDevolucao(int idDevolucao) {
		this.idDevolucao = idDevolucao;
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
	
	
}
