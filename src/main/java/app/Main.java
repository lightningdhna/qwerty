package app;

import app.view.login.LoginPage;

import components.database.DatabaseConnection;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private double xOffset = 0;
    private double yOffset = 0;

    private static int accountID;
    public static int getAccountID(){
        return accountID;
    }
    public static void setAccountID(int id){
        accountID = id;
    }
    public static void main(String... args){
        Thread thread = new Thread(DatabaseConnection::startConnecting);
        thread.start();
        launch();
        DatabaseConnection.closeConnection();
    }
    @Override
    public void start(Stage stage) {
        stage.setResizable(false);
        Scene scene = new Scene(new LoginPage().getRoot());
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
        Parent root = scene.getRoot();
        root.setOnMousePressed((MouseEvent event) -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        // Move around here
        root.setOnMouseDragged((MouseEvent event) -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }
}
