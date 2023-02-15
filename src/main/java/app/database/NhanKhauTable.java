package app.database;

import app.model.demographic.NhanKhau;
import app.model.household.HoKhau;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NhanKhauTable extends DatabaseConnection {
    private boolean hasTable = false;
    private static NhanKhauTable table = new NhanKhauTable();

    public static NhanKhauTable getTable() {
        return table;
    }

    public List<NhanKhau> castResultSet(ResultSet rs) throws SQLException {
        List<NhanKhau> nhanKhauList = new ArrayList<>();
        while (rs.next()) {
            NhanKhau nhanKhau = new NhanKhau();
            nhanKhau.setSoCanCuoc(rs.getString("so_can_cuoc"));
            nhanKhau.setDacDiemNhanDang(rs.getString("dac_diem_nhan_dang"));
            nhanKhau.setHoTen(rs.getString("ho_ten"));
            nhanKhau.setTenKhac(rs.getString("ten_khac"));
            nhanKhau.setNgaySinh(rs.getDate("ngay_sinh").toLocalDate());
            nhanKhau.setGioiTinh(rs.getString("gioi_tinh"));
            nhanKhau.setQueQuan(rs.getString("que_quan"));
            nhanKhau.setThuongTru(rs.getString("thuong_tru"));
            nhanKhau.setTamTru(rs.getString("tam_tru"));
            nhanKhau.setQuocTich(rs.getString("quoc_tich"));
            nhanKhau.setDanToc(rs.getString("dan_toc"));
            nhanKhau.setSoHoChieu(rs.getString("so_ho_chieu"));
            nhanKhau.setTrangThai(rs.getString("trang_thai"));
            nhanKhau.setNgayXacThuc(rs.getDate("ngay_xac_thuc").toLocalDate());
            nhanKhau.setIdNguoiXacThuc(rs.getString("id_nguoi_xac_thuc"));
            nhanKhau.setGhiChu(rs.getString("ghi_chu"));
            nhanKhau.setQuanHeChuHo(rs.getString("quan_he_chu_ho"));
            nhanKhauList.add(nhanKhau);
        }
        return nhanKhauList;
    }

    public void taoBang() {
        if (hasTable) {
            return;
        }
        hasTable = true;
        String query = """
                create table nhan_khau_table(
                so_can_cuoc varchar(100) primary key,
                dac_diem_nhan_dang nvarchar(200),
                ho_ten nvarchar(100),
                ten_khac nvarchar(100),
                ngay_sinh date,
                gioi_tinh nvarchar(100),
                que_quan nvarchar(200),
                thuong_tru nvarchar(200),
                tam_tru nvarchar(200),
                quoc_tich nvarchar(100),
                dan_toc nvarchar(100),
                so_ho_chieu nvarchar(100),
                trang_thai nvarchar(100),
                ngay_xac_thuc date,
                id_nguoi_xac_thuc varchar(100),
                ghi_chu nvarchar(200),
                quan_he_chu_ho nvarchar(100)
                )
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {
        }
    }

    public boolean add(NhanKhau nhanKhau) {
        taoBang();
        String query = String.format(
                """
                        insert into nhan_khau_table(
                        so_can_cuoc,
                        dac_diem_nhan_dang,
                        ho_ten,
                        ten_khac,
                        ngay_sinh,
                        gioi_tinh,
                        que_quan,
                        thuong_tru,
                        tam_tru,
                        quoc_tich,
                        dan_toc,
                        so_ho_chieu,
                        trang_thai,
                        ngay_xac_thuc,
                        id_nguoi_xac_thuc,
                        ghi_chu,
                        quan_he_chu_ho
                        ) values (
                        '%s', N'%s', N'%s', N'%s', '%s', N'%s', N'%s', N'%s', N'%s', N'%s',
                        N'%s', '%s', N'%s', '%s', '%s', N'%s',N'%s'
                        )
                        """,
                nhanKhau.getSoCanCuoc(),
                nhanKhau.getDacDiemNhanDang(),
                nhanKhau.getHoTen(),
                nhanKhau.getTenKhac(),
                nhanKhau.getNgaySinh(),
                nhanKhau.getGioiTinh(),
                nhanKhau.getQueQuan(),
                nhanKhau.getThuongTru(),
                nhanKhau.getTamTru(),
                nhanKhau.getQuocTich(),
                nhanKhau.getDanToc(),
                nhanKhau.getSoHoChieu(),
                nhanKhau.getTrangThai(),
                nhanKhau.getNgayXacThuc(),
                nhanKhau.getIdNguoiXacThuc(),
                nhanKhau.getGhiChu(),
                nhanKhau.getQuanHeChuHo()
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean update(NhanKhau nhanKhau) {
        taoBang();
        String query = String.format(
                """
                        update nhan_khau_table set
                            so_can_cuoc='%s',
                            dac_diem_nhan_dang=N'%s',
                            ho_ten=N'%s',
                            ten_khac=N'%s',
                            ngay_sinh='%s',
                            gioi_tinh=N'%s',
                            que_quan=N'%s',
                            thuong_tru=N'%s',
                            tam_tru=N'%s',
                            quoc_tich=N'%s',
                            dan_toc=N'%s',
                            so_ho_chieu='%s',
                            trang_thai=N'%s',
                            ngay_xac_thuc='%s',
                            id_nguoi_xac_thuc='%s',
                            ghi_chu=N'%s',
                            quan_he_chu_ho=N'%s'
                        where so_can_cuoc='%s'
                        """,
                nhanKhau.getSoCanCuoc(),
                nhanKhau.getDacDiemNhanDang(),
                nhanKhau.getHoTen(),
                nhanKhau.getTenKhac(),
                nhanKhau.getNgaySinh(),
                nhanKhau.getGioiTinh(),
                nhanKhau.getQueQuan(),
                nhanKhau.getThuongTru(),
                nhanKhau.getTamTru(),
                nhanKhau.getQuocTich(),
                nhanKhau.getDanToc(),
                nhanKhau.getSoHoChieu(),
                nhanKhau.getTrangThai(),
                nhanKhau.getNgayXacThuc(),
                nhanKhau.getIdNguoiXacThuc(),
                nhanKhau.getGhiChu(),
                nhanKhau.getQuanHeChuHo(),
                nhanKhau.getSoCanCuoc()
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean delete(String soCanCuoc) {
        taoBang();
        String query = String.format(
                """
                        delete from nhan_khau_table
                        where so_can_cuoc='%s'
                        """,
                soCanCuoc
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public List<NhanKhau> getAllNhanKhau() {
        taoBang();
        String query = """
                select *
                from nhan_khau_table
                """;
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<NhanKhau> timNKBangSoCanCuoc(String soCanCuoc) {
        taoBang();
        String query = String.format(
                """
                        select *
                        from nhan_khau_table
                        where so_can_cuoc='%s'
                        """,
                soCanCuoc
        );
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<NhanKhau> timNKBangHoTen(String hoTen) {
        taoBang();
        String query = "SELECT * FROM nhan_khau_table WHERE LOWER(ho_ten) LIKE N'%" + hoTen.toLowerCase().trim() + "%'";
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }



}
