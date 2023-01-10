package app.view.manage;

import app.controller.ManageController;
import app.model.Window;
import app.model.manage.CICRowInfo;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CICInfoTablePage extends Window  {

    @FXML
    TableView tableView;

    public void showCICDetail(CICRowInfo info){
        ManageCICDetailWindow page = new ManageCICDetailWindow();
//        page.setInfo(info);
        add(page);
    };
    public CICInfoTablePage(){
        ManageController.setTableInfo(this,tableView);
    }
    public void addCICWindow(){
        addWindow(new AddCICInfoWindow());
    }
    public void reload(){
        ManageController.setTableInfo(this,tableView);
    }
    @FXML
    TextField searchText;
    public void search(){
        ManageController.searchTableInfo(this,tableView, searchText.getText());
    }
}
