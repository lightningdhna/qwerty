package app;

import app.view.login.LoginPage;

import components.database.DatabaseConnection;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

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
    }
}
