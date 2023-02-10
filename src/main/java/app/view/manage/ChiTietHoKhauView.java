package app.view.manage;

import app.model.MyWindow;
import components.household.HoKhau;

public class ChiTietHoKhauView extends MyWindow {
    public ChiTietHoKhauView(){
        super();
    }
    private  HoKhau hoKhau;
    public void setThongTin(HoKhau hoKhau){
        this.hoKhau = hoKhau;
    }
}
