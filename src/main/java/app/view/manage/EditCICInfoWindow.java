package app.view.manage;

import app.PageManager;
import app.model.Window;
import app.model.manage.CICRowInfo;
import components.demogrpahic.CIC;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import service.DemographicManagementService;

public class EditCICInfoWindow extends Window {
    CICRowInfo cicInfo;
    @FXML
    TextField name,otherName,cicNumber,placeOfOrigin,placeOfResidence, placeOfTemporary, nationality, ethnic, passportNumber;
    @FXML
    DatePicker dob;
    @FXML
    ComboBox<String> gender;
    @FXML
    TextArea note;
    public void setInfo(CICRowInfo cicInfo){
        name.setText(cicInfo.getName());
        otherName.setText(cicInfo.getOtherName());
        cicNumber.setText(cicInfo.getCICNumber());
        dob.setValue(cicInfo.getDateOfBirth());
        placeOfOrigin.setText(cicInfo.getPlaceOfOrigin());
        placeOfResidence.setText(cicInfo.getPlaceOfResidence());
        placeOfTemporary.setText(cicInfo.getPlaceOfTemporaryResidence());
        nationality.setText(cicInfo.getNationality());
        ethnic.setText(cicInfo.getEthnic());
        passportNumber.setText(cicInfo.getPassportNumber());
        gender.setValue(cicInfo.getGender());
        note.setText(cicInfo.getNote());
    }
    public EditCICInfoWindow(){}
    public EditCICInfoWindow(CICRowInfo cicInfo){
        setInfo(cicInfo);
    }


}
