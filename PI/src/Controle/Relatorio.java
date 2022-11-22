package Controle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import Modelo.Conexao;



public class Relatorio {

	public void Relatorio() throws FileNotFoundException {
		
		//try {
			
			String path = "C:\\Users\\Aluno\\Desktop\\pi\\projeto_integrador\\Relatorios\\RelatorioVenda.pdf";
			String paraText = "Relatório de Vendas";
			Paragraph para1 = new Paragraph(paraText);
			PdfWriter pdfWriter = new PdfWriter(path);
			
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			pdfDocument.addNewPage();
			
			Document document = new Document(pdfDocument);
			
			document.add(para1);
			
			float tamColuna [] = {200f, 50f, 100f};
			Table table = new Table(tamColuna);
			
			Cell cell_11 = new Cell();
			cell_11.add("asd");
			table.addCell(cell_11);
			
			
//			ConexaoBD  connect = new ConexaoBD();
//			Connection con = connect.Conexao_BD();
//			PreparedStatement ps = null;
//			ResultSet rs = null;
//			
//			String query = "select * from endereco";
//			ps = con.prepareStatement(query);
//			rs=ps.executeQuery();
			
			
			
//			Paragraph para = new Paragraph("Relatório de Vendas");
//			document.add(para);
			
			
			
//			PdfPTable table = new PdfPTable(6);
//			PdfPCell c1 = new PdfPCell (new Phrase("CEP"));
//			table.addCell(c1);
//			
//			
//			
//			c1 = new PdfPCell (new Phrase("UF"));
//			table.addCell(c1);
//			
//			c1 = new PdfPCell (new Phrase("Cidade"));
//			table.addCell(c1);
//			
//			c1 = new PdfPCell (new Phrase("Bairro"));
//			table.addCell(c1);
//			
//			c1 = new PdfPCell (new Phrase("Endereco"));
//			table.addCell(c1);
//			
//			c1 = new PdfPCell (new Phrase("Complemento"));
//			table.addCell(c1);
//			
//			
//			
//			table.setHeaderRows(1);
			
//			document.add(table);
			
			
//			while(rs.next()) {	
//				
//				table.addCell(rs.getString("CEP")+ " ");
//				table.addCell(rs.getString("UF")+ " ");
//				table.addCell(rs.getString("Cidade")+ " ");
//				table.addCell(rs.getString("Bairro")+ " ");
//				table.addCell(rs.getString("Endereco")+ " ");
//				table.addCell(rs.getString("Complemento")+ " ");
//			}
//			
//			document.add(table);
//			
			document.close();
//						
			System.out.println("Finalizado");
			//}
//		
//		catch (Exception e) {
//			System.err.println(e);
//		}
		}
}
