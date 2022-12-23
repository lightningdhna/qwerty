package app.view.login;

import app.controller.LoginController;
import app.model.Page;
import components.accountmanagement.model.Account;

public class LoginPage extends Page {
    public void abc(){
        LoginController.login(this,new Account("a","b"));
    }

    public void signIn(){};
    public void singUp(){};
}
