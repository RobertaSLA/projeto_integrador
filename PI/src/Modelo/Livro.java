package Modelo;

import java.util.ArrayList;

public class Livro {
	
	private int sku;
	private String isbn;
	private String nome;
	private String editora;
	private int estoque;
	private String genero;
	private float preco;
	private Autor autor;
	
	
	public Livro(int sku, String isbn, String nome, String editora, int estoque, String genero, float preco,
			Autor autor) {
		super();
		this.sku = sku;
		this.isbn = isbn;
		this.nome = nome;
		this.editora = editora;
		this.estoque = estoque;
		this.genero = genero;
		this.preco = preco;
		this.autor = autor;
	}
	
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	
	
}
