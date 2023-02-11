package app.view.manage;

import app.view.viewmodel.PageManager;
import app.controller.ManageController;
import app.view.viewmodel.MyWindow;
import app.model.demographic.CICRowInfo;
import app.view.message.Mes;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageCICDetailWindow extends MyWindow {
    CICRowInfo cicInfo;
    @FXML
    Label nameLabel,cicNumberLabel,dobLabel,originLocationLabel,residenceLocationLabel,temporaryLocalLabel,
            verifyStateLabel,usernameLabel,dateVerify,verifierUsernameLabel,householdNumberLabel;

    @FXML
    Label  passportNumberLabel, ethnicLabel, nationalityLabel, genderLabel, otherNameLabel;
    @FXML
    TextArea noteLabel;
    public void setInfo(CICRowInfo cicInfo){
        this.cicInfo = cicInfo;
        noteLabel.setText(cicInfo.getNote());
        passportNumberLabel.setText(cicInfo.getPassportNumber());
        ethnicLabel.setText(cicInfo.getEthnic());
        nationalityLabel.setText(cicInfo.getNationality());
        genderLabel.setText(cicInfo.getGender());
        otherNameLabel.setText(cicInfo.getOtherName());
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


    public void edit(){
        add(new UpdateCICInfoWindow(cicInfo));
    }

    public void deleteInfo(){
        ManageController.deleteInfo(this,cicInfo);
    }

    public void notDone(){
        Mes.messageUnfinished();
    }
}
