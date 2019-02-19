package stage;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;

public class CenteredStage extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
		double x = bounds.getMinX() + (bounds.getWidth() - primaryStage.getWidth()) / 2.0;
		double y = bounds.getMinX() + (bounds.getHeight() - primaryStage.getWidth()) / 2.0;
		primaryStage.setX(x);
		primaryStage.setY(y);
		primaryStage.setTitle("Centered stage");
		primaryStage.show();
		primaryStage.centerOnScreen();
	}

}
