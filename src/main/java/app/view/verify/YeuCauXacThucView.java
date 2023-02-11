package app.view.verify;

import app.database.YeuCauXacThucTable;
import app.model.message.YeuCauXacThuc;
import app.model.message.YeuCauXacThucHoKhau;
import app.view.viewmodel.MyWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.format.DateTimeFormatter;

public class YeuCauXacThucView extends MyWindow {
    @FXML
    Label thoiGianLabel,tieuDeLabel,noiDungLabel;

    private YeuCauXacThuc yeuCau;
    public YeuCauXacThucView(){
        super();
    }

    public void setYeuCau(YeuCauXacThuc yeuCau){
        this.yeuCau = yeuCau;
        thoiGianLabel.setText(yeuCau.getNgayTao().format(DateTimeFormatter.ISO_DATE));
        tieuDeLabel.setText(yeuCau.getTieuDe());

        if(yeuCau.getTieuDe().equals("Yêu cầu xác thực nhân khẩu")){
            noiDungLabel.setText("Số CCCD: "+ yeuCau.getNoiDung());
        }
        else if(yeuCau.getTieuDe().equals("Yêu cầu xác thực hộ khẩu")){
            noiDungLabel.setText("Số hộ khẩu: "+ yeuCau.getNoiDung());
        }
        else if(yeuCau.getTieuDe().equals("Yêu cầu xác thực thành tích")){
//            noiDungLabel.setText("Thành tích: "+ yeuCau.getNoiDung());
        };
        //
    }

    public void taoChiTietYeuCau(){
        if(yeuCau.getTieuDe().equals("Yêu cầu xác thực hộ khẩu")){
            ChiTietYeuCauXacThucHoKhauView chiTietView = new ChiTietYeuCauXacThucHoKhauView();
            chiTietView.setYeuCau((YeuCauXacThucHoKhau) yeuCau);
            addWindow(chiTietView);
        }

        //todo
    }


}
