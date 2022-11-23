package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Devolucao {
	
	private int codDevolucao;
	private Livro livro;
	private Venda venda;
	private String motivo;
	private Date data;
	private ArrayList<LivroDevolucao> listaitens = new ArrayList<LivroDevolucao>();
	
	
	public int getCodDevolucao() {
		return codDevolucao;
	}
	public void setCodDevolucao(int codDevolucao) {
		this.codDevolucao = codDevolucao;
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
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public ArrayList<LivroDevolucao> getListaitens() {
		return listaitens;
	}
	public void setListaitens(ArrayList<LivroDevolucao> listaitens) {
		this.listaitens = listaitens;
	}
	
	
}
