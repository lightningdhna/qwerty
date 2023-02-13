package app.model.event;

import app.model.demographic.NhanKhau;

public class DangKi {
    private NhanKhau nguoiNhan;
    private String thongTin = "";
    private String ghiChu  = "";
    private String anhMinhChung = "";

    public NhanKhau getNguoiNhan() {
        return nguoiNhan;
    }

    public void setNguoiNhan(NhanKhau nguoiNhan) {
        this.nguoiNhan = nguoiNhan;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getAnhMinhChung() {
        return anhMinhChung;
    }

    public void setAnhMinhChung(String anhMinhChung) {
        this.anhMinhChung = anhMinhChung;
    }
    public DangKi(){

    }

    public DangKi(NhanKhau nguoiNhan, String thongTin, String ghiChu, String anhMinhChung) {
        this.nguoiNhan = nguoiNhan;
        this.thongTin = thongTin;
        this.ghiChu = ghiChu;
        this.anhMinhChung = anhMinhChung;
    }
}
