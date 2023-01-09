package app.view.manage;

import app.controller.ManageController;
import app.model.Page;
import app.model.manage.CICRowInfo;
import app.view.general.CICDetailPage;
import components.account.Account;
import components.demogrpahic.CIC;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class CICInfoTablePage extends Page implements Initializable {

    @FXML
    TableView tableView;

    public void showCICDetail(CICRowInfo info){
        ManageCICDetailPage page = new ManageCICDetailPage();
//        page.setInfo(info);
        add(page);
    };
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ManageController.setInfo(this,tableView);
    }
}
