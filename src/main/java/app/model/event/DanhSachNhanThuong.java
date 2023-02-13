package app.model.event;

import java.util.ArrayList;

public class DanhSachNhanThuong {

    private int maSuKien =- 1;

    private ArrayList<NguoiNhanThuong> danhSach = new ArrayList<>();

    private double tongGiaTri = -1;

    public DanhSachNhanThuong(int maSuKien, ArrayList<NguoiNhanThuong> danhSach, double tongGiaTri) {
        this.maSuKien = maSuKien;
        this.danhSach = danhSach;
        this.tongGiaTri = tongGiaTri;
    }
    public DanhSachNhanThuong(){

    }

    public int getMaSuKien() {
        return maSuKien;
    }

    public void setMaSuKien(int maSuKien) {
        this.maSuKien = maSuKien;
    }

    public ArrayList<NguoiNhanThuong> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<NguoiNhanThuong> danhSach) {
        this.danhSach = danhSach;
    }

    public double getTongGiaTri() {
        return tongGiaTri;
    }

    public void setTongGiaTri(double tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }
}
