package app.view.manage;

import app.model.MyWindow;
import app.view.message.Mes;
import components.household.HoKhau;
import service.Service;

public class ChinhSuaHoKhauView extends MyWindow {
    public ChinhSuaHoKhauView(){
        super();
    }
    private HoKhau hoKhau;
    public void setHoKhau(HoKhau hoKhau){
        this.hoKhau = hoKhau;

        //...
    }

    public void capNhatHoKhau(){
        if(!Service.getService().canCapNhat(hoKhau).equals("")){
            return;
        }

    }

    public void warnKhongTheCapNhat(){
        Mes.inform("Không thể cập nhật thông tin", Service.getService().canCapNhat(hoKhau));
    }

    public void thongBaoDaCapNhat() {
        Mes.inform("Cập nhật thành công","");
    }
}
