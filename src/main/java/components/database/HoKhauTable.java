package components.database;

import components.household.HoKhau;

import java.util.ArrayList;

public class HoKhauTable {


    private boolean hasTable;
    private static HoKhauTable table;
    public static HoKhauTable getTable(){
        return table;
    }
    public void taoBang(){

    }
    public ArrayList<HoKhau> getAllHoKHau(){
        return new ArrayList<>();
    }


}
