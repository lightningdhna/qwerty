package app.database;

import app.model.account.Account;
import app.model.demographic.DangKiTamVang;
import app.model.demographic.TamVang;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TamVangTable extends DatabaseConnection {
    private static final TamVangTable table = new TamVangTable();
    public static TamVangTable getTable(){
        return table;
    }
    private boolean hasTable = false;


    public  ArrayList<TamVang> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<TamVang> dsTamVang = new ArrayList<>();
        while(rs.next()){
            TamVang tv = new TamVang();
            tv.setGhiChu(rs.getNString("ghiChu"));
            tv.setLiDo(rs.getNString("liDo"));
            tv.setIdNguoiDuyet(rs.getInt("idNguoiDuyet"));
            tv.setNgayDuyet(rs.getDate("ngayDuyet").toLocalDate());
            tv.setSoCCCD(rs.getString("soCCCD"));
            tv.setMaThongTin(rs.getInt("maThongTin"));
            tv.setNgayBatDau(rs.getDate("ngayBatDau").toLocalDate());
            tv.setNgayKetThuc(rs.getDate("ngayKetThuc").toLocalDate());
            tv.setTrangThaiDuyet(rs.getNString("trangThaiDuyet"));
            dsTamVang.add(tv);
        }
        return dsTamVang;
    }
    public void createTable() {
        if(hasTable)
            return;
        hasTable = true;
        String query= """
                create table TamVang(
                    maThongTin int identity (1,1),
                    soCCCD varchar(20),
                    ngayBatDau date,
                    ngayKetThuc date,
                    liDo nvarchar(1000),
                    trangThaiDuyet nvarchar(100),
                    idNguoiDuyet int,
                    ngayDuyet date,
                    ghiChu nvarchar(1000),
                    constraint TamVangPK primary key (maThongTin)
                )
               
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {

        }
    }

    public ArrayList<TamVang> getAllTamVang(){
        createTable();
        String query = String.format("""
                select *
                from TamVang;""");
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(TamVang tamVang){
        createTable();
        String query = String.format("""
                                insert into TamVang(
                                                    soCCCD,
                                                    ngayBatDau,
                                                    ngayKetThuc,
                                                    liDo,
                                                    trangThaiDuyet,
                                                    idNguoiDuyet,
                                                    ngayDuyet,
                                                    ghiChu
                                )
                                values(
                                       '%s',
                                       '%s',
                                       '%s',
                                       N'%s',
                                       N'%s',
                                       %d,
                                       '%s',
                                       N'%s'
                                      );
                        """,
                tamVang.getSoCCCD(),
                tamVang.getNgayBatDau(),
                tamVang.getNgayKetThuc(),
                tamVang.getLiDo(),
                tamVang.getTrangThaiDuyet(),
                tamVang.getIdNguoiDuyet(),
                tamVang.getNgayDuyet(),
                tamVang.getGhiChu()
        );
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(TamVang tamVang){
        createTable();
        String query = String.format("""
                delete from TamVang
                where maThongTin = '%s';
                """,
                tamVang.getMaThongTin());
        try{
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
