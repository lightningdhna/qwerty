package app.model.event;

import java.time.LocalDate;

public class SuKien {

    private int maSuKien = -1;

    private String tenSuKien = "";
    private String diaDiem = "";
    private String quyChe = "";
    private String ghiChu = "";
    private int loaiSuKien;


    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;

    private String trangThai = "chưa bắt đầu";
    private LocalDate ngayTao;
    private int idNguoiTao;



    private DanhSachNhanThuong danhSach ;

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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getIdNguoiTao() {
        return idNguoiTao;
    }

    public void setIdNguoiTao(int idNguoiTao) {
        this.idNguoiTao = idNguoiTao;
    }

    public DanhSachNhanThuong getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(DanhSachNhanThuong danhSach) {
        this.danhSach = danhSach;
    }

    public SuKien(int maSuKien, String tenSuKien, String diaDiem, String quyChe, String ghiChu, int loaiSuKien, LocalDate ngayBatDau, LocalDate ngayKetThuc, String trangThai, LocalDate ngayTao, int idNguoiTao, DanhSachNhanThuong danhSach) {
        this.maSuKien = maSuKien;
        this.tenSuKien = tenSuKien;
        this.diaDiem = diaDiem;
        this.quyChe = quyChe;
        this.ghiChu = ghiChu;
        this.loaiSuKien = loaiSuKien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.idNguoiTao = idNguoiTao;
        this.danhSach = danhSach;
    }
    public SuKien(){

    }
}
