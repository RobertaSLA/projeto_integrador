package modelo;

import java.sql.Date;

public class Devolucao {
	
	private int codDevolucao;
	private int idProduto;
	private int devolucao_idVenda;
	private String motivo;
	private Date data;

	public int getCodDevolucao() {
		return codDevolucao;
	}
	public void setCodDevolucao(int codDevolucao) {
		this.codDevolucao = codDevolucao;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public int getDevolucao_idVenda() {
		return devolucao_idVenda;
	}
	public void setDevolucao_idVenda(int devolucao_idVenda) {
		this.devolucao_idVenda = devolucao_idVenda;
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
