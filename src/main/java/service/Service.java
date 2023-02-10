package service;

import app.model.demographic.NhanKhau;
import app.model.household.HoKhau;

import java.util.ArrayList;

public class Service {


    private static Service manager = new Service();
    public static Service getService(){
        return manager;
    }
    public ArrayList<HoKhau> getAllHoKhau(){
        ArrayList<HoKhau> result = new ArrayList<HoKhau>();

        result.add(new HoKhau("ajsdlf"));

        return result ;
    }

    public boolean canAddHoKhau(HoKhau hoKhau){
        return true;
    }
    public void themHoKhau(HoKhau hoKhau){
        //call csdl
    }
    public void xoaHoKhau(HoKhau hoKhau){
        //call csdl
    }

    public String searchTenChuHoByID(String idChuHo) {

        return "chua co ten";
    }

    public ArrayList<NhanKhau> getDanhSachThanhVien(String soHoKhau) {
        ArrayList<NhanKhau> result = new ArrayList<>();
        return result;

    }

    public String getSoHoKhauBySoCC(String soCanCuoc) {

        return "";
    }

    public String canXoa(HoKhau hoKhau){
        return "";
    }

    public String canCapNhat(HoKhau hoKhau) {
        return "";
    }
}
