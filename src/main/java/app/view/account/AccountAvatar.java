package app.view.account;

import app.model.account.Account;
import app.view.login.LoginPage;
import app.view.viewmodel.MyWindow;
import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.util.concurrent.atomic.AtomicReference;

public class AccountAvatar extends MyWindow{
    public AccountAvatar(){
        super();
        click();
    }

    @FXML
    JFXButton avatarButton;
    @FXML
    VBox avatarVBox;
    @FXML
    AnchorPane anchorPane;

    Account account;

    public void setAccount(Account account){
        avatarButton.setText(account.getUsername());
        this.account = account;
    }


    public void click(){
        getRoot().toFront();
        if(avatarVBox.getChildren().contains(anchorPane)) {
            avatarVBox.getChildren().remove(anchorPane);

        }
        else avatarVBox.getChildren().add(anchorPane);
    }
    public void closeAnchorPane(){
        avatarVBox.getChildren().remove(anchorPane);
    }

    public void logOut(){

        Thread thread = new Thread(()->{
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Platform.runLater(()->{

            });
        });
        thread.start();
        exit();
        Stage stage = new Stage();
        stage.setResizable(false);
        AnchorPane root = new LoginPage().getRoot();
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
        AtomicReference<Double> xOffset = new AtomicReference<>((double) 0);
        AtomicReference<Double> yOffset = new AtomicReference<>((double) 0);
        root.setOnMousePressed((MouseEvent event) -> {
            xOffset.set(event.getSceneX());
            yOffset.set(event.getSceneY());
        });

        // Move around here
        root.setOnMouseDragged((MouseEvent event) -> {
            stage.setX(event.getScreenX() - xOffset.get());
            stage.setY(event.getScreenY() - yOffset.get());
        });
    }

}
