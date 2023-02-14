package app.database;

import app.model.event.SuKien;
import app.model.message.YeuCauXacThucNhanKhau;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class XacThucNhanKhauTable extends DatabaseConnection{


    private static final XacThucNhanKhauTable table =  new XacThucNhanKhauTable();
    public static XacThucNhanKhauTable getTable(){
        return table;
    }
    private boolean hasTable = false;
    public ArrayList<YeuCauXacThucNhanKhau> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<YeuCauXacThucNhanKhau> dsYeuCau = new ArrayList<>();
        while(rs.next()){
            YeuCauXacThucNhanKhau yeuCau = new YeuCauXacThucNhanKhau();
            yeuCau.setNoiDung(rs.getNString("noiDung"));
            yeuCau.setMaThongBao(rs.getInt("maThongBao"));
            yeuCau.setTieuDe(rs.getNString("tieuDe"));
            yeuCau.setGhiChu(rs.getNString("ghiChu"));
            yeuCau.setIdTaiKhoanGui(rs.getInt("idTaiKhoanGui"));
            yeuCau.setTrangThai(rs.getNString("trangThai"));
            yeuCau.setNgayTao(rs.getDate("ngayTao").toLocalDate());
            dsYeuCau.add(yeuCau);
        }
        return dsYeuCau;
    }
    public void createTable() {
        if(hasTable)
            return;
        hasTable = true;
        String query= """
                create table XacThucNhanKhauTable(
                    maThongBao int identity(1,1),
                    idTaiKhoanGui int ,
                    tieuDe nvarchar(1000),
                    noiDung nvarchar(1000),
                    ghiChu nvarchar(1000),
                    ngayTao date,
                    trangThai nvarchar(100),
                    constraint  XacTHucNhanKhauPK primary key (maThongBao)
                )""";
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

    public ArrayList<YeuCauXacThucNhanKhau> getAllYeuCau(){
        createTable();
        String query = String.format("""
                select *
                from XacThucNhanKhauTable;
                """);
        ResultSet rs = null;
        try {
            rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(YeuCauXacThucNhanKhau yeuCau){
        createTable();
        String query = String.format("""
                delete from XacThucNhanKhauTable
                where maThongBao = %d;
                """
                ,yeuCau.getMaThongBao());
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(YeuCauXacThucNhanKhau yeuCau){
        createTable();
        String query = String.format("""
                insert into XacThucNhanKhauTable(
                    idTaiKhoanGui, tieuDe, noiDung, ghiChu, ngayTao, trangThai
                )
                values('%d',N'%s',N'%s',N'%s','%s',N'%s');
                """,
                yeuCau.getMaThongBao(),
                yeuCau.getTieuDe(),
                yeuCau.getNoiDung(),
                yeuCau.getGhiChu(),
                yeuCau.getNgayTao(),
                yeuCau.getTrangThai()

        );
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
