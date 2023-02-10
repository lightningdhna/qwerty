package components.household;

import service.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class HoKhau {
    private String soHoKhau;

    public String getIdChuHo() {
        return idChuHo;
    }

    public void setIdChuHo(String idChuHo) {
        this.idChuHo = idChuHo;
    }

    private String idChuHo;
    private String diaChi;
    private String anhMinhChung;
    private LocalDateTime thoiGianXacThuc;
    private int idNguoiXacThuc;
    private String trangThai;
    private String ghiChu;
    private ArrayList<String> danhSachThanhVien;



    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }



    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getAnhMinhChung() {
        return anhMinhChung;
    }

    public void setAnhMinhChung(String anhMinhChung) {
        this.anhMinhChung = anhMinhChung;
    }



    public LocalDateTime getThoiGianXacThuc() {
        return thoiGianXacThuc;
    }

    public void setThoiGianXacThuc(LocalDateTime thoiGianXacThuc) {
        this.thoiGianXacThuc = thoiGianXacThuc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getIdNguoiXacThuc() {
        return idNguoiXacThuc;
    }

    public void setIdNguoiXacThuc(int idNguoiXacThuc) {
        this.idNguoiXacThuc = idNguoiXacThuc;
    }

    public ArrayList<String> getDanhSachThanhVien() {
        return danhSachThanhVien;
    }

    public void setDanhSachThanhVien(ArrayList<String> danhSachThanhVien) {
        this.danhSachThanhVien = danhSachThanhVien;
    }
    public HoKhau(String soHoKhau){
        this.soHoKhau = soHoKhau;
    }
    public String getTenChuHo(){
        return Service.getService().searchTenChuHoByID(idChuHo);
    }

}
