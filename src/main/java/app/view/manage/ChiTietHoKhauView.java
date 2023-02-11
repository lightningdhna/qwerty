package app.view.manage;

import app.controller.HoKhauController;
import app.view.viewmodel.MyWindow;
import app.view.message.Mes;
import app.model.household.HoKhau;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import service.Service;

import java.time.format.DateTimeFormatter;

public class ChiTietHoKhauView extends MyWindow {
    @FXML
    Label soHoKhauLabel,tenChuHoLabel,diaChiLabel,trangThaiLabel, thoiGianXacThucLabel,nguoiXacThucLabel,ghiChuLabel,thanhVienLabel;

    public ChiTietHoKhauView(){
        super();
    }
    private  HoKhau hoKhau;
    public void setThongTin(HoKhau hoKhau){
        this.hoKhau = hoKhau;
        soHoKhauLabel.setText(hoKhau.getSoHoKhau());
        tenChuHoLabel.setText(hoKhau.getTenChuHo());
        diaChiLabel.setText(hoKhau.getDiaChi());
        trangThaiLabel.setText(hoKhau.getTrangThai());
        thoiGianXacThucLabel.setText(hoKhau.getThoiGianXacThuc().format(DateTimeFormatter.ISO_DATE));
        nguoiXacThucLabel.setText(hoKhau.getTenNguoiXacThuc());
        ghiChuLabel.setText(hoKhau.getGhiChu());
        thanhVienLabel.setText(hoKhau.getMoTaThanhVien());
    }

    public void chinhSuaThongTin(){

        ChinhSuaHoKhauView window = new ChinhSuaHoKhauView();
        window.setHoKhau(hoKhau);
        add(window);
//        exit();
    }
    public void xoa(){
        String canXoa = Service.getService().canXoa(hoKhau);
        if (!canXoa.equals("")){
            warnKhongTheXoa();
            return;
        }
        HoKhauController.getController().xoaHoKhau(hoKhau, this);
    }
    public void yeuCauXacThuc(){
        // doSomeThing
    }

    public void warnKhongTheXoa(){
        Mes.inform("không thể xóa hộ khẩu này",Service.getService().canXoa(hoKhau));
    }

    public void thongBaoDaXoa() {
        Mes.inform("Xóa thành công", "");
    }


}
