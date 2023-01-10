package app.view.manage;

import app.model.MyWindow;
import components.demogrpahic.CIC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import service.DemographicManagementService;

public class AddCICInfoWindow extends MyWindow {
    @FXML
    TextField name,otherName,cicNumber,placeOfOrigin,placeOfResidence, placeOfTemporary, nationality, ethnic, passportNumber;
    @FXML DatePicker dob;
    @FXML ComboBox<String> gender;
    @FXML
    TextArea note;
    public AddCICInfoWindow(){
        ObservableList<String> genderList = FXCollections.observableArrayList();
        genderList.addAll("Nam", "Nữ","Khác");
        gender.setItems(genderList);
        nationality.setText("Việt Nam");
        ethnic.setText("Kinh");

    }
    public void addNewCIC(){
        CIC info = new CIC();
        info.setCICNumber(cicNumber.getText());
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
//        if(DemographicManagementService.getService().)
        {
            DemographicManagementService.getService().addCIC(info);
            addSuccess();
        }
        exit();
    }
    public void addSuccess(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Thành công");
        alert.setContentText("Đã thêm thông tin nhân khẩu vào hệ thống");
        alert.show();
    }

}
