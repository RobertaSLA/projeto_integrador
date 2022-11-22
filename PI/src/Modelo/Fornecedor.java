package Modelo;

public class Fornecedor {
	
	private int idFornecedor;
	private String nome;
	private String cnpj;
	private String insEstadual;
	private String telefone;
	private String celular;
	private String email;
	private Endereco endereco;
	
	
	public Fornecedor(int idFornecedor, String nome, String cnpj) {
		super();
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Fornecedor(int idFornecedor, String nome, String cnpj, String insEstadual, String telefone, String celular,
			String email, Endereco endereco) {
		super();
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
		this.insEstadual = insEstadual;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.endereco = endereco;
	}

	public Fornecedor(String nome, String cnpj, String insEstadual, String telefone, String celular,
			String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.insEstadual = insEstadual;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.endereco = endereco;
	}	
	
	public int getIdFornecedor() {
		return idFornecedor;
	}
	public void setidFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInsEstadual() {
		return insEstadual;
	}
	public void setInsEstadual(String insEstadual) {
		this.insEstadual = insEstadual;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
