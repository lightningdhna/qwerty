package app.view.login;

import app.controller.LoginController;
import app.model.Page;
import app.view.main.MainPage;
import com.almasb.fxgl.animation.AnimationBuilder;
import com.jfoenix.controls.JFXCheckBox;
import components.accountmanagement.model.Account;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import animatefx.animation.*;

public class LoginPage extends Page {

    @FXML
    TextField textField;
    PasswordField passwordField;
    JFXCheckBox checkBox;

    public void logIn(){
//        getRoot().getScene().setRoot(new MainPage().getRoot());
        setMainPage();
    }

    public void setMainPage(){
        MainPage mainPage = new MainPage();
        getRoot().getScene().setRoot(mainPage.getRoot());
        new ZoomIn(mainPage.getRoot()).play();

    }
    public void signUp(){
        SignUpPage signUpPage = new SignUpPage();
        new Wobble(signUpPage.getRoot()).play();
        add(signUpPage,800,0);
    };
}
