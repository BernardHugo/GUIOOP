package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.*;
import java.lang.Math;

public class Main extends Application {
	private int num = 0;
	private int count = 0;
	private int multiplier = 60;
	private String s = "WOW!";
	private String ns = "";
	private String[] classes = {"S Class", "A Class", "B Class", "C class", "D class"};
	private String earn;
	
	@Override
		public void start(Stage primaryStage) {
		try {
			
			VBox root = new VBox();
		
			//Label
			Label label = new Label();
			label.setText("Press the button " );
			label.setFont(Font.font(20));
			root.getChildren().add(label);
			Label label2 = new Label();
			label2.setTranslateY(20);
			label2.setFont(Font.font(20));
			
			
			
			//Button
			Button b = new Button();
			b.setText("Press");
			b.setTranslateX(200);
			b.setTranslateY(200);
			root.getChildren().add(b);
		
			
			
			
			//Button Action
			b.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					count++;
					num =  (int) (Math.random()*(multiplier));
					if(num >= 1 && num <= 50) {
						earn = classes[4];
						label.setText("Congrats you earn a " + earn + " hero");
						label2.setText(ns);
					}
					else if(num > 50 && num <= 90) {
						earn = classes[3];
						label.setText("Congrats you earn a " + earn + " hero");
						label2.setText(ns);
					}
					else if(num > 90 && num <= 120) {
						earn = classes[2];
						label.setText("Congrats you earn a " + earn + " hero");
						label2.setText(ns);
					}
					else if(num > 120 && num <= 140) {
						earn = classes[1];
						label.setText("Congrats you earn a " + earn + " hero");
						label2.setText(ns);
					}
					else if(num >140 && num >0) {
						earn = classes[0];
						label.setText("Congrats you earn a " + earn + " hero");
						label2.setText("WOW!");
				
					}
					if(count % 5 == 0) {
						multiplier*=2;
						if(earn == classes[0]) {
							multiplier = 60;
						}
					}
				
				
				}
			});
			
			
			
			
		    Scene scene = new Scene(root, 400, 400);
		    primaryStage.setTitle("Simple Gacha");
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
