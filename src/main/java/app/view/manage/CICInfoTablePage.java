package app.view.manage;

import app.controller.ManageController;
import app.model.Page;
import app.model.Window;
import app.model.manage.CICRowInfo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class CICInfoTablePage extends Window implements Initializable {

    @FXML
    TableView tableView;

    public void showCICDetail(CICRowInfo info){
        ManageCICDetailWindow page = new ManageCICDetailWindow();
//        page.setInfo(info);
        add(page);
    };
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ManageController.setInfo(this,tableView);
    }
    public void addCICWindow(){
        addWindow(new AddCICInfoWindow());
    }
}
