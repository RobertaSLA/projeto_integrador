package Modelo;

public class Endereco {
	private int idEndereco;
	private String cep;
	private String uf;
	private String cidade;
	private String bairro;
	private String endereco;
	private int numero;
	private String complemento;
	
	public Endereco(String cep, String uf, String cidade, String bairro, String endereco, int numero,
			String complemento) {
		super();
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
