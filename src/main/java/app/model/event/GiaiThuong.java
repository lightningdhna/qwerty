package app.model.event;

public class GiaiThuong {

    private int maSuKien = -1;

    private String tenGiaiThuong = "";
    private String phanThuong = "";
    private double giaTri = -1;


    public String getTenGiaiThuong() {
        return tenGiaiThuong;
    }

    public void setTenGiaiThuong(String tenGiaiThuong) {
        this.tenGiaiThuong = tenGiaiThuong;
    }

    public String getPhanThuong() {
        return phanThuong;
    }

    public void setPhanThuong(String phanThuong) {
        this.phanThuong = phanThuong;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    public GiaiThuong(){

    }

    public GiaiThuong(int maSuKien, String tenGiaiThuong, String phanThuong, double giaTri) {
        this.maSuKien = maSuKien;
        this.tenGiaiThuong = tenGiaiThuong;
        this.phanThuong = phanThuong;
        this.giaTri = giaTri;
    }

    public int getMaSuKien() {
        return maSuKien;
    }

    public void setMaSuKien(int maSuKien) {
        this.maSuKien = maSuKien;
    }
}
