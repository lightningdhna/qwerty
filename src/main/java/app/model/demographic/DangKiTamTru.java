package app.model.demographic;

import java.time.LocalDate;

public class DangKiTamTru {

    private String soCCCD = "";
    private String diaChi = "";
    private LocalDate ngayBatDau ;
    private LocalDate ngayKetThuc;
    private String liDo;
    private String trangThaiDuyet  = "";

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getLiDo() {
        return liDo;
    }

    public void setLiDo(String liDo) {
        this.liDo = liDo;
    }

    public String getTrangThaiDuyet() {
        return trangThaiDuyet;
    }

    public void setTrangThaiDuyet(String trangThaiDuyet) {
        this.trangThaiDuyet = trangThaiDuyet;
    }
    public DangKiTamTru(){

    }

    public DangKiTamTru(String soCCCD, String diaChi, LocalDate ngayBatDau, LocalDate ngayKetThuc, String liDo, String trangThaiDuyet) {
        this.soCCCD = soCCCD;
        this.diaChi = diaChi;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.liDo = liDo;
        this.trangThaiDuyet = trangThaiDuyet;
    }
}
