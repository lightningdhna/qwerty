package app.view.manage;

import app.model.Page;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class ManagePage extends Page {
    @FXML
    Pane showPane;
    public void showTable(){
        CICInfoTablePage cicInfoTablePage = new CICInfoTablePage();
        showPane.getChildren().add(cicInfoTablePage.getRoot());
    }
}
