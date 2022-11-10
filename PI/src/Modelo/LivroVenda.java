package Modelo;

public class LivroVenda {
	
	private Livro livro;
	private Venda venda;
	private int quantidadeItem;
	
	public LivroVenda(Livro livro, Venda venda, int quantidadeItem) {
		super();
		this.livro = livro;
		this.venda = venda;
		this.quantidadeItem = quantidadeItem;
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
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
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
	
	
	

	
	
}
