import io.Win;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //your code

        Win.open(1000, 700);
        Win.bg(Color.WHITESMOKE);



    }

    
    public static void main(String[] args) {
        launch();
    }
}
