package Engine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import RestOfGame.*;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Sette opp en Group root = new Group for å holde layer med game og layer med UI ?
        FXMLLoader fxml = new FXMLLoader();
        GridPane root = (GridPane)fxml.load(getClass().getResource("/Engine/Main.fxml").openStream());
        Scene scene = new Scene(root,800,600);
        primaryStage.setScene(scene);

        primaryStage.setTitle("FXML eksempel, med animasjon");
        primaryStage.show();
        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, (MainController)fxml.getController());
    }

    public static void main(String[] args) { launch(args); }
}
