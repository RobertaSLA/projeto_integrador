package Modelo;

public class LivroVenda {
	
	private Livro livro;
	private Venda venda;
	private int quantidade;
	private float desconto;
	private float valor;
	
	
	
	public LivroVenda(Livro livro, Venda venda, int quantidade, float desconto, float valor) {
		super();
		this.livro = livro;
		this.venda = venda;
		this.quantidade = quantidade;
		this.desconto = desconto;
		this.valor = valor;
	}
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public int getSku() {
		return livro.getSku();
	}
	
	public String getNome() {
		return livro.getNome();
	}
	
	public float getPreco() {
		return livro.getPreco();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	
	
}
