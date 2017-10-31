import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Wheel Fitment");
//        GridPane root = new GridPane();
        BorderPane root = new BorderPane();
        GUI controller = new  GUI(root);
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();

    }
}