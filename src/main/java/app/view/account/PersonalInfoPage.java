package app.view.account;

import app.model.MyWindow;
import app.model.manage.CICRowInfo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class PersonalInfoPage extends MyWindow {
    @FXML
    AnchorPane nkPane,nk2Pane;

    CICRowInfo cicInfo;
    @FXML
    Label nameLabel,cicNumberLabel,dobLabel,originLocationLabel,residenceLocationLabel,temporaryLocalLabel;

    public void showNK(){
        if(nk2Pane.getChildren().contains(nkPane)){
            nk2Pane.getChildren().remove(nkPane);
        }
        else {
            nk2Pane.getChildren().add(nkPane);
        }
    }
    public PersonalInfoPage(){
        super();
        showNK();
    }

}
