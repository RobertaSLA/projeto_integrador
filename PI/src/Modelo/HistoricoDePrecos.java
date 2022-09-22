package Modelo;

import java.util.Date;

public class HistoricoDePrecos {
	
	private int idHistoricoDePrecos;
	private int skuLivro;
	private Date dataAlteracao;
	private float preco;
	
	
	
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
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
