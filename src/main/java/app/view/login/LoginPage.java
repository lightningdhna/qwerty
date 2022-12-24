package app.view.login;

import app.controller.LoginController;
import app.model.Icon;
import app.model.Page;
import app.view.main.MainPage;
import com.almasb.fxgl.animation.AnimationBuilder;
import com.jfoenix.controls.JFXCheckBox;
import components.accountmanagement.model.Account;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import animatefx.animation.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LoginPage extends Page {

    @FXML
    TextField textField;
    PasswordField passwordField;
    JFXCheckBox checkBox;

    public void logIn(){
//        getRoot().getScene().setRoot(new MainPage().getRoot());
        setMainPage();
        loginFail();
    }

    public void setMainPage(){
        MainPage mainPage = new MainPage();
        getRoot().getScene().setRoot(mainPage.getRoot());
        new ZoomIn(mainPage.getRoot()).play();

    }
    public void signUp(){
        SignUpPage signUpPage = new SignUpPage();
        new RubberBand(signUpPage.getRoot()).play();
        add(signUpPage,800,0);
    };
    public void loginFail(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("LOGIN FAIL");
        alert.setContentText("USERNAME OR PASSWORD WRONG");
        alert.setX(900);
        alert.setY(250);
        alert.show();
    }
    public void warningBlank(){

    }
}
