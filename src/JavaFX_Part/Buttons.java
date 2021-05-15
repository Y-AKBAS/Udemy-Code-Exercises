package JavaFX_Part;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Buttons extends Application {
	
	@Override
	public void start(Stage stage) throws Exception 
	{
		Button b=new Button("_Save");
		b.setMnemonicParsing(true);
		b.setTextFill(Color.RED);
		
		Tooltip tp=new Tooltip("Click to save");
		b.setTooltip(tp);
		
		Alert a=new Alert(AlertType.INFORMATION,"Succesfully saved!");
		b.setOnAction(e->a.show());
		
		// We can use css to set style. It is easier
		b.setStyle("-fx-border-color:green;-fx-background-color:blue");
		
		FlowPane fp=new FlowPane(b);
		Scene s=new Scene(fp,500,500);
		stage.setScene(s);
		stage.show();
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}
	
}
