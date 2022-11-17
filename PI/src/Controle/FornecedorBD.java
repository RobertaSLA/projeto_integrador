package Controle;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modelo.Endereco;
import Modelo.Fornecedor;

public class FornecedorBD {
	public void InserirFornecedor(Fornecedor fornecedor) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "insert into fornecedor (Nome, CNPJ, Inscricao_Estadual, Fone, Celular, Email, idEndereco) values (?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, fornecedor.getNome());
			stmt.setString(2, fornecedor.getCnpj());
			stmt.setString(3, fornecedor.getInsEstadual());
			stmt.setString(4, fornecedor.getTelefone());
			stmt.setString(5, fornecedor.getCelular());
			stmt.setString(6, fornecedor.getEmail());
			stmt.setInt(7, fornecedor.getEndereco().getIdEndereco());
			
			stmt.execute();
			stmt.close(); 
			con.close();
			JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");
			
		} catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
	public void DeletarFornecedor(Fornecedor fornecedor) throws SQLException {
		try {
			Connection con = ConexaoBD.Conexao_BD();
			String sql = "delete from fornecedor where IdFornecedor = ? ";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, fornecedor.getidFornecedor());
			
			stmt.executeUpdate();
			
			stmt.close(); 
			con.close();
			
			JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso");
		}catch (SQLException e){
			throw new SQLException(e);
		}
	}
	
	
	
	
	public ArrayList<Fornecedor> BuscarFornecedor() throws SQLException {
		ArrayList<Fornecedor> Lista = new ArrayList<Fornecedor>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select endereco.idEndereco, endereco.cep, endereco.uf, endereco.cidade, endereco.bairro, "
					+ "endereco.endereco, endereco.numero, endereco.complemento, fornecedor.idFornecedor, fornecedor.nome, "
					+ "fornecedor.cnpj, fornecedor.Inscricao_Estadual, fornecedor.Telefone, fornecedor.celular, fornecedor.email"
					+ " from fornecedor inner join endereco on fornecedor.idEndereco=endereco.idEndereco;";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				Endereco end = new Endereco(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
				Fornecedor forn = new Fornecedor(rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12), 
						 rs.getString(13), rs.getString(14), rs.getString(15), end);
				Lista.add(forn);
			}
			

			stmt.close(); 
			con.close();
						
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
	
	public ArrayList<Fornecedor> BuscarCodFornecedor() throws SQLException {
		ArrayList<Fornecedor> Lista = new ArrayList<Fornecedor>();
		try {
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select idFornecedor, nome, cnpj from fornecedor;";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
	
			while(rs.next()){
				Fornecedor forn = new Fornecedor(rs.getInt(1), rs.getString(2), rs.getString(3));
				Lista.add(forn);
			}
			
			stmt.close(); 
			con.close();
			
			
		}catch (SQLException e){
			throw new SQLException(e);
		}
		return Lista;
		
	}
}
