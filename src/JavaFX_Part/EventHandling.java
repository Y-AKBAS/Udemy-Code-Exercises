package JavaFX_Part;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;


public class EventHandling extends Application implements EventHandler<ActionEvent>
{
	Button b;
	TextField tf;
	int count=0;

	public void start(Stage stage) throws Exception
	{
		b=new Button("Count");
		tf=new TextField();
		tf.setPrefSize(35,10);
		
		// We can handle the event with lambda expression too. we don't have to write
		// implements EventHandler<ActionEvent> above.#3. option
//		b.setOnAction(e->{
//			tf.setText(String.valueOf(++count));
//		});
		
		// With the help of handle method below we can handle an event. We have to write
		// implements EventHandler<ActionEvent> above. #1. option 
//		b.setOnAction(this);
		
		// With the help of anonymous class we can handle the event too. Than we don't have to write
		// implements EventHandler<ActionEvent> above.
		b.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae) 
			{
				tf.setText(String.valueOf(++count));
			}
		});
		
		
		FlowPane fp=new FlowPane(tf,b);
		Scene sc=new Scene(fp,500,500);
		stage.setScene(sc);
		stage.show();
	}
	
	// We can override the handle method of ActionEvent. We have to write 
	// implements EventHandler<ActionEvent> above.
	@Override
	public void handle(ActionEvent ae)
	{
		tf.setText(String.valueOf(++count));
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}

}
