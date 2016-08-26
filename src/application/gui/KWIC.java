package application.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * Start of the program
 * Assumptions: Input must be correct with delimiters as ","
 *              Input will always be in string form instead of file form
 */

public class KWIC extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			MainPage page = MainPage.getInstance();
			Scene scene = new Scene(page);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
