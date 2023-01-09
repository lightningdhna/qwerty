package app.model;

import animatefx.animation.*;
import app.view.login.LoginPage;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;

public class Window extends Page{
    ArrayList<Page> children = new ArrayList<>();
    public Window(){
        super();

    }
    public void addWindow(Page window){
        children.add(window);
        Thread thread = new Thread(()->{
            Platform.runLater(()->{
                Stage stage = new Stage();
//                stage.setResizable(false);
                Scene scene = new Scene(window.getRoot());
                scene.setFill(Color.TRANSPARENT);
                stage.setScene(scene);
//                stage.initStyle(StageStyle.TRANSPARENT);
                stage.show();
            });
        });
        thread.start();
    }
    public void exit(){

        for(Page window: children){
            window.exit();
        }
        new FadeOut(this.getRoot().getScene().getRoot()).play();
        Thread thread  = new Thread(
                ()->{
                    try {
                        Thread.sleep(100);
                        Platform.runLater(
                                ()-> ((Stage)getRoot().getScene().getWindow()).close()
                        );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
        );
        thread.start();
    }
}
