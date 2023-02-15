package app.database;

import app.model.event.GiaiThuong;
import app.model.event.SuKien;
import app.model.message.YeuCauXacThucHoKhau;
import app.model.message.YeuCauXacThucNhanKhau;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GiaiThuongTable extends DatabaseConnection{


    private static final GiaiThuongTable table =  new GiaiThuongTable();
    public static GiaiThuongTable getTable(){
        return table;
    }
    private boolean hasTable = false;
    public ArrayList<GiaiThuong> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<GiaiThuong> dsGiaiThuong = new ArrayList<>();
        while(rs.next()){
            GiaiThuong giaiThuong = new GiaiThuong();
            giaiThuong.setPhanThuong(rs.getNString("giaiThuong"));
            giaiThuong.setMaSuKien(rs.getInt("maSuKien"));
            giaiThuong.setGiaTri(rs.getDouble("giaTri"));
            giaiThuong.setTenGiaiThuong(rs.getNString("tenGiaiThuong"));

            dsGiaiThuong.add(giaiThuong);
        }
        return dsGiaiThuong;
    }
    public void createTable() {
        if(hasTable)
            return;
        hasTable = true;
        String query= """
                create table GiaiThuongTable(
                    maSuKien int ,
                    tenGiaiThuong nvarchar(100),
                    phanThuong nvarchar(1000),
                    giaTri double precision
                )
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {

        }
    }
//    public static ArrayList<SuKien> search(SuKien suKien){
//        createTable();
//        String query=String.format(
//                """
//                select id, username, password,[access authority]
//                from account_table
//                where username = '%s' and password = '%s'
//                """
//                ,suKien.getUsername(),suKien.getPassword()
//        );
//        try {
//            ResultSet rs = executeQuery(query);
//            return castResultSet(rs);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return new ArrayList<>();
//    }

    public ArrayList<GiaiThuong> getAllGiaiThuong(){
        createTable();
        String query = """
                select *
                from GiaiThuongTable;
                """;
        ResultSet rs = null;
        try {
            rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(GiaiThuong giaiThuong){
        createTable();
        String query = String.format("""
                delete from GiaiThuongTable
                where maSuKien = %d
                and tenGiaiThuong = N'%s';
                """
                ,giaiThuong.getMaSuKien(),
                giaiThuong.getTenGiaiThuong());
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(GiaiThuong giaiThuong){
        createTable();
        String query = String.format("""
                insert into GiaiThuongTable(maSuKien, tenGiaiThuong, phanThuong, giaTri)
                values (%d,N'%s',N'%s',%f);
                """,
                giaiThuong.getMaSuKien(),
                giaiThuong.getTenGiaiThuong(),
                giaiThuong.getPhanThuong(),
                giaiThuong.getGiaTri()

        );
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<GiaiThuong> getGiaiThuongByTen(int maSuKien, String tenGiaiThuong){
        createTable();
        String query = String.format("""
                select * from NguoiNhanThuong
                where maSuKien = %d
                and tenGiaiThuong = N'%s';
                
                """,
                maSuKien,tenGiaiThuong);
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
