package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Devolucao {
	
	private int codDevolucao;
	private int idLivro;
	private int idVenda;
	private String motivo;
	private Date data;
	private ArrayList<LivroDevolucao> listaitens = new ArrayList<LivroDevolucao>();
	
	
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
	public ArrayList<LivroDevolucao> getListaitens() {
		return listaitens;
	}
	public void setListaitens(ArrayList<LivroDevolucao> listaitens) {
		this.listaitens = listaitens;
	}
	
	
}
