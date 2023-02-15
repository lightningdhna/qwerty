package app.database;

import app.model.household.HoKhau;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//todo làm thêm lớp kiểm tra chính tả các thông tin được nhập gồm các ttính(chỉ có tiếng Việt,email,có cả tiếng Việt và số,...)
public class HoKhauTable extends DatabaseConnection {


    private boolean hasTable = false;
    private static HoKhauTable table;

    public static HoKhauTable getTable() {
        return table;
    }

    public List<HoKhau> castResultSet(ResultSet rs) throws SQLException {
        List<HoKhau> hoKhauList = new ArrayList<>();
        while (rs.next()) {
            HoKhau hoKhau = new HoKhau();
            hoKhau.setSoHoKhau(rs.getString("so_ho_khau"));
            hoKhau.setIdChuHo(rs.getString("id_chu_ho"));
            hoKhau.setDiaChi(rs.getString("dia_chi"));
            hoKhau.setThoiGianXacThuc(rs.getDate("thoi_gian_xac_thuc").toLocalDate());
            hoKhau.setIdNguoiXacThuc(rs.getString("id_nguoi_xac_thuc"));
            hoKhau.setTrangThai(rs.getString("trang_thai"));
            hoKhau.setGhiChu(rs.getString("ghi_chu"));
            hoKhau.setTenChuHo(rs.getString("ten_chu_ho"));
            hoKhauList.add(hoKhau);
        }
        return hoKhauList;
    }

    public void taoBang() {
        if (hasTable) {
            return;
        }
        hasTable = true;
        String query = """
                create table ho_khau_table(
                so_ho_khau varchar(100) primary key,
                id_chu_ho varchar(100),
                dia_chi nvarchar(200),
                thoi_gian_xac_thuc date,
                id_nguoi_xac_thuc varchar(100),
                trang_thai nvarchar(100),
                ghi_chu nvarchar(200),
                ten_chu_ho nvarchar(100)
                )
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {
        }
    }

    public boolean add(HoKhau hoKhau) {
        taoBang();
        String query = String.format(
                """
                        insert into ho_khau_table(
                        so_ho_khau,
                        id_chu_ho,
                        dia_chi,
                        thoi_gian_xac_thuc,
                        id_nguoi_xac_thuc,
                        trang_thai,
                        ghi_chu,
                        ten_chu_ho
                        ) values (
                        '%s', '%s', N'%s', '%s', '%s', N'%s', N'%s', N'%s'
                        )
                        """,
                hoKhau.getSoHoKhau(),
                hoKhau.getIdChuHo(),
                hoKhau.getDiaChi(),
                hoKhau.getThoiGianXacThuc().toString(),
                hoKhau.getIdNguoiXacThuc(),
                hoKhau.getTrangThai(),
                hoKhau.getGhiChu(),
                hoKhau.getTenChuHo()
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean update(HoKhau hoKhau) {
        taoBang();
        String query = String.format(
                """
                        update ho_khau_table set
                        so_ho_khau='%s',
                        id_chu_ho='%s',
                        dia_chi=N'%s',
                        thoi_gian_xac_thuc='%s',
                        id_nguoi_xac_thuc='%s',
                        trang_thai=N'%s',
                        ghi_chu=N'%s',
                        ten_chu_ho=N'%s'
                        where so_ho_khau='%s'
                        """,
                hoKhau.getSoHoKhau(),
                hoKhau.getIdChuHo(),
                hoKhau.getDiaChi(),
                hoKhau.getThoiGianXacThuc().toString(),
                hoKhau.getIdNguoiXacThuc(),
                hoKhau.getTrangThai(),
                hoKhau.getGhiChu(),
                hoKhau.getTenChuHo(),
                hoKhau.getSoHoKhau()
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean delete(String soHoKhau) {
        taoBang();
        String query = String.format(
                """
                        delete from ho_khau_table
                        where so_ho_khau='%s'
                        """,
                soHoKhau
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public List<HoKhau> getAllHoKhau() {
        taoBang();
        String query = """
                select *
                from ho_khau_table
                """;
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<HoKhau> timHKBangSoHK(String soHoKhau) {
        taoBang();
        String query = String.format(
                """
                select *
                from ho_khau_table
                where so_ho_khau='%s'
                """,
                soHoKhau
        );
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<HoKhau> timHKBangTenChuHo(String tenChuHo) {
        taoBang();
        String query = "SELECT * FROM so_ho_khau WHERE LOWER(ten_chu_ho) LIKE N'%" + tenChuHo.toLowerCase().trim() + "%'";
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
