package app.database;

import app.model.account.Account;
import app.model.message.YeuCauXacThucHoKhau;
import app.model.message.YeuCauXacThucNhanKhau;
import app.model.message.YeuCauXacThucThanhTich;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class YeuCauXacThucNhanKhauTable extends DatabaseConnection{

    private static YeuCauXacThucNhanKhau table;
    public static YeuCauXacThucNhanKhau getTable(){
        return table;
    }
    private boolean coBang = false;
    public List<YeuCauXacThucNhanKhau> castResultSet(ResultSet rs) throws SQLException {
        List<YeuCauXacThucNhanKhau> result = new ArrayList<>();
        //todo hoan thanh code convert rs -> yeu cau xac thuc nhan khau
        return result;
    }


    public void createTable() {
        if(coBang)
            return;
        coBang = true;
        String query= """
                create table BangYeuCauXacThucNhanKhau(
                    idTaiKhoanGui int,
                    ghiChu nvarchar(10000),
                    ngayTao date,
                    constraint ycxtnk_pk primary key (idTaiKhoanGui)
                )
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {

        }
    }

    public ArrayList<YeuCauXacThucNhanKhau> getAllYeuCau(){
        ArrayList<YeuCauXacThucNhanKhau> result = new ArrayList<>();

        return result;
    }

    public void add(YeuCauXacThucNhanKhau yeuCau){

    }

    public void remove(YeuCauXacThucNhanKhau yeuCau){

    }



}
