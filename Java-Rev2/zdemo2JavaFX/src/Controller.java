

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller 
{
	@FXML
	private Circle c1;
	private int x;
	private int y;
	
	public void up(ActionEvent e)
	{
		System.out.println("1");
		c1.setCenterY(y-=5);
	}
	public void down(ActionEvent e)
	{
		System.out.println("3");
		c1.setCenterY(y+=5);
	}
	public void right(ActionEvent e)
	{
		System.out.println("2");
		c1.setCenterX(x+=5);
	}
	public void left(ActionEvent e)
	{
		System.out.println("4");
		c1.setCenterX(x-=5);
	}
}
