package app.database;

import app.model.account.Account;
import app.model.demographic.DangKiTamVang;
import app.model.demographic.TamTru;
import app.model.demographic.TamVang;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TamTruTable extends DatabaseConnection {
    private static final TamTruTable table = new TamTruTable();
    public static TamTruTable getTable(){
        return table;
    }
    private boolean hasTable = false;


    public  ArrayList<TamTru> castResultSet(ResultSet rs) throws SQLException {
        ArrayList<TamTru> dsTamTru = new ArrayList<>();
        while(rs.next()){
            TamTru tamTru = new TamTru();
            tamTru.setGhiChu(rs.getNString("ghiChu"));
            tamTru.setLiDo(rs.getNString("liDo"));
            tamTru.setIdNguoiDuyet(rs.getInt("idNguoiDuyet"));
            tamTru.setNgayDuyet(rs.getDate("ngayDuyet").toLocalDate());
            tamTru.setSoCCCD(rs.getString("soCCCD"));
            tamTru.setMaThongTin(rs.getInt("maThongTin"));
            tamTru.setNgayBatDau(rs.getDate("ngayBatDau").toLocalDate());
            tamTru.setNgayKetThuc(rs.getDate("ngayKetThuc").toLocalDate());
            tamTru.setTrangThaiDuyet(rs.getNString("trangThaiDuyet"));
            tamTru.setDiaChi(rs.getNString("diaChi"));
            dsTamTru.add(tamTru);
        }
        return dsTamTru;
    }
    public void createTable() {
        if(hasTable)
            return;
        hasTable = true;
        String query= """
                create table TamTruTable(
                    maThongTin int identity (1,1),
                    soCCCD varchar(20),
                    ngayBatDau date,
                    ngayKetThuc date,
                    liDo nvarchar(1000),
                    trangThaiDuyet nvarchar(100),
                    idNguoiDuyet int,
                    ngayDuyet date,
                    ghiChu nvarchar(1000),
                    diaChi nvarchar(1000),
                    constraint TamTruPK primary key (maThongTin)
                )
                
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {

        }
    }

    public ArrayList<TamTru> getAllTamTru(){
        createTable();
        String query = String.format("""
                select *
                from TamTruTable;""");
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(TamTru tamTru){
        createTable();
        String query = String.format("""
                                insert into TamTruTable(
                                                    soCCCD,
                                                    ngayBatDau,
                                                    ngayKetThuc,
                                                    liDo,
                                                    trangThaiDuyet,
                                                    idNguoiDuyet,
                                                    ngayDuyet,
                                                    ghiChu,
                                                    diaChi
                                )
                                values(
                                       '%s',
                                       '%s',
                                       '%s',
                                       N'%s',
                                       N'%s',
                                       %d,
                                       '%s',
                                       N'%s',
                                       N'%s'
                                      );
                        """,
                tamTru.getSoCCCD(),
                tamTru.getNgayBatDau(),
                tamTru.getNgayKetThuc(),
                tamTru.getLiDo(),
                tamTru.getTrangThaiDuyet(),
                tamTru.getIdNguoiDuyet(),
                tamTru.getNgayDuyet(),
                tamTru.getGhiChu(),
                tamTru.getDiaChi()
        );
        try {
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(TamTru tamTru){
        createTable();
        String query = String.format("""
                delete from TamTruTable
                where maThongTin = %d;
                """,
                tamTru.getMaThongTin());
        try{
            execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
