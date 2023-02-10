package app.view.manage;

import app.controller.HoKhauController;
import app.model.MyWindow;
import app.model.household.HoKhau;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DanhSachHoKhauView extends MyWindow {
    public DanhSachHoKhauView (){
        super();
        HoKhauController.getController().setThongTin(this);
    }
    @FXML
    TableView tableView;
    @FXML
    TextField searchText;
    public void search(){

    }
    public void themHoKhau(HoKhau hoKhau){
        if(!HoKhauController.getController().canAdd(hoKhau))
            canhBao1();
        HoKhauController.getController().themHoKhau(hoKhau, this);
    }


    public void canhBao1(){
        //...
    }

    public TableView<HoKhau> getTableView(){
        return this.tableView;
    }

    public void chiTietHoKhau(HoKhau hoKhau){
        ChiTietHoKhauView window = new ChiTietHoKhauView();
        window.setThongTin(hoKhau);
        addWindow(window);
    }

}
