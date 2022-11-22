package Modelo;

public class LivroCompra {
	
	private Livro livro;
	private Compra Compra;
	private int quantidade;
	private float valor;
	private float valorTotal;
	
	
	public LivroCompra(Livro livro, Modelo.Compra compra, int quantidade, float valor, float valorTotal) {
		super();
		this.livro = livro;
		Compra = compra;
		this.quantidade = quantidade;
		this.valor = valor;
		this.valorTotal = valorTotal;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro Livro) {
		this.livro = Livro;
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
	
	public int getSku() {
		return livro.getSku();
	}
	public String getTitulo() {
		return livro.getNome();
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public void setCompra(Compra compra) {
		Compra = compra;
	}
	
}
