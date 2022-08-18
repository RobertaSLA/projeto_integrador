package modelo;

public class Livro {
	
	// modificador de acesso tipodavariavel nomedavariavel
	
	private int SKU;
	private int ISBN;
	private String Nome;
	private String Editora;
	private int Estoque;
	private int idAutor;
	public int getSKU() {
		return SKU;
	}
	public void setSKU(int sKU) {
		SKU = sKU;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEditora() {
		return Editora;
	}
	public void setEditora(String editora) {
		Editora = editora;
	}
	public int getEstoque() {
		return Estoque;
	}
	public void setEstoque(int estoque) {
		Estoque = estoque;
	}
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	
	
}
