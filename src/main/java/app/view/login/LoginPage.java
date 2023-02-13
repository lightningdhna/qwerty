package app.view.login;

import app.controller.LoginController;
import app.view.viewmodel.Page;
import app.view.main.MainPage;
import com.jfoenix.controls.JFXCheckBox;
import app.model.account.Account;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import animatefx.animation.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

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
        Account acount = new Account(username,password);
        LoginController.login(this,acount);
        mainPage.getAvatar().setAccount(acount);
    }
    MainPage mainPage = new MainPage();
    public void setMainPage(){
        Scene scene =getRoot().getScene();
        Parent root = mainPage.getRoot();

        Stage stage = (Stage) scene.getWindow();
        scene.setRoot(root);
        new ZoomIn(mainPage.getRoot()).play();
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
//        mainPage.setAccount(account);

    }
    public void signUp(){
        SignUpPage signUpPage = new SignUpPage();
        new RubberBand(signUpPage.getRoot()).play();
        add(signUpPage,800,0);
    };
    public void loginFail(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("LOGIN FAIL");
        alert.setContentText("Thông tin sai :)");
        alert.setX(900);
        alert.setY(250);
        alert.show();
    }
    public void warningBlank(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("LOGIN FAIL");
        alert.setContentText("Vui lòng điền đủ thông tin.");
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
