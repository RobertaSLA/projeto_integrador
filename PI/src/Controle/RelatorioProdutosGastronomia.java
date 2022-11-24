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
import com.itextpdf.layout.property.TextAlignment;

import Modelo.Conexao;



public class RelatorioProdutosGastronomia {

	public void Relatorio() throws FileNotFoundException, SQLException, MalformedURLException {
		
		try {
			
			String imgSrc = "imagenspdf\\logo sem fundo.png";
			ImageData data = ImageDataFactory.create(imgSrc);
			Image logoFundo = new Image(data);
			logoFundo.setFixedPosition(445, 700);
			logoFundo.setHeight(120);
			logoFundo.setWidth(130);
			
			
			
			String path = "C:\\Users\\Aluno\\Desktop\\PIIII\\projeto_integrador\\Relatorios\\RelatorioGastronomia.pdf";
			PdfWriter pdfWriter = new PdfWriter(path);
			
			
			
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			pdfDocument.addNewPage();
			
			Document document = new Document(pdfDocument);
			
			
			
			PdfFont fonte = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
			Text titulo = new Text("Relatório Produtos (Gastronomia)").setFont(fonte).setFontSize(15);
			Paragraph para1 = new Paragraph().add(titulo);
			para1.setFixedPosition(190, 750, null);
			
			
			
			Table table = new Table(6);
			table.setRelativePosition(25, 100, 20, 50);
			
			table.addHeaderCell("Título");
			table.addHeaderCell("ISBN");
			table.addHeaderCell("Autor");
			table.addHeaderCell("Genero");
			table.addHeaderCell("Preco");
			table.addHeaderCell("Un");
			
			
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			
			String query = "select livro.nome, ISBN, autor.nome, genero, preco,"
					+ "estoque from livro inner join autor using (idAutor) where "
					+ "genero like '%Gastronomia%' order by livro.nome;";
			
			ConexaoBD  connect = new ConexaoBD();
			PreparedStatement ps = null;
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
			    table.addCell(rs.getString("livro.nome"));
			    table.addCell(rs.getString("ISBN"));
			    table.addCell(rs.getString("autor.nome"));
			    table.addCell(rs.getString("Genero"));
			    table.addCell(rs.getString("Preco"));
			    table.addCell(rs.getString("Estoque"));
			    
			}
			
			
			
			document.add(logoFundo);
			document.add(para1);
			document.add(table);
			
		
			document.close();
						
			System.out.println("Gastronomia");
			}
		
		catch (Exception e) {
			System.err.println(e);
		}
	}
}
