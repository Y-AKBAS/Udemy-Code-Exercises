package JavaFX_Part;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.event.*;


public class Check_RadioButtons_HBox extends Application implements EventHandler<ActionEvent>
{
	Text t;
	CheckBox c1,c2,c3;
	RadioButton b1,b2,b3;
	ChoiceBox<Integer> cb;
	HBox h1,h2,h3; // Horizontal Box
	VBox vb;

	
	public void start(Stage stage) throws Exception
	{
		t=new Text("GUI Programming");
		h1=new HBox();
		h1.getChildren().add(t);
		
		b1=new RadioButton("Red");
		b2=new RadioButton("Green");
		b3=new RadioButton("Blue");
		
		ToggleGroup tg=new ToggleGroup();
		b1.setToggleGroup(tg);
		b2.setToggleGroup(tg);
		b3.setToggleGroup(tg);
		
		h2=new HBox();
		h2.getChildren().addAll(b1,b2,b3);
		h2.setSpacing(10);
		h2.setPadding(new Insets(10,10,10,10));
		
		c1=new CheckBox("Normal");
		c2=new CheckBox("Bold");
		c3=new CheckBox("Italic");
		
		h3=new HBox();
		h3.getChildren().addAll(c1,c2,c3);
		h3.setSpacing(10);
		h3.setPadding(new Insets(10,10,10,10));
		
		cb=new ChoiceBox<>();
		cb.getItems().addAll(10,15,20,25);
		
		vb=new VBox();
		vb.getChildren().addAll(h1,h2,h3,cb);
		vb.setSpacing(10);
		vb.setPadding(new Insets(10,10,10,10));
		
		c1.setOnAction(this);
		c2.setOnAction(this);
		c3.setOnAction(this);
		b1.setOnAction(this);
		b2.setOnAction(this);
		b3.setOnAction(this);
		cb.setOnAction(this);
		
		
		Scene sc=new Scene(vb,500,500);
		stage.setScene(sc);
		stage.show();
	}
	
	public void handle(ActionEvent ae)
	{
		FontWeight fw=FontWeight.NORMAL;
		FontPosture fp=FontPosture.REGULAR;
		
//		if(ae.getSource()==b1)
//			t.setFill(Color.RED);
//		if(ae.getSource()==b2)
//			t.setFill(Color.GREEN);
//		if(ae.getSource()==b3)
//			t.setFill(Color.BLUE);
		
		if(b1.isSelected())
			t.setFill(Color.RED);
		if(b2.isSelected())
			t.setFill(Color.GREEN);
		if(b3.isSelected())
			t.setFill(Color.BLUE);
		
		if(c2.isSelected())
			fw=FontWeight.BOLD;
		if(c3.isSelected())
			fp=FontPosture.ITALIC;
		if(cb.isShowing())
		t.setFont(Font.font("Times New Roman",fw,fp,cb.getValue()));
		else
			t.setFont(Font.font("Times New Roman",fw,fp,15));

			
		
	}
	public static void main(String[] args) 
	{
		launch(args);
	}

}
