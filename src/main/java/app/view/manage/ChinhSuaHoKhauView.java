package app.view.manage;

import app.controller.HoKhauController;
import app.model.demographic.NhanKhau;
import app.view.viewmodel.MyWindow;
import app.view.message.Mes;
import app.model.household.HoKhau;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
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
    private HBox taoDong(String s1, String s2, String s3){
        HBox result = new HBox();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Label label = new Label();

        tf1.setPromptText("Số CCCD");
        tf2.setPromptText("Quan hệ với chủ họ");

        tf1.setFont(Font.font("Sanserif",16));
        tf2.setFont(Font.font("Sanserif",16));
        label.setFont(Font.font("Sanserif",16));
        label.setStyle("-fx-background-radius: 0; -fx-background-color: #EEEEEE");

        tf1.setPrefSize(130,36);
        tf2.setPrefSize(110,36);
        label.setPrefSize(200,40);

        tf1.setText(s1);
        tf2.setText(s2);
        label.setText(s3);


        result.setSpacing(5);
        result.getChildren().addAll(tf1,tf2, label);
        return result;
    }
    public void themBanGhiHBox(){
        HBox temp = taoDong("","","");

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

        for(NhanKhau nhanKhau : hoKhau.getDanhSachThanhVien()){
            taoDong(nhanKhau.getSoCanCuoc(),nhanKhau.getQuanHeChuHo(),nhanKhau.getHoTen());
        }
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

    public void xoaDong(){
        if(danhSachThanhVienHBox.size()==0)
            return;
        danhSachVBox.getChildren().remove(danhSachVBox.getChildren().size()-1);
        danhSachThanhVienHBox.remove(danhSachThanhVienHBox.size()-1);
    }
}
