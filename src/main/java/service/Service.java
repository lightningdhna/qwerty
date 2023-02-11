package service;

import app.model.demographic.NhanKhau;
import app.model.household.HoKhau;
import app.model.message.YeuCauXacThuc;
import app.model.message.YeuCauXacThucHoKhau;
import app.model.message.YeuCauXacThucNhanKhau;
import app.model.message.YeuCauXacThucThanhTich;

import java.lang.reflect.Array;
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


    public ArrayList<YeuCauXacThucNhanKhau> getAllYeuCauXacThucNhanKhau(){
        ArrayList<YeuCauXacThucNhanKhau> result = new ArrayList<>();
        //todo xử lí từ csdl

        return result;
    }

    public ArrayList<YeuCauXacThucHoKhau> getAllYeuCauXacThucHoKhau(){
        ArrayList<YeuCauXacThucHoKhau> result = new ArrayList<>();

        //todo xu li csdl
        return result;
    }

    public ArrayList<YeuCauXacThucThanhTich> getAllYeuCauXacThucThanhTich(){
        ArrayList<YeuCauXacThucThanhTich> result = new ArrayList<>();


        return result;
    }

    public void themYeuCauXacThucNhanKhau(YeuCauXacThucNhanKhau yeuCau){
        //todo
    }
    public void themYeuCauXacThucHoKhau(YeuCauXacThucHoKhau yeuCau){
        //todo

    }
    public void themYeuCauXacThucThanhTich(YeuCauXacThucThanhTich yeuCau){
        //todo

    }
    public void xoaYeuCauXacThucNhanKhau(YeuCauXacThucNhanKhau yeuCau){
        //todo
    }
    public void xoaYeuCauXacThucHoKhau(YeuCauXacThucHoKhau yeuCau){
        //todo

    }
    public void xoaYeuCauXacThucThanhTich(YeuCauXacThucThanhTich yeuCau){
        //todo

    }




}
