package Modelo;

import java.util.Date;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String telefone;
	private String cpf;
	private Endereco endereco;
	private String dataNascimento;
	private String sexo;
	private String celular;
	private String email;
	
	public Cliente(int idCliente, String nome, String telefone, String cpf, Endereco endereco, String dataNascimento,
			String sexo, String celular, String email) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.celular = celular;
		this.email = email;
	}

	public Cliente(String nome, String telefone, String cpf, Endereco endereco, String dataNascimento,
			String sexo, String celular, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.celular = celular;
		this.email = email;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
	
	
	
	
}
