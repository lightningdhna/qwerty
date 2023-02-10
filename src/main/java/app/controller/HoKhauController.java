package app.controller;

import app.PageManager;
import app.model.manage.CICRowInfo;
import app.view.manage.DanhSachHoKhauView;
import app.view.manage.ManageCICDetailWindow;
import components.database.HoKhauTable;
import components.household.HoKhau;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import service.Service;

import java.util.ArrayList;

public class HoKhauController {

    private static HoKhauController controller = new HoKhauController();
    public static HoKhauController getController(){
        return controller;
    }
    ObservableList<HoKhau> danhSachHK= FXCollections.observableArrayList();
    public void xoaHo(HoKhau hoKhau){
        danhSachHK.remove(hoKhau);
    }
    public void themHoKhau(HoKhau hoKhau, DanhSachHoKhauView page){

    }
    public void themHoKhau(HoKhau hoKhau){
        danhSachHK.add(hoKhau);
        // csdl;
        //check chinh ta
        Service.getService().themHoKhau(hoKhau);
    }

    public boolean canAdd(HoKhau hoKhau){
        return Service.getService().canAddHoKhau(hoKhau);
    }


    public void setThongTin(DanhSachHoKhauView page){
        TableView<HoKhau> tableView = page.getTableView();

        danhSachHK.addAll(Service.getService().getAllHoKhau());
        tableView.setItems(danhSachHK);
        tableView.setRowFactory(tv -> {
            TableRow<HoKhau> tableRow = new TableRow<>();
            tableRow.setOnMouseClicked(event -> {
                if (! tableRow.isEmpty() && event.getButton()== MouseButton.PRIMARY && event.getClickCount() == 1) {
                    HoKhau hoKhau = tableRow.getItem();
                    page.chiTietHoKhau(hoKhau);
                }
            });
            return tableRow ;
        });
        ((TableColumn<HoKhau,String>)tableView.getColumns().get(0)).setCellValueFactory(new PropertyValueFactory<>("soHoKhau"));
        ((TableColumn<HoKhau,String>)tableView.getColumns().get(1)).setCellValueFactory(new PropertyValueFactory<>("tenChuHo"));
        ((TableColumn<HoKhau,String>)tableView.getColumns().get(2)).setCellValueFactory(new PropertyValueFactory<>("diaChi"));
        ((TableColumn<HoKhau,String>)tableView.getColumns().get(3)).setCellValueFactory(new PropertyValueFactory<>("trangThai"));
        ((TableColumn<HoKhau,String>)tableView.getColumns().get(4)).setCellValueFactory(new PropertyValueFactory<>("ghiChu"));
    }
}
