package components.demographic;

import service.Service;

import java.time.LocalDate;
import java.util.ArrayList;

public class NhanKhau {

    private String soCanCuoc ;
    private String dacDiemNhanDang = "";
    private String hoTen = "";
    private String tenKhac = "";
    private LocalDate ngaySinh = LocalDate.of(2000,1,1);
    private String gioiTinh = "Nam";
    private String queQuan ="";
    private String thuongTru = "";
    private String tamTru ="";
    private String quocTich = "Việt Nam";
    private String danToc = "Kinh";
    private String soHoChieu ="";
    private String trangThai = "Chưa xác thực";
    private LocalDate ngayXacThuc ;
    private String idNguoiXacThuc = "";
    private String ghiChu ="";
    private String quanHeChuHo = "";

    public String getQuanHeChuHo() {
        return quanHeChuHo;
    }

    public void setQuanHeChuHo(String quanHeChuHo) {
        this.quanHeChuHo = quanHeChuHo;
    }

    public String getSoCanCuoc() {
        return soCanCuoc;
    }

    public void setSoCanCuoc(String soCanCuoc) {
        this.soCanCuoc = soCanCuoc;
    }

    public String getDacDiemNhanDang() {
        return dacDiemNhanDang;
    }

    public void setDacDiemNhanDang(String dacDiemNhanDang) {
        this.dacDiemNhanDang = dacDiemNhanDang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenKhac() {
        return tenKhac;
    }

    public void setTenKhac(String tenKhac) {
        this.tenKhac = tenKhac;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getThuongTru() {
        return thuongTru;
    }

    public void setThuongTru(String thuongTru) {
        this.thuongTru = thuongTru;
    }

    public String getTamTru() {
        return tamTru;
    }

    public void setTamTru(String tamTru) {
        this.tamTru = tamTru;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDate getNgayXacThuc() {
        return ngayXacThuc;
    }

    public void setNgayXacThuc(LocalDate ngayXacThuc) {
        this.ngayXacThuc = ngayXacThuc;
    }

    public String getIdNguoiXacThuc() {
        return idNguoiXacThuc;
    }

    public void setIdNguoiXacThuc(String idNguoiXacThuc) {
        this.idNguoiXacThuc = idNguoiXacThuc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public NhanKhau(String soCanCuoc, String dacDiemNhanDang, String hoTen, String tenKhac, LocalDate ngaySinh, String gioiTinh, String queQuan, String thuongTru, String tamTru, String quocTich, String danToc, String soHoChieu, String trangThai, LocalDate ngayXacThuc, String idNguoiXacThuc, String ghiChu) {
        this.soCanCuoc = soCanCuoc;
        this.dacDiemNhanDang = dacDiemNhanDang;
        this.hoTen = hoTen;
        this.tenKhac = tenKhac;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.thuongTru = thuongTru;
        this.tamTru = tamTru;
        this.quocTich = quocTich;
        this.danToc = danToc;
        this.soHoChieu = soHoChieu;
        this.trangThai = trangThai;
        this.ngayXacThuc = ngayXacThuc;
        this.idNguoiXacThuc = idNguoiXacThuc;
        this.ghiChu = ghiChu;
    }
    public NhanKhau(String soCanCuoc){
        this.soCanCuoc = soCanCuoc;
    }
    public String getSoHoKhau(){
        return Service.getService().getSoHoKhauBySoCC(soCanCuoc);
    }
    public ArrayList<NhanKhau> getDanhSachIDThanhVien(){
        return Service.getService().getDanhSachThanhVien(getSoHoKhau());
    }

    public int getTuoi(){
        return LocalDate.now().getYear()- ngaySinh.getYear();
    }
}
