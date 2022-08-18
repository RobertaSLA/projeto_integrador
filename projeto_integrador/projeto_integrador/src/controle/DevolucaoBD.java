package controle;

import java.sql.Date;

public class DevolucaoBD {
	
	private int codDevolucao;
	private int idProduto;
	private int devolucao_idVenda;
	private String motivo;
	private Date data;
	private int idVenda;
	private int devolucao_idCliente;

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
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getDevolucao_idCliente() {
		return devolucao_idCliente;
	}
	public void setDevolucao_idCliente(int devolucao_idCliente) {
		this.devolucao_idCliente = devolucao_idCliente;
	}

	
}
