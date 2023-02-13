package app.model.message;

import java.time.LocalDate;

public class PhanHoiSuKien {

    private int maSuKien = -1;
    private int idNguoiGui = -1 ;
    private String noiDung = "";
    private String ghiChu = "";
    private LocalDate ngayTao ;
    private String trangThai = "";

    public PhanHoiSuKien(int maSuKien, int idNguoiGui, String noiDung, String ghiChu, LocalDate ngayTao, String trangThai) {
        this.maSuKien = maSuKien;
        this.idNguoiGui = idNguoiGui;
        this.noiDung = noiDung;
        this.ghiChu = ghiChu;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }
    public PhanHoiSuKien(){

    }

    public int getMaSuKien() {
        return maSuKien;
    }

    public void setMaSuKien(int maSuKien) {
        this.maSuKien = maSuKien;
    }

    public int getIdNguoiGui() {
        return idNguoiGui;
    }

    public void setIdNguoiGui(int idNguoiGui) {
        this.idNguoiGui = idNguoiGui;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
