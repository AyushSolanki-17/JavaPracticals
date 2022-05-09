import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class Prac19 extends Application
{
	
	@Override
	public void start(final Stage stage)
	{
		Circle c1 = new Circle(250.0,250.0,50.0,Color.BLUE);
		
		EventHandler<MouseEvent> mousePress = new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				c1.setFill(Color.RED);
				e.consume();
			}
		}; 
		EventHandler<MouseEvent> mouseRelease = new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				c1.setFill(Color.BLUE);
				e.consume();
			}
		};
	
		c1.addEventHandler(MouseEvent.MOUSE_PRESSED,mousePress);
		c1.addEventHandler(MouseEvent.MOUSE_RELEASED,mouseRelease);
		
		Group root = new Group(c1);

		Scene scene = new Scene(root,500,500);
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args)
	{
		Application.launch(args);		
	}
}