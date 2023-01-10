package app.view.account;

import app.model.Page;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class AccountPage extends Page {
    @FXML
    Pane showPane;
    Page currentPage;
    public PersonalInfoPage infoPage = new PersonalInfoPage();
    public void showPage(Page page ){
        currentPage = page;
        if(!showPane.getChildren().contains(page.getRoot()))
            showPane.getChildren().add(page.getRoot());
    }
    public void unShowPage(Page page){
        if(page==null) return;
        showPane.getChildren().remove(page.getRoot());
    }
    public void switchPage(Page page){
        if(page==currentPage) return;
        unShowPage(currentPage);
        showPage(page);
    }
    public void showInfoPage(){
        switchPage(infoPage);
    }
    public AccountPage(){
        super();
    }
}
