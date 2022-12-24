package app.view.main;

import animatefx.animation.FadeInLeft;
import animatefx.animation.*;
import app.model.Page;
import app.view.account.AccountPage;
import app.view.home.HomePage;
import app.view.manage.ManagePage;
import app.view.register.RegisterPage;
import app.view.statistic.StatisticPage;
import app.view.verify.VerifyPage;
import com.jfoenix.controls.JFXButton;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPage extends Page implements Initializable {

    @FXML
    Pane bigTaskBar, smallTaskBar;
    @FXML
    AnchorPane rootPane;
    @FXML
    JFXButton homeButton,accountButton, registerButton, verifyButton, manageButton, statisticButton, settingButton,testButton;
    JFXButton [] buttons;
    Page[] pages;

    public void showBigTaskBar(){
        if(!rootPane.getChildren().contains(bigTaskBar)) {
            rootPane.getChildren().add(bigTaskBar);
            new FadeIn(bigTaskBar).play();
        }
    }
    public void unShowBigTaskBar(){
        rootPane.getChildren().remove(bigTaskBar);
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
        return -1;
    }

    public void showPage(int index){
        Page page = pages[index];
        switchToPage(page, 100,120);
        new FadeIn(page.getRoot()).play();
        bigTaskBar.toFront();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rootPane.getChildren().remove(bigTaskBar);
        bigTaskBar.setLayoutX(0);


        HomePage homePage = new HomePage();
        AccountPage accountPage = new AccountPage();
        RegisterPage registerPage = new RegisterPage();
        VerifyPage verifyPage = new VerifyPage();
        ManagePage managePage = new ManagePage();
        StatisticPage statisticPage = new StatisticPage();

        buttons = new JFXButton[]{homeButton,accountButton, registerButton, verifyButton, manageButton, statisticButton,settingButton};
        pages   =  new Page[]    {homePage  ,  accountPage, registerPage  , verifyPage  , managePage  , statisticPage  , statisticPage};

        EventHandler<MouseEvent> buttonEventHandler = mouseEvent -> {
            int index = getSourceIndexButtons(mouseEvent);
            if(mouseEvent.getEventType() == MouseEvent.MOUSE_CLICKED){
                if(pages[index]==null){
                    System.out.println(pages[index].getClass().toString());
                }
                showPage(index);
            }
        };
        for(var button : buttons){
            button.addEventHandler(MouseEvent.ANY,buttonEventHandler);
        }
    }
}
