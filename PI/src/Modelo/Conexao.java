package Modelo;

public class Conexao {
	
	private static String caminho = "jdbc:mysql://localhost/mydb";
	private static String usuario = "root";
	private static String senha = "roberta";
	
	public static String getCaminho() {
		return caminho;
	}
	public static void setCaminho(String caminho) {
		Conexao.caminho = caminho;
	}
	public static String getUsuario() {
		return usuario;
	}
	public static void setUsuario(String usuario) {
		Conexao.usuario = usuario;
	}
	public static String getSenha() {
		return senha;
	}
	public static void setSenha(String senha) {
		Conexao.senha = senha;
	}
	
	
}
