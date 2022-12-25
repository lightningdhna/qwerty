package app.controller;

import animatefx.animation.FadeOut;
import app.Main;
import app.view.login.LoginPage;
import app.view.login.SignUpPage;
import components.accountmanagement.AccountManagementService;
import components.accountmanagement.model.Account;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LoginController {
    public static void login(LoginPage page, Account account){
        if(AccountManagementService.getManager().checkExist(account)){
            Main.setAccountID(account.getId());
            page.setMainPage();
//            new FadeOut(page.getRoot()).play();
            Thread thread = new Thread(
                    () -> {
                        Main.setAccountID(account.getId());
                        if(page.getCheckBoxState()){
                            try {
                                BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/save/account-save.txt"));
                                writer.write(account.getUsername()+'\n'+account.getPassword());
                                writer.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                        else{
                            try {
                                BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/save/account-save.txt"));
                                writer.write("");
                                writer.flush();
                                writer.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                    }
            );
            thread.start();
        }
        else{
            page.loginFail();
        };
    }
    public static void signUp(SignUpPage page, Account account, String email){
        if(AccountManagementService.getManager().add(account)){
            page.signUpSuccess();
        }
        else{
            page.signUpFail();
        }
    }
}
