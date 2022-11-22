package Controle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;

import Modelo.Conexao;



public class Relatorio {

	public void Relatorio() throws FileNotFoundException, SQLException, MalformedURLException {
		
		try {
			
			String imgSrc = "imagenspdf\\logo sem fundo.png";
			ImageData data = ImageDataFactory.create(imgSrc);
			Image logoFundo = new Image(data);
			logoFundo.setFixedPosition(30, 250);
			logoFundo.setHeight(450);
			logoFundo.setWidth(500);
			
			
			
			String path = "C:\\Users\\Aluno\\Desktop\\pi\\projeto_integrador\\Relatorios\\RelatorioVenda.pdf";
			PdfWriter pdfWriter = new PdfWriter(path);
			
			
			
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			pdfDocument.addNewPage();
			
			Document document = new Document(pdfDocument);
			
			
			
			PdfFont fonte = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
			Text titulo = new Text("Relatório de Vendas").setFont(fonte).setFontSize(15);
			Paragraph para1 = new Paragraph().add(titulo);
			para1.setFixedPosition(225, 750, null);
			
			
			
			Table table = new Table(7);
			table.setFixedPosition(35, 200, 525);
			
			table.addHeaderCell("CEP");
			table.addHeaderCell("UF");
			table.addHeaderCell("Cidade");
			table.addHeaderCell("Bairro");
			table.addHeaderCell("Endereco");
			table.addHeaderCell("Numero");
			table.addHeaderCell("Complemento");	
			
			
			
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select cep, uf, cidade, bairro, endereco, numero, complemento from endereco";
			
			ConexaoBD  connect = new ConexaoBD();
			PreparedStatement ps = null;
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
			    table.addCell(rs.getString("CEP"));
			    table.addCell(rs.getString("UF"));
			    table.addCell(rs.getString("Cidade"));
			    table.addCell(rs.getString("Bairro"));
			    table.addCell(rs.getString("Endereco"));
			    table.addCell(rs.getString("Numero"));
			    table.addCell(rs.getString("Complemento"));
			}
			
			
			
			document.add(logoFundo);
			document.add(para1);
			document.add(table);
			
		
			document.close();
						
			System.out.println("Finalizado");
			}
		
		catch (Exception e) {
			System.err.println(e);
		}
	}
}
