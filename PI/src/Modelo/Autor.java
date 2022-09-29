package Modelo;

public class Autor {
	
	private int idAutor;
	private String nome;

	
	public Autor(int idAutor, String nome) {
		super();
		this.idAutor = idAutor;
		this.nome = nome;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
