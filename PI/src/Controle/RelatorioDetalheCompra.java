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



public class RelatorioDetalheCompra {

	public void Relatorio(int codCompra) throws FileNotFoundException, SQLException, MalformedURLException {
		
		try {
			
			String imgSrc = "imagenspdf\\logo sem fundo.png";
			ImageData data = ImageDataFactory.create(imgSrc);
			Image logoFundo = new Image(data);
			logoFundo.setFixedPosition(445, 700);
			logoFundo.setHeight(120);
			logoFundo.setWidth(130);
			
			
			
			String path = "C:\\Users\\Aluno\\Desktop\\RelatorioDetalheCompra.pdf";
			PdfWriter pdfWriter = new PdfWriter(path);
			
			
			
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			pdfDocument.addNewPage();
			
			Document document = new Document(pdfDocument);
			
			
			
			PdfFont fonte = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
			Text titulo = new Text("Relatório de Compra").setFont(fonte).setFontSize(15);
			Paragraph para1 = new Paragraph().add(titulo);
			para1.setFixedPosition(225, 750, null);
			
			
			Connection con = ConexaoBD.Conexao_BD();
			
			
			
			String query1 = "select idCompra, valortotal, fornecedor.nome from fornecedor inner join \r\n"
					+ "compra on (compra.IdFornecedor=fornecedor.idfornecedor) inner join livro_has_compra on \r\n"
					+ "(compra_idCompra=idCompra) where idCompra = ?;";
			
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setInt(1, codCompra);
			ResultSet rs = stmt.executeQuery();
			
			
			while (rs.next()) {
				Text id = new Text("Código de Compra: " + rs.getString("idCompra")+ "\n");
				Text valor = new Text("Valor: R$ " + rs.getString("valortotal")+ "\n");
				Text fornecedor = new Text("Fornecedor : " + rs.getString("fornecedor.nome")+ "\n");
				
				Paragraph para2 = new Paragraph().add(id);
				para2.add(valor);
				para2.add(fornecedor);

				
				para2.setFixedPosition(50, 630, 200);
				
				document.add(para2);
			}
			
			
			Table table = new Table(5);
			table.setWidth(500);
			table.setRelativePosition(25, 200, 20, 50);
			
			table.addHeaderCell("SKU");
			table.addHeaderCell("Livro");
			table.addHeaderCell("Qtd");
			table.addHeaderCell("Valor");
			table.addHeaderCell("Data");
			
			
			
			
			String query = "select SKU, livro.nome, livro_has_compra.quantidade, ValorItem, data  from\r\n"
					+ "livro inner join livro_has_compra on (sku=Livro_SKU) inner join compra on (idcompra=compra_idcompra)"  
					+ "where idCompra = ?;";
			
			PreparedStatement stmt1 = con.prepareStatement(query);
			stmt1.setInt(1, codCompra);
			ResultSet rs1 = stmt.executeQuery();

			
			while (rs1.next()) {
			    table.addCell(rs1.getString("SKU"));
			    table.addCell(rs1.getString("livro.nome"));
			    table.addCell(rs1.getString("livro_has_compra.quantidade"));
			    table.addCell(rs1.getString("ValorItem"));
			    table.addCell(rs1.getString("Data"));
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
