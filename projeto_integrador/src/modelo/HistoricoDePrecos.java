package modelo;

import java.sql.Date;

public class HistoricoDePrecos {
	
	private int idHistoricoDePrecos;
	private Date dataAlteracao;
	private double preco;

	public int getIdHistoricoDePrecos() {
		return idHistoricoDePrecos;
	}
	public void setIdHistoricoDePrecos(int idHistoricoDePrecos) {
		this.idHistoricoDePrecos = idHistoricoDePrecos;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
