package app.view.manage;

import app.controller.ManageController;
import app.model.Page;
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
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ManageController.setInfo(this,tableView);
    }
}
