package app.view.manage;

import app.model.Window;
import components.demogrpahic.CIC;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import service.DemographicManagementService;

public class AddCICInfoWindow extends Window {
    @FXML
    TextField name,otherName,cicNumber,placeOfOrigin,placeOfResidence, placeOfTemporary, nationality, ethnic, passportNumber;
    @FXML DatePicker dob;
    @FXML ComboBox<String> gender;
    @FXML
    TextArea note;
    public void addNewCIC(){
        CIC info = new CIC(cicNumber.getText());
        info.setName(name.getText());
        info.setOtherName(otherName.getText());
        info.setPlaceOfOrigin(placeOfOrigin.getText());
        info.setPlaceOfResidence(placeOfResidence.getText());
        info.setPlaceOfTemporaryResidence(placeOfTemporary.getText());
        info.setNationality(nationality.getText());
        info.setEthnic(ethnic.getText());
        info.setPassportNumber(passportNumber.getText());
        info.setDateOfBirth(dob.getValue());
        info.setGender(gender.getValue());
        info.setNote(note.getText());
//        if(DemographicManagementService.getService().canAdd(info))
        DemographicManagementService.getService().addCIC(info);
        exit();
    }

}
