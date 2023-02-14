package app.database;

import app.model.demographic.DangKiTamTru;
import app.model.demographic.DangKiTamVang;
import app.model.demographic.TamTru;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DangKiTamVangTable extends DatabaseConnection {
    private static final DangKiTamVangTable table = new DangKiTamVangTable();
    public static DangKiTamVangTable getTable(){
        return table;
    }
    private boolean hasTable = false;


    public ArrayList<DangKiTamVang> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<DangKiTamVang> dsDKiTamTru = new ArrayList<>();
        while(rs.next()){
            DangKiTamVang dangKi = new DangKiTamVang();
            dangKi.setLiDo(rs.getNString("liDo"));
            dangKi.setSoCCCD(rs.getString("soCCCD"));
            dangKi.setNgayBatDau(rs.getDate("ngayBatDau").toLocalDate());
            dangKi.setNgayKetThuc(rs.getDate("ngayKetThuc").toLocalDate());
            dangKi.setTrangThaiDuyet(rs.getNString("trangThaiDuyet"));
            dsDKiTamTru.add(dangKi);
        }
        return dsDKiTamTru;
    }
    public void createTable() {
        if(hasTable)
            return;
        hasTable = true;
        String query= """
                create table DangKiTamVangTable(
                    soCCCD varchar(20),
                    ngayBatDau date,
                    ngayKetThuc date,
                    liDo nvarchar(1000),
                    trangThaiDuyet nvarchar(100),
                )
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {

        }
    }

    public ArrayList<DangKiTamVang> getAllTamVang(){
        createTable();
        String query = String.format("""
                select *
                from DangKiTamVangTable;""");
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(DangKiTamVang dangKi){
        createTable();
        String query = String.format("""
                                insert into DangKiTamVangTable(
                                                    soCCCD,
                                                    ngayBatDau,
                                                    ngayKetThuc,
                                                    liDo,
                                                    trangThaiDuyet,
                                )
                                values(
                                       '%s',
                                       '%s',
                                       '%s',
                                       N'%s',
                                       N'%s',
                                      );
                        """,
                dangKi.getSoCCCD(),
                dangKi.getNgayBatDau(),
                dangKi.getNgayKetThuc(),
                dangKi.getLiDo(),
                dangKi.getTrangThaiDuyet()
        );
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(DangKiTamVang dangKi){
        createTable();
        String query = String.format("""
                delete from DangKiTamVangTable
                where soCCCD = '%s';
                """,
                dangKi.getSoCCCD());
        try{
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
