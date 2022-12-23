package app;

import app.view.login.LoginPage;
import app.view.main.MainPage;
import components.database.DatabaseConnectionService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static org.controlsfx.tools.Utils.getWindow;

public class Main extends Application {

    public static void main(String... args){
        Thread thread = new Thread(DatabaseConnectionService::startConnecting);
        thread.start();
        launch();
        DatabaseConnectionService.closeConnection();
    }
    @Override
    public void start(Stage stage) {
        stage.setResizable(false);
        Scene scene = new Scene(new LoginPage().getRoot());
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }
}
