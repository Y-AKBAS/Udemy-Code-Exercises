package JavaFX_Part;

import java.io.FileInputStream;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Sliders extends Application
{
	TextArea ta;
	Slider s;
	Button open;
	
	public void start(Stage stage)
	{
		ta=new TextArea();
		ta.setPrefColumnCount(60);
		ta.setPrefRowCount(35);
		
		s=new Slider(10,50,10);
		s.setMajorTickUnit(10);
		s.setShowTickMarks(true);
		
		s.valueProperty().addListener(l->{ ta.setFont(Font.font(s.getValue())); });
		
		DatePicker dp=new DatePicker();
		//dp.setShowWeekNumbers(true);
		dp.setOnAction(a->{ta.setText("Date: "+dp.getValue()+"\n"+ta.getText());});
		
		open=new Button("Open");
		open.setOnAction(a->
		{
			FileChooser fc=new FileChooser();
			java.io.File file=fc.showOpenDialog(stage);
			
			try(Scanner sc=new Scanner(new FileInputStream(file)))
			{
				String str="";
				while(sc.hasNext())
				{
					str=str+sc.nextLine()+"\n";
					ta.setText(str);
				}
				
			}catch(Exception e) {ta.setText(e.toString());}
		
		});
						
		
	    VBox vb=new VBox();
	    vb.setAlignment(Pos.TOP_CENTER);
		vb.getChildren().addAll(ta,s,dp,open);
		
		Scene sc=new Scene(vb,700,700);
		stage.setScene(sc);
		stage.show();
	}
	
	public static void main(String[] args) 
	{	
		launch(args);
	}
}
