package JavaFX_Part;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.*;


public class FirstJavaFX extends Application
{

	@Override
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("First JavaFX App");
		Button b=new Button("Send");
		FlowPane f=new FlowPane();
		f.getChildren().add(b);
		
		Scene s=new Scene(f);
		stage.setScene(s);
		stage.show();
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}

}
