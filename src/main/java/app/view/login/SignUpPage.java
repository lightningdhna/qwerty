package app.view.login;

import animatefx.animation.ZoomOutLeft;
import animatefx.animation.ZoomOutUp;
import app.model.Page;

public class SignUpPage extends Page {

    public void backToLogin(){
        new ZoomOutLeft(this.getRoot()).play();
//        close();
    }
}
