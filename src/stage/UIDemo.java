package stage;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UIDemo extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Pane root = new Pane();
		root.setLayoutX(20);
		root.setLayoutY(10);
		
		Label lbl = new Label();
		lbl.setPrefWidth(120);
		lbl.setPrefHeight(60);
		lbl.setLayoutX(100);
		lbl.setLayoutY(80);
		lbl.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		root.getChildren().add(lbl);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
