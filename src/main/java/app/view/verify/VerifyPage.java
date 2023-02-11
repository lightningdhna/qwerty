package app.view.verify;

import app.model.message.YeuCauXacThuc;
import app.view.viewmodel.Page;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import service.Service;

public class VerifyPage extends Page {

    @FXML
    VBox yeuCauVBox;
    public VerifyPage(){
        super();
    }
    @FXML
    Label thongBaoLabel;

    XacThucThanhTichView thanhTichView = new XacThucThanhTichView();
    XacThucHoKhauView hoKhauView = new XacThucHoKhauView();
    XacThucNhanKhauView nhanKhauView = new XacThucNhanKhauView();



    public void taoXacThucHoKhauView(){
        yeuCauVBox.getChildren().clear();
        if(Service.getService().getAllYeuCauXacThucHoKhau().size()==0){
            thongBaoLabel.setText("Không có yêu cầu xac thực!");
            return ;
        }
        for(YeuCauXacThuc yeuCau : Service.getService().getAllYeuCauXacThucHoKhau()){
            YeuCauXacThucView yeuCauView = new YeuCauXacThucView();
            yeuCauView.setYeuCau(yeuCau);
            yeuCauVBox.getChildren().add(yeuCauView.getRoot());
        }
    }
    public void taoXacThucNhanKhauView(){
        yeuCauVBox.getChildren().clear();
        if(Service.getService().getAllYeuCauXacThucNhanKhau().size()==0){
            thongBaoLabel.setText("Không có yêu cầu xac thực!");
            return ;
        }
        for(YeuCauXacThuc yeuCau : Service.getService().getAllYeuCauXacThucNhanKhau()){
            YeuCauXacThucView yeuCauView = new YeuCauXacThucView();
            yeuCauView.setYeuCau(yeuCau);
            yeuCauVBox.getChildren().add(yeuCauView.getRoot());
        }
    }
    public void taoXacThucThanhTichView(){
        yeuCauVBox.getChildren().clear();
        if(Service.getService().getAllYeuCauXacThucThanhTich().size()==0){
            thongBaoLabel.setText("Không có yêu cầu xac thực!");
            return ;
        }
        for(YeuCauXacThuc yeuCau : Service.getService().getAllYeuCauXacThucThanhTich()){
            YeuCauXacThucView yeuCauView = new YeuCauXacThucView();
            yeuCauView.setYeuCau(yeuCau);
            yeuCauVBox.getChildren().add(yeuCauView.getRoot());
        }
    }
}
