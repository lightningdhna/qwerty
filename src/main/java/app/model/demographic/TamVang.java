package app.model.demographic;

import java.time.LocalDate;
import java.util.Objects;

public class TamVang {
    private int maThongTin = -1;

    private String soCCCD = "";
    private LocalDate ngayBatDau ;
    private LocalDate ngayKetThuc;
    private String liDo;
    private String trangThaiDuyet  = "";
    private int idNguoiDuyet = -1;
    private LocalDate ngayDuyet ;
    private String ghiChu= "";

    public int getMaThongTin() {
        return maThongTin;
    }

    public void setMaThongTin(int maThongTin) {
        this.maThongTin = maThongTin;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
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

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public TamVang(int maThongTin, String soCCCD, LocalDate ngayBatDau, LocalDate ngayKetThuc, String liDo, String trangThaiDuyet, int idNguoiDuyet, LocalDate ngayDuyet, String ghiChu) {
        this.maThongTin = maThongTin;
        this.soCCCD = soCCCD;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.liDo = liDo;
        this.trangThaiDuyet = trangThaiDuyet;
        this.idNguoiDuyet = idNguoiDuyet;
        this.ngayDuyet = ngayDuyet;
        this.ghiChu = ghiChu;
    }
    public TamVang(){

    }

    @Override
    public String toString() {
        return "TamVang{" +
                "maThongTin=" + maThongTin +
                ", soCCCD='" + soCCCD + '\'' +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ", liDo='" + liDo + '\'' +
                ", trangThaiDuyet='" + trangThaiDuyet + '\'' +
                ", idNguoiDuyet=" + idNguoiDuyet +
                ", ngayDuyet=" + ngayDuyet +
                ", ghiChu='" + ghiChu + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TamVang tamVang = (TamVang) o;
        return maThongTin == tamVang.maThongTin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maThongTin);
    }
}
