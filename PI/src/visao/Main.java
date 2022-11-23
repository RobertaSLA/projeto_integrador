package visao;


import java.io.IOException;

import Controle.RelatorioCliente;
import Controle.RelatorioProdutos;
import Controle.RelatorioProdutosAventura;
import Controle.RelatorioProdutosGastronomia;
import Controle.RelatorioProdutosRomance;
import Controle.RelatorioProdutosTerror;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		try {
			
			//RelatorioCliente relatorioCliente = new RelatorioCliente();
			//relatorioCliente.Relatorio();
			
			//RelatorioProdutos relatorioProdutos = new RelatorioProdutos();
			//relatorioProdutos.Relatorio();
			
//			RelatorioProdutosAventura relatorioAcao = new RelatorioProdutosAventura();
//			relatorioAcao.Relatorio();
			
//			RelatorioProdutosGastronomia relatorioGast = new RelatorioProdutosGastronomia();
//			relatorioGast.Relatorio();
	
//			RelatorioProdutosRomance relatorioRoma = new RelatorioProdutosRomance();
//			relatorioRoma.Relatorio();
			
//			RelatorioProdutosTerror relatorioTer = new RelatorioProdutosTerror();
//			relatorioTer.Relatorio();
			
			
			
			Parent rootContainer = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
            Scene scene = new Scene(rootContainer);
            primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
