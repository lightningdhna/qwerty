package components.household;

import components.demographic.NhanKhau;
import service.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private String anhMinhChung ;
    private LocalDate thoiGianXacThuc = LocalDate.of(1900,1,1);
    private String idNguoiXacThuc = "test id ngwofi xac thuc";
    private String trangThai = "chưa xác thực";
    private String ghiChu = " ghi chú ...";



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
    public String getTenChuHo(){
        return Service.getService().searchTenChuHoByID(idChuHo);
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
        return soHoKhau.equals(hoKhau.soHoKhau) && idChuHo.equals(hoKhau.idChuHo) && diaChi.equals(hoKhau.diaChi) && anhMinhChung.equals(hoKhau.anhMinhChung) && thoiGianXacThuc.equals(hoKhau.thoiGianXacThuc) && idNguoiXacThuc.equals(hoKhau.idNguoiXacThuc) && trangThai.equals(hoKhau.trangThai) && ghiChu.equals(hoKhau.ghiChu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soHoKhau, idChuHo, diaChi, anhMinhChung, thoiGianXacThuc, idNguoiXacThuc, trangThai, ghiChu);
    }
}
