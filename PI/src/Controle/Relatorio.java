package Controle;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itextpdf.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfDiv.PositionType;

import Modelo.Conexao;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Relatorio {

	public void Relatorio() {
		
		try {
			
			String file_name="C:\\Users\\Aluno\\Desktop\\pi\\projeto_integrador\\Relatorios\\RelatorioVenda.pdf";
			Document document = new Document(); 
			
			PdfWriter.getInstance(document, new FileOutputStream(file_name));
			
			document.open();
			
			ConexaoBD  connect = new ConexaoBD();
			Connection con = connect.Conexao_BD();
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			String query = "select * from endereco";
			ps = con.prepareStatement(query);
			rs=ps.executeQuery();
			
			
			
			Paragraph para = new Paragraph("Relatório de Vendas");
			document.add(para);
			
			
			
			PdfPTable table = new PdfPTable(6);
			PdfPCell c1 = new PdfPCell (new Phrase("CEP"));
			table.addCell(c1);
			
			
			
			c1 = new PdfPCell (new Phrase("UF"));
			table.addCell(c1);
			
			c1 = new PdfPCell (new Phrase("Cidade"));
			table.addCell(c1);
			
			c1 = new PdfPCell (new Phrase("Bairro"));
			table.addCell(c1);
			
			c1 = new PdfPCell (new Phrase("Endereco"));
			table.addCell(c1);
			
			c1 = new PdfPCell (new Phrase("Complemento"));
			table.addCell(c1);
			
			
			
			table.setHeaderRows(1);
			
			document.add(table);
			
			
			while(rs.next()) {	
				
				table.addCell(rs.getString("CEP")+ " ");
				table.addCell(rs.getString("UF")+ " ");
				table.addCell(rs.getString("Cidade")+ " ");
				table.addCell(rs.getString("Bairro")+ " ");
				table.addCell(rs.getString("Endereco")+ " ");
				table.addCell(rs.getString("Complemento")+ " ");
			}
			
			document.add(table);
			
			document.close();
						
			System.out.println("Finalizado");
		}
		
		catch (Exception e) {
			System.err.println(e);
		}
	}
}
