package app.model.message;

import java.time.LocalDate;

public class TinNhan {


    private int maThongBao;
    private int idTaiKhoanGui = -1;
    private int idTaiKhoanNhan = -1;

    private String tieuDe = "";

    private String noiDung = "";
    private String ghiChu = "";
    private LocalDate ngayTao ;

    public TinNhan(){
        ngayTao = LocalDate.now();
    }

    public int getIdTaiKhoanGui() {
        return idTaiKhoanGui;
    }

    public void setIdTaiKhoanGui(int idTaiKhoanGui) {
        this.idTaiKhoanGui = idTaiKhoanGui;
    }

    public int getIdTaiKhoanNhan() {
        return idTaiKhoanNhan;
    }

    public void setIdTaiKhoanNhan(int idTaiKhoanNhan) {
        this.idTaiKhoanNhan = idTaiKhoanNhan;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
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

    public TinNhan(int maThongBao, int idTaiKhoanGui, int idTaiKhoanNhan, String tieuDe, String noiDung, String ghiChu, LocalDate ngayTao) {
        this.maThongBao = maThongBao;
        this.idTaiKhoanGui = idTaiKhoanGui;
        this.idTaiKhoanNhan = idTaiKhoanNhan;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.ghiChu = ghiChu;
        this.ngayTao = ngayTao;
    }

}
