package Modelo;

public class Vendedor {
	
	private int idVendedor;
	private String nome;
	private String cpf;
	private String telefone;
	private String celular;
	private float comissao;
	private Endereco endereco;
	
	
	
	
	public Vendedor(String nome, String cpf, String telefone, String celular, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.celular = celular;
		this.endereco = endereco;
	}
	
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	
}
