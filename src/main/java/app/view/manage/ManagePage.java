package app.view.manage;

import app.PageManager;
import app.model.Page;
import app.model.Window;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagePage extends Window {
    @FXML
    Pane showPane;
    Page currentPage;
    CICInfoTablePage cicInfoTablePage = new CICInfoTablePage();
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
    public void showTable(){
        switchPage(cicInfoTablePage);
    }

    public ManagePage(){
        super();
        PageManager.getManager().setManagePage(this);
        Thread thread = new Thread(()->{

        });
//        cicInfoTablePage = new CICInfoTablePage();
        showPage(cicInfoTablePage);
    }
}
