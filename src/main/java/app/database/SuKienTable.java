package app.database;

import app.model.account.Account;
import app.model.event.SuKien;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuKienTable extends DatabaseConnection{

//    todo

    private static final SuKienTable table =  new SuKienTable();
    public static SuKienTable getTable(){
        return table;
    }
    private boolean hasTable = false;
    public ArrayList<SuKien> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<SuKien> dsSuKien = new ArrayList<>();
        while(rs.next()){
            SuKien sk = new SuKien();
            sk.setMaSuKien(rs.getInt("maSuKien"));
            sk.setDiaDiem(rs.getNString("diaDiem"));
            sk.setGhiChu(rs.getNString("ghiChu"));
            sk.setIdNguoiTao(rs.getInt("idNguoiTao"));
            sk.setLoaiSuKien(rs.getInt("loaiSuKien"));
            sk.setTenSuKien(rs.getNString("tenSuKien"));
            sk.setQuyChe(rs.getNString("quyChe"));
            sk.setNgayBatDau(rs.getDate("ngayBatDau").toLocalDate());
            sk.setNgayKetThuc(rs.getDate("ngayKetThuc").toLocalDate());
            sk.setNgayTao(rs.getDate("ngayTao").toLocalDate());
            sk.setTrangThai(rs.getNString("trangThai"));

            dsSuKien.add(sk);
        }
        return dsSuKien;
    }
    public void createTable() {
        if(hasTable)
            return;
        hasTable = true;
        String query= """
                create table SuKienTable(
                     maSuKien int identity (1,1),
                     tenSuKien nvarchar(100),
                     diaDiem nvarchar(100),
                     quyChe nvarchar(1000),
                     ghiChu nvarchar(1000),
                     loaiSuKien int,
                     ngayBatDau date,
                     ngayKetThuc date,
                     ngayTao date,
                     idNguoiTao int,
                     trangThai nvarchar(100),
                     constraint SuKienTablePK primary key (maSuKien)
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

    public ArrayList<SuKien> getAllSuKien(){
        createTable();
        String query = String.format("""
                select *
                from SuKienTable;
                """);
        ResultSet rs = null;
        try {
            rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(SuKien suKien){
        createTable();
        String query = String.format("""
                delete from SuKienTable
                where maSuKien = %d;"""
        ,suKien.getMaSuKien());
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(SuKien suKien){
        createTable();
        String query = String.format("""
                insert into SuKienTable(
                    tenSuKien ,
                    diaDiem ,
                    quyChe ,
                    ghiChu ,
                    loaiSuKien ,
                    ngayBatDau,
                    ngayKetThuc ,
                    ngayTao ,
                    idNguoiTao ,
                    trangThai\s
                )
                values(
                      N'%s',
                      N'%s',
                      N'%s',
                      N'%s',
                       %d,
                       '%s',
                       '%s',
                       '%s',
                       %d,
                       N'%s'
                      )
                """
                ,suKien.getTenSuKien(),
                suKien.getDiaDiem(),
                suKien.getQuyChe(),
                suKien.getGhiChu(),
                suKien.getLoaiSuKien(),
                suKien.getNgayBatDau(),
                suKien.getNgayKetThuc(),
                suKien.getNgayTao(),
                suKien.getIdNguoiTao(),
                suKien.getTrangThai()
                );
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
