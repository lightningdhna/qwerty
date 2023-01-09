package app.view.manage;

import app.PageManager;
import app.model.Page;
import app.model.Window;
import app.model.manage.CICRowInfo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ManageCICDetailPage extends Window {
    CICRowInfo cicInfo;
    @FXML
    Label nameLabel,cicNumberLabel,dobLabel,originLocationLabel,residenceLocationLabel,temporaryLocalLabel,
            verifyStateLabel,usernameLabel,dateVerify,verifierUsernameLabel,householdNumberLabel;
    public void setInfo(CICRowInfo cicInfo){
        nameLabel.setText(cicInfo.getName());
        cicNumberLabel.setText(cicInfo.getCICNumber());
        dobLabel.setText(cicInfo.getDateOfBirth().toString());
        originLocationLabel.setText(cicInfo.getPlaceOfOrigin());
        residenceLocationLabel.setText(cicInfo.getPlaceOfResidence());
        temporaryLocalLabel.setText(cicInfo.getPlaceOfTemporaryResidence());
        verifyStateLabel.setText(cicInfo.getVerifyState());
        usernameLabel.setText(cicInfo.getUsername());
        dateVerify.setText(cicInfo.getDateVerify().toString());
        verifierUsernameLabel.setText(cicInfo.getVerifierUsername());
        householdNumberLabel.setText(cicInfo.getHouseholdNumber());
    }
    public void close(){
        PageManager.getManager().getManagePage().showTable();
    }
}
