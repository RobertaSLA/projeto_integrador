package Modelo;

public class Vendedor {
	
	private int idVendedor;
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String sexo;
	private String telefone;
	private String celular;
	private String email;
	private float comissao;
	private Endereco endereco;
	
	
	
	public Vendedor() {
		super();
	}


	public Vendedor(int idVendedor) {
		super();
		this.idVendedor = idVendedor;
	}


	public Vendedor(int idVendedor, String nome) {
		super();
		this.idVendedor = idVendedor;
		this.nome = nome;
	}



	public Vendedor(int idVendedor, String nome, String cpf) {
		super();
		this.idVendedor = idVendedor;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Vendedor(String nome, String cpf, String dataNascimento, String sexo, String telefone,
			String celular, String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.endereco = endereco;
	}


	public Vendedor(int idVendedor, String nome, String cpf, String telefone, float comissao,
			Endereco endereco) {
		super();
		this.idVendedor = idVendedor;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.comissao = comissao;
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
	
	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCep() {
		return endereco.getCep();
	}
	
	
	
	
}
