package app.view.verify;

import app.model.household.HoKhau;
import app.model.message.YeuCauXacThuc;
import app.model.message.YeuCauXacThucHoKhau;
import app.view.viewmodel.MyWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import service.Service;

import java.io.Serial;
import java.time.format.DateTimeFormatter;

public class ChiTietYeuCauXacThucHoKhauView extends MyWindow {

    @FXML
    Label soHoKhauLabel,tenChuHoLabel,diaChiLabel,trangThaiLabel,ghiChuLabel,thanhVienLabel;
    @FXML
    Label taiKhoanLabel,roleLabel,thoiGianLabel,ghiChuYCLabel;

    private YeuCauXacThucHoKhau yeuCau;
    public ChiTietYeuCauXacThucHoKhauView(){
        super();
    }

    public void setYeuCau(YeuCauXacThucHoKhau yeuCau){
        this.yeuCau = yeuCau;

        HoKhau hoKhau = Service.getService().timHoKhauBySoHoKhau(yeuCau.getNoiDung());
        soHoKhauLabel.setText(hoKhau.getSoHoKhau());
        tenChuHoLabel.setText(hoKhau.getTenChuHo());
        diaChiLabel.setText(hoKhau.getDiaChi());
        trangThaiLabel.setText(hoKhau.getTrangThai());
        ghiChuLabel.setText(hoKhau.getGhiChu());
        thanhVienLabel.setText(hoKhau.getMoTaThanhVien());

        taiKhoanLabel.setText(Service.getService().timUsernameByIDTaiKhoan(yeuCau.getIdTaiKhoanGui()));
        roleLabel.setText(Service.getService().timRoleByIDTaiKhoan(yeuCau.getIdTaiKhoanGui()));
        thoiGianLabel.setText(yeuCau.getNgayTao().format(DateTimeFormatter.ISO_DATE));
        ghiChuYCLabel.setText(yeuCau.getGhiChu());
    }


    public void phanHoi(){
        //todo
    }
    public void chapNhan(){
        //todo
    }
    public void tuChoi(){
        //todo
    }

}
