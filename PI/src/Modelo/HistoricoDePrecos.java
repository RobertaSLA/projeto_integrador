package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class HistoricoDePrecos {
	
	private int idHistoricoDePrecos;
	private int skuLivro;
	private Date dataAlteracao;
	private ArrayList<LivroHistoricodePrecos> listaitens = new ArrayList<LivroHistoricodePrecos>();
	
	
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
	public ArrayList<LivroHistoricodePrecos> getListaitens() {
		return listaitens;
	}
	public void setListaitens(ArrayList<LivroHistoricodePrecos> listaitens) {
		this.listaitens = listaitens;
	}
	
	
}
