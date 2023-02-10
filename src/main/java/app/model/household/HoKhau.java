package app.model.household;

import app.model.demographic.NhanKhau;
import service.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class HoKhau {
    private String soHoKhau ="test số hộ khẩu";

    public String getIdChuHo() {
        return idChuHo;
    }

    public void setIdChuHo(String idChuHo) {
        this.idChuHo = idChuHo;
    }

    private String idChuHo = "test id chủ hộ";
    private String diaChi = "test địa chỉ";
    private LocalDate thoiGianXacThuc = LocalDate.of(1900,1,1);
    private String idNguoiXacThuc = "test id ngwofi xac thuc";
    private String trangThai = "chưa xác thực";
    private String ghiChu = " ghi chú ...";

    private String tenChuHo = "ten chu ho";



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







    public LocalDate getThoiGianXacThuc() {
        return thoiGianXacThuc;
    }

    public void setThoiGianXacThuc(LocalDate thoiGianXacThuc) {
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

    public String getIdNguoiXacThuc() {
        return idNguoiXacThuc;
    }

    public void setIdNguoiXacThuc(String idNguoiXacThuc) {
        this.idNguoiXacThuc = idNguoiXacThuc;
    }

    public ArrayList<NhanKhau> getDanhSachThanhVien() {
        return Service.getService().getDanhSachThanhVien(soHoKhau);
    }

    public HoKhau(String soHoKhau){
        this.soHoKhau = soHoKhau;
    }

    public void setTenChuHo(String tenChuHo){
        this.tenChuHo= tenChuHo;
    }
    public String getTenChuHo(){
        return this.tenChuHo;
    }

    public String getTenNguoiXacThuc() {
        return "ten nguoi xac thuc";
    }
    public String getMoTaThanhVien(){
        String result = "";
        for(NhanKhau nk : getDanhSachThanhVien()){
            result = result + nk.getHoTen()+" , "+nk.getTuoi()+" , "+nk.getQuanHeChuHo();
            result += "\n";
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoKhau hoKhau = (HoKhau) o;
        return soHoKhau.equals(hoKhau.soHoKhau) && idChuHo.equals(hoKhau.idChuHo) && diaChi.equals(hoKhau.diaChi)  && thoiGianXacThuc.equals(hoKhau.thoiGianXacThuc) && idNguoiXacThuc.equals(hoKhau.idNguoiXacThuc) && trangThai.equals(hoKhau.trangThai) && ghiChu.equals(hoKhau.ghiChu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soHoKhau, idChuHo, diaChi, thoiGianXacThuc, idNguoiXacThuc, trangThai, ghiChu);
    }

    public HoKhau() {
    }

    public HoKhau(String soHoKhau, String idChuHo, String diaChi, LocalDate thoiGianXacThuc, String idNguoiXacThuc, String trangThai, String ghiChu, String tenChuHo) {
        this.soHoKhau = soHoKhau;
        this.idChuHo = idChuHo;
        this.diaChi = diaChi;
        this.thoiGianXacThuc = thoiGianXacThuc;
        this.idNguoiXacThuc = idNguoiXacThuc;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.tenChuHo = tenChuHo;
    }

    public HoKhau clone()  {
        return new HoKhau(soHoKhau, idChuHo,diaChi,thoiGianXacThuc,idNguoiXacThuc,trangThai,ghiChu, tenChuHo);
    }
}
