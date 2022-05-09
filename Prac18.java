import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class Prac18 extends Application {
    @Override
	public void start(final Stage stage)
	{
		
		Circle c1 = new Circle(250.0,250.0,50.0,Color.RED);

		EventHandler<KeyEvent> keyEvent = new EventHandler<KeyEvent>()
		{
			@Override
			public void handle(KeyEvent e)
			{
				double newX = c1.getCenterX(),newY=c1.getCenterY();
				if(e.getCode() == KeyCode.UP)
				{
					c1.setCenterY(newY - 15);
				}
				else if(e.getCode() == KeyCode.DOWN)
				{
					c1.setCenterY(newY + 15);
				}
				else if(e.getCode() == KeyCode.LEFT)
				{
					c1.setCenterX(newX - 15);
				}
				else if(e.getCode() == KeyCode.RIGHT)
				{
					c1.setCenterX(newX + 15);
				}
				
				e.consume();
			}
		};
	
		
		Group root = new Group(c1);

		Scene scene = new Scene(root,1000,1000);
		scene.addEventHandler(KeyEvent.KEY_PRESSED,keyEvent);
		
		stage.setScene(scene);
		stage.show();

	}
    public static void main(String[] args)
	{
		Application.launch(args);		
	}
}
