package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class HistoricoDePrecos {
	
	private int idHistoricoDePrecos;
	private int skuLivro;
	private String livro;
	private String isbn;
	private float precoAnterior;
	private float precoAtual;
	private String dataAlteracao;
	
	
	public HistoricoDePrecos(int skuLivro, String livro, String isbn, float precoAnterior, float precoAtual,
			String dataAlteracao) {
		super();
		this.skuLivro = skuLivro;
		this.livro = livro;
		this.isbn = isbn;
		this.precoAnterior = precoAnterior;
		this.precoAtual = precoAtual;
		this.dataAlteracao = dataAlteracao;
	}
	
	public int getIdHistoricoDePrecos() {
		return idHistoricoDePrecos;
	}
	public void setIdHistoricoDePrecos(int idHistoricoDePrecos) {
		this.idHistoricoDePrecos = idHistoricoDePrecos;
	}
	public int getSkuLivro() {
		return skuLivro;
	}
	public void setSkuLivro(int skuLivro) {
		this.skuLivro = skuLivro;
	}
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public float getPrecoAnterior() {
		return precoAnterior;
	}
	public void setPrecoAnterior(float precoAnterior) {
		this.precoAnterior = precoAnterior;
	}
	public float getPrecoAtual() {
		return precoAtual;
	}
	public void setPrecoAtual(float precoAtual) {
		this.precoAtual = precoAtual;
	}
	public String getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(String dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}	
	
	
}
