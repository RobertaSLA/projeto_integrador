package Modelo;

import java.util.Date;

public class Devolucao {
	
	private int codDevolucao;
	private int idLivro;
	private int idVenda;
	private String motivo;
	private Date data;
	
	
	public int getCodDevolucao() {
		return codDevolucao;
	}
	public void setCodDevolucao(int codDevolucao) {
		this.codDevolucao = codDevolucao;
	}
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
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
	
	
	
}
