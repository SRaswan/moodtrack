import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        AppFrame borders = new AppFrame();
        Label l = new Label("Hello, JavaFX, on Java");
        // Scene scene = new Scene(new StackPane(l), 590, 1278);
        Scene scene = new Scene(borders, 590, 1278);
        stage.setScene(scene);
        stage.setTitle("Mood Tracking App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}