package app.view.viewmodel;

import animatefx.animation.*;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class MyWindow extends Page{

    private MyWindow parentWindow = null;

    private ArrayList<Page> children = new ArrayList<>();

    public MyWindow(){
        super();
    }
    public void addWindow(Page window){
        children.add(window);
        this.getRoot().setDisable(true);
        ((MyWindow)window).setParentWindow(this);
        Thread thread = new Thread(()->{
            Platform.runLater(()->{
                Stage stage = new Stage();
                stage.setResizable(false);
                Parent root = window.getRoot();
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
            });
        });
        thread.start();
    }

    private void setParentWindow(MyWindow myWindow) {
        this.parentWindow = myWindow;
    }
    public MyWindow getParentWindow(){
        return this.parentWindow;
    }

    public void exit(){
        if(getParentWindow()!=null)
            getParentWindow().getRoot().setDisable(false);
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
