package Modelo;

public class LivroCompra {
	
	private Livro Livro;
	private Compra Compra;
	private int quantidade;
	private float valor;
	
	public Livro getLivro() {
		return Livro;
	}
	public void setLivro(Livro Livro) {
		this.Livro = Livro;
	}
	public Compra getCompra() {
		return Compra;
	}
	public void Compra(Compra Compra) {
		this.Compra = Compra;
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
	
}
