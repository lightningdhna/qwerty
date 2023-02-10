package app.view.manage;

import app.controller.HoKhauController;
import app.model.MyWindow;
import app.view.message.Mes;
import app.model.household.HoKhau;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import org.controlsfx.tools.Duplicatable;
import service.Service;

public class ChinhSuaHoKhauView extends MyWindow {

    @FXML
    Label soHoKhauLabel;
    @FXML
    TextField tenChuHoTextField, diaChiTextField;
    @FXML
    TextArea ghiChuTextArea;

    @FXML
    VBox danhSachVBox;



    ObservableList<HBox> danhSachThanhVienHBox = FXCollections.observableArrayList();
    private HBox taoDong(){
        HBox result = new HBox();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        tf1.setPromptText("Họ tên");
        tf2.setPromptText("Quan hệ với chủ họ");
        tf1.setFont(Font.font("Sanserif",20));
        tf2.setFont(Font.font("Sanserif",20));
        tf1.setPrefSize(250,36);
        tf2.setPrefSize(190,36);

        result.setSpacing(10);
        result.getChildren().addAll(tf1,tf2);
        return result;
    }
    public void themBanGhiHBox(){
        HBox temp = taoDong();

        danhSachVBox.getChildren().add(temp);
        danhSachThanhVienHBox.add(temp);
    }


    public ChinhSuaHoKhauView(){
        super();
    }
    private HoKhau hoKhau;
    public void setHoKhau(HoKhau hoKhau){
        this.hoKhau = hoKhau.clone();
        soHoKhauLabel.setText(hoKhau.getSoHoKhau());
        tenChuHoTextField.setText(hoKhau.getTenChuHo());
        ghiChuTextArea.setText(hoKhau.getGhiChu());
        diaChiTextField.setText(hoKhau.getDiaChi());


        //...
    }

    public HoKhau getNewHoKhau(){
        HoKhau result  = new HoKhau(hoKhau.getSoHoKhau());
        result.setTenChuHo(tenChuHoTextField.getText());
        result.setDiaChi(diaChiTextField.getText());
        result.setGhiChu(ghiChuTextArea.getText());
        result.setTrangThai("Chưa xác thực");

        return result;
    }

    public void capNhatHoKhau(){

        hoKhau = getNewHoKhau();


        if(!Service.getService().canCapNhat(hoKhau).equals("")){
            return;
        }


        ((ChiTietHoKhauView)getParent()).setThongTin(hoKhau);
        HoKhauController.getController().capNhatHoKhau(hoKhau,this);
        close();
    }

    public void warnKhongTheCapNhat(){
        Mes.inform("Không thể cập nhật thông tin", Service.getService().canCapNhat(hoKhau));
    }

    public void thongBaoDaCapNhat() {
        Mes.inform("Cập nhật thành công","");
    }



}
