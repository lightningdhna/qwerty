package app.database;

import app.model.event.SuKien;
import app.model.message.YeuCauXacThucHoKhau;
import app.model.message.YeuCauXacThucNhanKhau;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class XacThucHoKhauTable extends DatabaseConnection{


    private static final XacThucHoKhauTable table =  new XacThucHoKhauTable();
    public static XacThucHoKhauTable getTable(){
        return table;
    }
    private boolean hasTable = false;
    public ArrayList<YeuCauXacThucHoKhau> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<YeuCauXacThucHoKhau> dsYeuCau = new ArrayList<>();
        while(rs.next()){
            YeuCauXacThucHoKhau yeuCau = new YeuCauXacThucHoKhau();
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
                create table XacThucHoKhauTable(
                    maThongBao int identity(1,1),
                    idTaiKhoanGui int ,
                    tieuDe nvarchar(1000),
                    noiDung nvarchar(1000),
                    ghiChu nvarchar(1000),
                    ngayTao date,
                    trangThai nvarchar(100),
                    constraint  XacThucHoKhauTablePK primary key (maThongBao)
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

    public ArrayList<YeuCauXacThucHoKhau> getAllYeuCau(){
        createTable();
        String query = """
                select *
                from XacThucHoKhauTable;
                """;
        ResultSet rs = null;
        try {
            rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(YeuCauXacThucHoKhau yeuCau){
        createTable();
        String query = String.format("""
                delete from XacThucHoKhauTable
                where maThongBao = %d;
                """
                ,yeuCau.getMaThongBao());
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(YeuCauXacThucHoKhau yeuCau){
        createTable();
        String query = String.format("""
                insert into XacThucHoKhauTable(
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
