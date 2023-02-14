package app.model.event;

import java.time.LocalDate;

public class LichSuSuKien {
    private int maSuKien = -1;

    private String tenSuKien = "";
    private String diaDiem = "";
    private String quyChe = "";
    private String ghiChu = "";
    private int loaiSuKien;


    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;

    private String phanHoiChung = "";
    private double tongGiaTri = -1;

    public double getTongGiaTri() {
        return tongGiaTri;
    }

    public void setTongGiaTri(double tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }

    public int getMaSuKien() {
        return maSuKien;
    }

    public void setMaSuKien(int maSuKien) {
        this.maSuKien = maSuKien;
    }

    public String getTenSuKien() {
        return tenSuKien;
    }

    public void setTenSuKien(String tenSuKien) {
        this.tenSuKien = tenSuKien;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getQuyChe() {
        return quyChe;
    }

    public void setQuyChe(String quyChe) {
        this.quyChe = quyChe;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getLoaiSuKien() {
        return loaiSuKien;
    }

    public void setLoaiSuKien(int loaiSuKien) {
        this.loaiSuKien = loaiSuKien;
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

    public String getPhanHoiChung() {
        return phanHoiChung;
    }

    public void setPhanHoiChung(String phanHoiChung) {
        this.phanHoiChung = phanHoiChung;
    }

    public LichSuSuKien(int maSuKien, String tenSuKien, String diaDiem, String quyChe, String ghiChu, int loaiSuKien, LocalDate ngayBatDau, LocalDate ngayKetThuc, String phanHoiChung) {
        this.maSuKien = maSuKien;
        this.tenSuKien = tenSuKien;
        this.diaDiem = diaDiem;
        this.quyChe = quyChe;
        this.ghiChu = ghiChu;
        this.loaiSuKien = loaiSuKien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.phanHoiChung = phanHoiChung;
    }
    public LichSuSuKien(){

    }
}
