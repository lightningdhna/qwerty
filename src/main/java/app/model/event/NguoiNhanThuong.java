package app.model.event;

import app.model.demographic.NhanKhau;

import java.time.LocalDate;

public class NguoiNhanThuong {

    private GiaiThuong giaiThuong;
    private NhanKhau nguoiNhan;
    private String thongTin = "";
    private String ghiChu  = "";

    private String trangThaiDuyet = "Chưa duyệt";
    private int idNguoiDuyet = -1;
    private LocalDate ngayDuyet ;

    private String anhMinhChung = "";

    public NguoiNhanThuong(GiaiThuong giaiThuong, NhanKhau nguoiNhan, String thongTin, String ghiChu, String trangThaiDuyet, int idNguoiDuyet, LocalDate ngayDuyet, String anhMinhChung) {
        this.giaiThuong = giaiThuong;
        this.nguoiNhan = nguoiNhan;
        this.thongTin = thongTin;
        this.ghiChu = ghiChu;
        this.trangThaiDuyet = trangThaiDuyet;
        this.idNguoiDuyet = idNguoiDuyet;
        this.ngayDuyet = ngayDuyet;
        this.anhMinhChung = anhMinhChung;
    }
    public NguoiNhanThuong(){

    }

    public GiaiThuong getGiaiThuong() {
        return giaiThuong;
    }

    public void setGiaiThuong(GiaiThuong giaiThuong) {
        this.giaiThuong = giaiThuong;
    }

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

    public String getTrangThaiDuyet() {
        return trangThaiDuyet;
    }

    public void setTrangThaiDuyet(String trangThaiDuyet) {
        this.trangThaiDuyet = trangThaiDuyet;
    }

    public int getIdNguoiDuyet() {
        return idNguoiDuyet;
    }

    public void setIdNguoiDuyet(int idNguoiDuyet) {
        this.idNguoiDuyet = idNguoiDuyet;
    }

    public LocalDate getNgayDuyet() {
        return ngayDuyet;
    }

    public void setNgayDuyet(LocalDate ngayDuyet) {
        this.ngayDuyet = ngayDuyet;
    }

    public String getAnhMinhChung() {
        return anhMinhChung;
    }

    public void setAnhMinhChung(String anhMinhChung) {
        this.anhMinhChung = anhMinhChung;
    }
}
