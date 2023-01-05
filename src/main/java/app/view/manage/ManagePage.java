package app.view.manage;

import app.PageManager;
import app.model.Page;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagePage extends Page implements Initializable {
    @FXML
    Pane showPane;
    Page currentPage;
    CICInfoTablePage cicInfoTablePage;
    ManageCICDetailPage manageCICDetailPage;
    public void showPage(Page page ){
        currentPage = page;
        if(!showPane.getChildren().contains(page))
            showPane.getChildren().add(page.getRoot());
    }
    public void unShowPage(Page page){
        showPane.getChildren().remove(page);
    }
    public void switchPage(Page page){
        unShowPage(currentPage);
        showPage(page);
    }
    public void showTable(){
        switchPage(cicInfoTablePage);
    }
    public void showManageDetailCIC(){
        switchPage(manageCICDetailPage);
    }

    public ManagePage(){
        super();
        PageManager.getManager().setManagePage(this);
        Thread thread = new Thread(()->{
            cicInfoTablePage = new CICInfoTablePage();
            manageCICDetailPage = new ManageCICDetailPage();
        });
        thread.start();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
