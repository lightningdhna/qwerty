package app.database;

import app.model.message.YeuCauXacThuc;
import app.model.message.YeuCauXacThucNhanKhau;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class YeuCauXacThucTable extends DatabaseConnection{

    private static YeuCauXacThucTable table;
    public static YeuCauXacThucTable getTable(){
        return table;
    }
    private boolean coBang = false;
    public ArrayList<YeuCauXacThuc> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<YeuCauXacThuc> result = new ArrayList<>();
        while(rs.next()){
            YeuCauXacThuc yeuCau  = new YeuCauXacThucNhanKhau();
            yeuCau.setNgayTao(rs.getDate("ngayTao").toLocalDate());
            yeuCau.setNoiDung(rs.getNString("noiDung"));
            yeuCau.setGhiChu(rs.getNString("ghiChu"));
            yeuCau.setIdTaiKhoanGui(rs.getInt("idTaiKhoanGui"));
            yeuCau.setMaThongBao(rs.getInt("maThongBao"));
            yeuCau.setTieuDe(rs.getString("tieuDe"));
            result.add(yeuCau);
        }
        return result;
    }


    public void createTable() {
        if(coBang)
            return;
        coBang = true;
        String query= """
                create table BangYeuCauXacThucNhanKhau(
                    maThongBao int identity(1,1),
                    tieuDe nvarchar(100);
                    idTaiKhoanGui int,
                    noiDung nvarchar(100),
                    ghiChu nvarchar(10000),
                    ngayTao date,
                    constraint ycxtnk_pk primary key (maThongBao)
                )
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {

        }
    }

    public ArrayList<YeuCauXacThuc> getAllYeuCauXacThucNhanKhau(){
        ArrayList<YeuCauXacThuc> result = new ArrayList<>();

        String querry = """
                select *
                from BangYeuCauXacThucNhanKhau
                where tieuDe  = N'Yêu cầu xác thực nhân khẩu'
                ; """;

        try {
            ResultSet resultSet = executeQuery(querry);
            result = castResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public ArrayList<YeuCauXacThuc> getAllYeuCauXacThucHoKhau(){
        ArrayList<YeuCauXacThuc> result = new ArrayList<>();

        String querry = """
                select *
                from BangYeuCauXacThucNhanKhau
                where tieuDe  = N'Yêu cầu xác thực hộ khẩu'
                ; """;

        try {
            ResultSet resultSet = executeQuery(querry);
            result = castResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public ArrayList<YeuCauXacThuc> getAllYeuCauXacThucThanhTich(){
        ArrayList<YeuCauXacThuc> result = new ArrayList<>();

        String querry = """
                select *
                from BangYeuCauXacThucNhanKhau
                where tieuDe  = N'Yêu cầu xác thực thành tích'
                ; """;

        try {
            ResultSet resultSet = executeQuery(querry);
            result = castResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


    public void add(YeuCauXacThuc yeuCau){
        createTable();
        String query = String.format(
                """
                insert into BangYeuCauXacThucNhanKhau(
                    idTaiKhoanGui,
                    tieuDe,
                    noiDung,
                    ghiChu,
                    ngayTao
                )
                values(
                    '%d', N'%s' ,N'%s',N'%s','%s'
                );
                """,
                yeuCau.getIdTaiKhoanGui(),yeuCau.getTieuDe(),yeuCau.getNoiDung(),yeuCau.getGhiChu(),yeuCau.getNgayTao()
        );
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(YeuCauXacThuc yeuCau){
        createTable();
        String query = String.format("""
                delete from BangYeuCauXacThucNhanKhau
                where maThongBao = '%s'
                ;""", yeuCau.getMaThongBao());
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
