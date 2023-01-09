package app.view.login;

import app.controller.LoginController;
import app.model.Page;
import app.view.main.MainPage;
import com.jfoenix.controls.JFXCheckBox;
import components.account.Account;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import animatefx.animation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginPage extends Page implements Initializable {

    @FXML
    TextField textField;
    @FXML
    PasswordField passwordField;
    @FXML
    JFXCheckBox checkBox;

    public boolean getCheckBoxState(){
        return checkBox.isSelected();
    }
    public void logIn(){
        String username= textField.getText();
        String password = passwordField.getText();
        if(username==null||username.trim().equals("")||password==null||password.trim().equals("")){
            warningBlank();
            return;
        }
        LoginController.login(this,new Account(username,password));
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
        alert.setContentText("Bruh... sai cmn mật khẩu hay sao ròi");
        alert.setX(900);
        alert.setY(250);
        alert.show();
    }
    public void warningBlank(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("LOGIN FAIL");
        alert.setContentText("Đìn đủ thông tin vào đi! Bruh...");
        alert.setX(900);
        alert.setY(250);
        alert.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/save/account-save.txt"));
            textField.setText(reader.readLine());
            passwordField.setText(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
