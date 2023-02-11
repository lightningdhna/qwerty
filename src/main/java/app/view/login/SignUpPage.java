package app.view.login;

import animatefx.animation.ZoomOutLeft;
import app.controller.LoginController;
import app.view.viewmodel.Page;
import app.model.account.Account;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpPage extends Page {

    @FXML
    TextField usernameTextField, emailTextField;
    @FXML
    PasswordField passwordField, passwordFieldRetype;

    public void backToLogin(){
        new ZoomOutLeft(this.getRoot()).play();
//        close();
    }

    public void signUp(){
        String username = usernameTextField.getText();
        String password = passwordField.getText();
        if(username.trim().equals("")||password.trim().equals("")){
            warningBlank();
            return;
        }
        if(!password.equals(passwordFieldRetype.getText())){
            warningWrongRetypepass();
            return;
        }
        LoginController.signUp(this,new Account(username,password), emailTextField.getText());
    }
    public void signUpFail(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("SIGN UP FAIL");
        alert.setContentText("Tên tài khoản đã được sử dụng");
        alert.setX(900);
        alert.setY(250);
        alert.show();
    }
    public void signUpSuccess(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SIGN UP SUCCESS");
        alert.setContentText("Tạo tài khoản thành công.\n Sử dụng đăng kí thông tin để đăng nhập");
        alert.setX(900);
        alert.setY(250);
        alert.show();
        backToLogin();
    }
    public void warningBlank(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("LOGIN FAIL");
        alert.setContentText("Vui lòng điền đầy đủ thông tin");
        alert.setX(900);
        alert.setY(250);
        alert.show();
    };
    public void warningWrongRetypepass(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("LOGIN FAIL");
        alert.setContentText("Mật khẩu điền lại không khớp");
        alert.setX(900);
        alert.setY(250);
        alert.show();
    };
}
