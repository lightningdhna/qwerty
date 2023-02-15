package app.database;

import app.model.event.NguoiNhanThuong;
import app.model.event.SuKien;
import app.model.message.YeuCauXacThucHoKhau;
import app.model.message.YeuCauXacThucNhanKhau;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NguoiNhanThuongTable extends DatabaseConnection{


//    todo

    private static final NguoiNhanThuongTable table =  new NguoiNhanThuongTable();
    public static NguoiNhanThuongTable getTable(){
        return table;
    }
    private boolean hasTable = false;
    public ArrayList<NguoiNhanThuong> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<NguoiNhanThuong> dsNhanThuong = new ArrayList<>();
        while(rs.next()){
            NguoiNhanThuong nguoiNhan = new NguoiNhanThuong();

            nguoiNhan.setThongTin(rs.getNString("thongTin"));
            nguoiNhan.setGhiChu(rs.getNString("ghiChu"));
            nguoiNhan.setTrangThaiDuyet(rs.getNString("trangThaiDuyet"));
            nguoiNhan.setIdNguoiDuyet(rs.getInt("idNguoiDuyet"));
            nguoiNhan.setNgayDuyet(rs.getDate("ngayDuyet").toLocalDate());
            nguoiNhan.setAnhMinhChung(rs.getString("anhMinhChung"));
            nguoiNhan.setMaSuKien(rs.getInt("maSuKien"));
            nguoiNhan.setTenGiaiThuong(rs.getNString("tenGiaiThuong"));
            nguoiNhan.setSoCCCD(rs.getString("soCCCD"));
            nguoiNhan.setGiaiThuong(nguoiNhan.getMaSuKien(), nguoiNhan.getTenGiaiThuong());
            nguoiNhan.setNguoiNhan(nguoiNhan.getSoCCCD());
            dsNhanThuong.add(nguoiNhan);
        }
        return dsNhanThuong;
    }
    public void createTable() {
        if(hasTable)
            return;
        hasTable = true;
        String query= """
                create table NguoiNhanThuong(
                    thongTin nvarchar(1000),
                    ghiChu nvarchar(1000),
                    trangThaiDuyet nvarchar(100),
                    idNguoiDuyet int,
                    ngayDuyet date,
                    anhMinhChung varchar(100),
                    maSuKien int,
                    tenGiaiThuong nvarchar(1000),
                    soCCCD varchar(20)
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

    public ArrayList<NguoiNhanThuong> getDanhSachNhanThuong(){
        createTable();
        String query = """
                select *
                from NguoiNhanThuong;
                """;
        ResultSet rs = null;
        try {
            rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(NguoiNhanThuong nguoiNhan){
        createTable();
        String query = String.format("""
                delete from NguoiNhanThuong
                where soCCCD = '%s'
                    and maSuKien = %d
                    and tenGiaiThuong = N'%s';
                """
                ,
                nguoiNhan.getSoCCCD(),
                nguoiNhan.getMaSuKien(),
                nguoiNhan.getTenGiaiThuong());
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(NguoiNhanThuong nguoiNhan){
        createTable();
        String query = String.format("""
                        insert into NguoiNhanThuong(thongTin, ghiChu, trangThaiDuyet, idNguoiDuyet, ngayDuyet, anhMinhChung, maSuKien, tenGiaiThuong, soCCCD)\s
                        values ( N'%s',N'%s',N'%s',%d,'%s','%s',%d,N'%s','%s');
                        """,
                nguoiNhan.getThongTin(),nguoiNhan.getGhiChu(),nguoiNhan.getTrangThaiDuyet(),nguoiNhan.getIdNguoiDuyet(),nguoiNhan.getNgayDuyet(),nguoiNhan.getAnhMinhChung(),nguoiNhan.getMaSuKien(),nguoiNhan.getTenGiaiThuong(),nguoiNhan.getSoCCCD()

        );
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
