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

import javax.swing.JOptionPane;

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



public class RelatorioDetalheVenda {

	public void Relatorio(int codVenda) throws FileNotFoundException, SQLException, MalformedURLException {
		
		try {
			
			String imgSrc = "imagenspdf\\logo sem fundo.png";
			ImageData data = ImageDataFactory.create(imgSrc);
			Image logoFundo = new Image(data);
			logoFundo.setFixedPosition(445, 700);
			logoFundo.setHeight(120);
			logoFundo.setWidth(130);
			
			
			
			String path = "C:\\Users\\Aluno\\Desktop\\RelatorioDetalheVenda.pdf";
			PdfWriter pdfWriter = new PdfWriter(path);
			
			
			
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			pdfDocument.addNewPage();
			
			Document document = new Document(pdfDocument);
			
			
			
			PdfFont fonte = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
			Text titulo = new Text("Relatório de Venda").setFont(fonte).setFontSize(15);
			Paragraph para1 = new Paragraph().add(titulo);
			para1.setFixedPosition(225, 750, null);
			
			
			Connection con = ConexaoBD.Conexao_BD();
			
			String query1 = "select idVenda, valor, cliente.nome, vendedor.nome from venda inner join cliente on (Cliente_idCliente=idCliente) inner join Vendedor on (Vendedor_idVendedor=idVendedor)  where idVenda = ? ";
	

			
			PreparedStatement stmt = con.prepareStatement(query1);

			stmt.setInt(1, codVenda);
			System.out.println(stmt);
			ResultSet rs = stmt.executeQuery();
			
			
			
			while (rs.next()) {
				Text id = new Text("Código de Venda: " + rs.getString("idVenda")+ "\n");
				Text valor = new Text("Valor: R$ " + rs.getString("valor")+ "\n");
				Text cliente = new Text("Cliente: " + rs.getString("cliente.nome")+ "\n");
				Text vendedor = new Text("Vendedor: " + rs.getString("vendedor.nome")+ "\n");
				
				Paragraph para2 = new Paragraph().add(id);
				para2.add(valor);
				para2.add(cliente);
				para2.add(vendedor);
				
				para2.setFixedPosition(50, 630, 200);
				
				document.add(para2);
			}
			
			
			Table table = new Table(5);
			table.setWidth(500);
			table.setRelativePosition(25, 200, 20, 50);
			
			table.addHeaderCell("Livro");
			table.addHeaderCell("Preço");
			table.addHeaderCell("Qtd");
			table.addHeaderCell("Desconto");
			table.addHeaderCell("Valor");
			
			
			
			
			String query = "select livro.nome, preco, quantidadeItem, DescontoItem, ValorItens  from\r\n"
					+ "livro inner join livro_has_venda on (sku=Livro_SKU) where Venda_idVenda = ?;";
			
			PreparedStatement stmt2 = con.prepareStatement(query);
			stmt2.setInt(1, codVenda);
			System.out.println(stmt2);
			ResultSet rs1 = stmt2.executeQuery();
			
			
			while (rs1.next()) {
			    table.addCell(rs1.getString("livro.nome"));
			    table.addCell(rs1.getString("preco"));
			    table.addCell(rs1.getString("quantidadeItem"));
			    table.addCell(rs1.getString("DescontoItem"));
			    table.addCell(rs1.getString("ValorItens"));
			}
			
			
			
			document.add(logoFundo);
			document.add(para1);
			document.add(table);
			
		
			document.close();
						
			JOptionPane.showMessageDialog(null, "Relatorio exportado com sucesso");
			}
		
		catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
	}
}
