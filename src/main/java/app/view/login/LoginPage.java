package app.view.login;

import app.controller.LoginController;
import app.model.Page;
import app.view.main.MainPage;
import com.jfoenix.controls.JFXCheckBox;
import components.accountmanagement.model.Account;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPage extends Page {

    @FXML
    TextField textField;
    PasswordField passwordField;
    JFXCheckBox checkBox;

    public void login(){
//        getRoot().getScene().setRoot(new MainPage().getRoot());
        setMainPage();
    }

    public void setMainPage(){
        getRoot().getScene().setRoot(new MainPage().getRoot());
    }
    public void singUp(){

    };
}
