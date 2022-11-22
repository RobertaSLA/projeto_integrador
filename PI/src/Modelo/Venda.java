package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
	
	private int idVenda;
	private FormaPagamento formaPagamento;
	private Date data;
	private float valor;
	private float desconto;
	private Cliente Cliente;
	private Vendedor Vendedor;
	private ArrayList<LivroVenda> listaitens = new ArrayList<LivroVenda>();
	
	public Venda() {
		super();
	}
	

	public Venda(int idVenda, float valor, float desconto, Modelo.Cliente cliente,
			Modelo.Vendedor vendedor) {
		super();
		this.idVenda = idVenda;
		this.valor = valor;
		this.desconto = desconto;
		Cliente = cliente;
		Vendedor = vendedor;
	}




	public Venda(int idVenda, Date data, Cliente Cliente) {
		super();
		this.idVenda = idVenda;
		this.data = data;
		this.Cliente = Cliente;
	}
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente Cliente) {
		this.Cliente = Cliente;
	}
	public Vendedor getVendedor() {
		return Vendedor;
	}
	public void setVendedor(Vendedor Vendedor) {
		this.Vendedor = Vendedor;
	}
	
	public ArrayList<LivroVenda> getListaitens() {
		return listaitens;
	}
	public void setListaitens(ArrayList<LivroVenda> listaitens) {
		this.listaitens = listaitens;
	}
	
	public int getItem() {
		return 1;
	}
	
	public String getNomeCliente() {
		return Cliente.getNome();
	}
	public String getNomeVendedor() {
		return Vendedor.getNome();
	}

	
}
