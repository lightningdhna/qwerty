package app.view.main;

import animatefx.animation.*;
import app.Main;
import app.model.Page;
import app.view.account.AccountPage;
import app.view.home.HomePage;
import app.view.login.LoginPage;
import app.view.manage.ManagePage;
import app.view.message.Mes;
import app.view.register.RegisterPage;
import app.view.statistic.StatisticPage;
import app.view.verify.VerifyPage;
import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class MainPage extends Page  {

    @FXML
    Pane bigTaskBar, smallTaskBar;
    @FXML
    AnchorPane rootPane;
    @FXML
    JFXButton smb1,smb2,smb3,smb4,smb5,smb6;
    @FXML
    JFXButton homeButton,accountButton, registerButton, verifyButton, manageButton, statisticButton, settingButton,testButton;
    @FXML
    Label pageInfoLabel;
    JFXButton [] buttons;
    JFXButton smButtons[];
    Page[] pages;
    String [] pageName = {"Home", "Account", "Register", "Verify","Manage", "Statistic"};


    public void showBigTaskBar(){
        if(!rootPane.getChildren().contains(bigTaskBar)) {
            rootPane.getChildren().add(bigTaskBar);
            new FadeIn(bigTaskBar).play();
        }
    }
    public void unShowBigTaskBar(){
        rootPane.getChildren().remove(bigTaskBar);
//        bigTaskBar.toBack();
    }
    public void abc(){
        System.out.println("abc");
    }


    public int getSourceIndexButtons(MouseEvent mouseEvent){
        JFXButton button = (JFXButton) mouseEvent.getSource();
        for(int i=0;i<buttons.length;i++){
            if(button==buttons[i]){
                return i;
            }
        }
        for(int i=0;i<smButtons.length;i++){
            if(button==smButtons[i]){
                return i;
            }
        }
        return -1;
    }

    public void showPage(int index){
        if(index<0 || index >= pages.length)
            return;
        Page page = pages[index];
        switchToPage(page, 100,100);
        new FadeIn(page.getRoot()).play();
        bigTaskBar.toFront();
        pageInfoLabel.setText(pageName[index]);
    }

    EventHandler<MouseEvent> buttonEventHandler = mouseEvent -> {
        int index = getSourceIndexButtons(mouseEvent);
        if(mouseEvent.getEventType() == MouseEvent.MOUSE_CLICKED){
            if(pages[index]==null){
                System.out.println(pages[index].getClass().toString());
            }
            showPage(index);
        }
        unShowBigTaskBar();
        if(index!=4)
            Mes.messageUnfinished();
    };

    public MainPage(){
        super();
        rootPane.getChildren().remove(bigTaskBar);
        bigTaskBar.setLayoutX(0);

        HomePage homePage = new HomePage();
        AccountPage accountPage = new AccountPage();
        RegisterPage registerPage = new RegisterPage();
        VerifyPage verifyPage = new VerifyPage();
        ManagePage managePage = new ManagePage();
        StatisticPage statisticPage = new StatisticPage();


        smButtons= new JFXButton[]{smb1,smb2,smb3,smb4,smb5,smb6};
        buttons = new JFXButton[]{homeButton,accountButton, registerButton, verifyButton, manageButton, statisticButton};
        pages   =  new Page[]    {homePage  ,  accountPage, registerPage  , verifyPage  , managePage  , statisticPage  };

        for(var button : buttons){
            button.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonEventHandler);
        }
        for(var button : smButtons){
            button.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonEventHandler);
        }
    }
    public void logOut(){
        exit();

        Thread thread = new Thread(()->{
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Platform.runLater(()->{
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
            });
        });
        thread.start();

    }
}
