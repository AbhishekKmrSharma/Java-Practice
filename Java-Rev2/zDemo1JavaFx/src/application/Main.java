package application;
	
import java.security.Timestamp;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application 
{	
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		//Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root,700,500,Color.SKYBLUE);
		Image imageLogo = new Image("firstAppLogo.png");
		Text text = new Text();
		text.setText("First Text");
		text.setX(100);
		text.setY(100);
		text.setFont(Font.font("Aerial", 100));
		text.setFill(Color.RED); /// similary Recatnge, triangles,Line are there
		Image image1 = new Image("firstAppLogo.png");
		ImageView imageview = new ImageView(image1);
		imageview.setY(200);
		
		//stage.setFullScreen(true);
		root.getChildren().add(text);
		root.getChildren().add(imageview);
		stage.getIcons().add(imageLogo);
		stage.setScene(scene);
		stage.setTitle("First App");
		stage.show();
	}
}
