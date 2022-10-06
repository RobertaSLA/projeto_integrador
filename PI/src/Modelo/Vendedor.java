package Modelo;

public class Vendedor {
	
	private int idVendedor;
	private String nome;
	private String cpf;
	private String telefone;
	private String cep;
	private float comissao;
	private Endereco endereco;
	
	
	public Vendedor(int idVendedor, String nome, String cpf, String telefone, String cep, float comissao,
			Endereco endereco) {
		super();
		this.idVendedor = idVendedor;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
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
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
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
	
	
	
	
}
