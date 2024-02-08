import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
    public void start(Stage primaryStage) {
     FlowPane root = new FlowPane();
        root.setHgap(10); // Horizontal gap between components
        root.setVgap(10); // Vertical gap between components

        // Add buttons to the FlowPane
        for (int i = 1; i <= 10; i++) {
            root.getChildren().add(new Button("Button " + i));
        }

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

