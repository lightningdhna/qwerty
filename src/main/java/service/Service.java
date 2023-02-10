package service;

import components.demographic.Household;
import components.household.HoKhau;

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
}
