package visao;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Controle.RelatorioVenda;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import Controle.RelatorioDetalheCompra;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		try {
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
