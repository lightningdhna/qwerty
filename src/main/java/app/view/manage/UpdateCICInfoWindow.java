package app.view.manage;

import app.model.Window;
import app.model.manage.CICRowInfo;
import components.demogrpahic.CIC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import service.DemographicManagementService;

public class UpdateCICInfoWindow extends Window {
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
    public UpdateCICInfoWindow(){
        ObservableList<String> genderList = FXCollections.observableArrayList();
        genderList.addAll("Nam", "Nữ","Khác");
        gender.setItems(genderList);
    }
    public UpdateCICInfoWindow(CICRowInfo cicInfo){
        this();
        setInfo(cicInfo);
    }
    public void updateInfo(){
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
        {
            DemographicManagementService.getService().updateCIC(info);
            close();
            updateSuccess();
        }
    }

    public void updateSuccess(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Thành công");
        alert.setContentText("Đã cập nhật thông tin nhân khẩu vào hệ thống");
        alert.show();
    }
}
