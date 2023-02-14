package app.database;

import app.model.demographic.DangKiTamTru;
import app.model.demographic.TamTru;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DangKiTamTruTable extends DatabaseConnection {
    private static final DangKiTamTruTable table = new DangKiTamTruTable();
    public static DangKiTamTruTable getTable(){
        return table;
    }
    private boolean hasTable = false;


    public ArrayList<DangKiTamTru> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<DangKiTamTru> dsDKiTamTru = new ArrayList<>();
        while(rs.next()){
            DangKiTamTru dKiTamTru = new DangKiTamTru();
            dKiTamTru.setLiDo(rs.getNString("liDo"));
            dKiTamTru.setSoCCCD(rs.getString("soCCCD"));
            dKiTamTru.setNgayBatDau(rs.getDate("ngayBatDau").toLocalDate());
            dKiTamTru.setNgayKetThuc(rs.getDate("ngayKetThuc").toLocalDate());
            dKiTamTru.setTrangThaiDuyet(rs.getNString("trangThaiDuyet"));
            dKiTamTru.setDiaChi(rs.getNString("diaChi"));
            dsDKiTamTru.add(dKiTamTru);
        }
        return dsDKiTamTru;
    }
    public void createTable() {
        if(hasTable)
            return;
        hasTable = true;
        String query= """
                create table DangKiTamTruTable(
                    soCCCD varchar(20),
                    ngayBatDau date,
                    ngayKetThuc date,
                    liDo nvarchar(1000),
                    trangThaiDuyet nvarchar(100),
                    diaChi nvarchar(1000)
                )
                
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {

        }
    }

    public ArrayList<DangKiTamTru> getAllTamVang(){
        createTable();
        String query = String.format("""
                select *
                from DangKiTamTruTable;""");
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(DangKiTamTru dangKi){
        createTable();
        String query = String.format("""
                                insert into DangKiTamTruTable(
                                                    soCCCD,
                                                    ngayBatDau,
                                                    ngayKetThuc,
                                                    liDo,
                                                    trangThaiDuyet,
                                                    diaChi
                                )
                                values(
                                       '%s',
                                       '%s',
                                       '%s',
                                       N'%s',
                                       N'%s',
                                       N'%s'
                                      );
                        """,
                dangKi.getSoCCCD(),
                dangKi.getNgayBatDau(),
                dangKi.getNgayKetThuc(),
                dangKi.getLiDo(),
                dangKi.getTrangThaiDuyet(),
                dangKi.getDiaChi()
        );
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(DangKiTamTru dangKi){
        createTable();
        String query = String.format("""
                delete from DangKiTamTruTable
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
