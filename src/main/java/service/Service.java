package service;

import app.database.YeuCauXacThucTable;
import app.model.demographic.NhanKhau;
import app.model.household.HoKhau;
import app.model.message.YeuCauXacThuc;
import app.model.message.YeuCauXacThucHoKhau;
import app.model.message.YeuCauXacThucNhanKhau;
import app.model.message.YeuCauXacThucThanhTich;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

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
//        ArrayList<YeuCauXacThuc> resultFind = YeuCauXacThucTable.getTable().getAllYeuCauXacThucNhanKhau();
//        for(YeuCauXacThuc yc : resultFind){
//            result.add((YeuCauXacThucNhanKhau) yc);
//        }
//        todo
        result.add(new YeuCauXacThucNhanKhau());
        return result;
    }

    public ArrayList<YeuCauXacThucHoKhau> getAllYeuCauXacThucHoKhau(){
        ArrayList<YeuCauXacThucHoKhau> result = new ArrayList<>();
//        ArrayList<YeuCauXacThuc> resultFind = YeuCauXacThucTable.getTable().getAllYeuCauXacThucHoKhau();
//        for(YeuCauXacThuc yc : resultFind){
//            result.add((YeuCauXacThucHoKhau) yc);
//        }
//        todo
        result.add(new YeuCauXacThucHoKhau());
        return result;
    }

    public ArrayList<YeuCauXacThucThanhTich> getAllYeuCauXacThucThanhTich(){
        ArrayList<YeuCauXacThucThanhTich> result = new ArrayList<>();
//        ArrayList<YeuCauXacThuc> resultFind = YeuCauXacThucTable.getTable().getAllYeuCauXacThucThanhTich();
//        for(YeuCauXacThuc yc : resultFind){
//            result.add((YeuCauXacThucThanhTich) yc);
//        }
        result.add(new YeuCauXacThucThanhTich());
        return result;
    }

    public void themYeuCauXacThuc(YeuCauXacThuc yeuCau){
//        todo
//        YeuCauXacThucTable.getTable().add(yeuCau);
    }
    public void xoaYeuCauXacThuc(YeuCauXacThuc yeuCau){
        //todo
//        YeuCauXacThucTable.getTable().remove(yeuCau);
    }


    public HoKhau timHoKhauBySoHoKhau(String soHoKhau) {
        return new HoKhau();

        //todo
    }

    public String timUsernameByIDTaiKhoan(int idTaiKhoan) {
        // todo tim username thong qua id tai khoan

        return "";
    }

    public String timRoleByIDTaiKhoan(int idTaiKhoan) {
        //todo tim role bang id
        return "admin";
    }
}
