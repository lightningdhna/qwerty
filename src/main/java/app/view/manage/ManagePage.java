package app.view.manage;

import app.view.viewmodel.PageManager;
import app.view.viewmodel.Page;
import app.view.viewmodel.MyWindow;
import app.view.message.Mes;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class ManagePage extends MyWindow {
    @FXML
    Pane showPane;
    Page currentPage;
    CICInfoTablePage cicInfoTablePage = new CICInfoTablePage();
    DanhSachHoKhauView hoKhauView = new DanhSachHoKhauView();
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
    public void notDone(){
        Mes.messageUnfinished();
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

    public void setDanhSachHoKhauView(){
        switchPage(hoKhauView);
    }
}
