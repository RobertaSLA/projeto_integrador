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



public class RelatorioVenda {

	public void Relatorio() throws FileNotFoundException, SQLException, MalformedURLException {
		
		try {
			
			String imgSrc = "imagenspdf\\logo sem fundo.png";
			ImageData data = ImageDataFactory.create(imgSrc);
			Image logoFundo = new Image(data);
			logoFundo.setFixedPosition(445, 700);
			logoFundo.setHeight(120);
			logoFundo.setWidth(130);
			
			
			
			String path = "C:\\Users\\Aluno\\Desktop\\pi\\projeto_integrador\\Relatorios\\RelatorioVendas.pdf";
			PdfWriter pdfWriter = new PdfWriter(path);
			
			
			
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			pdfDocument.addNewPage();
			
			Document document = new Document(pdfDocument);
			
			
			
			PdfFont fonte = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
			Text titulo = new Text("Relatório de Vendas").setFont(fonte).setFontSize(15);
			Paragraph para1 = new Paragraph().add(titulo);
			para1.setFixedPosition(225, 750, null);
		
			
			Table table = new Table(6);
			table.setWidth(500);
			table.setRelativePosition(25, 100, 20, 50);
			
			table.addHeaderCell("ID").setFont(fonte);
			table.addHeaderCell("Cliente").setFont(fonte);
			table.addHeaderCell("Vendedor").setFont(fonte);
			table.addHeaderCell("Valor").setFont(fonte);
			table.addHeaderCell("Método").setFont(fonte);
			table.addHeaderCell("Data").setFont(fonte);
			
			
			Connection con = ConexaoBD.Conexao_BD();
			Statement stmt = con.createStatement();
			ConexaoBD  connect = new ConexaoBD();
			PreparedStatement ps = null;
			
			String query = "select idVenda, cliente.nome, vendedor.nome, valor, formadepagamento, data from venda inner join " 
					+ "cliente on (Cliente_idCliente=idCliente) inner join Vendedor on (Vendedor_idVendedor=idVendedor) "
					+ "inner join formadepagamento on (idformapagamento) group by idvenda ;";
			ResultSet rs1 = stmt.executeQuery(query);
			
			
			while (rs1.next()) {
			    table.addCell(rs1.getString("idvenda"));
			    table.addCell(rs1.getString("cliente.nome"));
			    table.addCell(rs1.getString("vendedor.nome"));
			    table.addCell(rs1.getString("valor"));
			    table.addCell(rs1.getString("formadepagamento"));
			    table.addCell(rs1.getString("data"));
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
