package app.view.login;

import animatefx.animation.ZoomOutLeft;
import animatefx.animation.ZoomOutUp;
import app.model.Page;
import javafx.scene.control.Alert;
import org.w3c.dom.events.MouseEvent;

public class SignUpPage extends Page {

    public void backToLogin(){
        new ZoomOutLeft(this.getRoot()).play();
//        close();
    }
    public void signUp(){
        signUpFail();
        signUpSuccess();
    }
    public void signUpFail(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("SIGN UP FAIL");
        alert.setContentText("USERNAME IS ALREADY USED");
        alert.setX(900);
        alert.setY(250);
        alert.show();
    }
    public void signUpSuccess(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SIGN UP SUCCESS");
        alert.setContentText("Your account has been created");
        alert.setX(900);
        alert.setY(250);
        alert.show();
        backToLogin();
    }
}
