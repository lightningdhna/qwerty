package app.database;

import app.model.demographic.NhanKhau;
import app.model.household.HoKhau;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanKhauHoKhauTable extends DatabaseConnection {
    private static NhanKhauHoKhauTable table = new NhanKhauHoKhauTable();

    public static NhanKhauHoKhauTable getTable() {
        return table;
    }

    private boolean hasTable = false;

    public void taoBang() {
        if (hasTable) {
            return;
        }
        hasTable = true;
        String query = "create table nhan_ho_khau_table(\n" +
                "    so_ho_khau varchar(100)\n" +
                "    so_can_cuoc varchar(100) primary key\n" +
                "    quan_he_chu_ho nvarchar(100)\n" +
                ")";
        try {
            execute(query);
        } catch (SQLException ignored) {
        }
    }

    public boolean add(NhanKhau nhanKhau, HoKhau hoKhau) {
        taoBang();
        String query = String.format(
                """
                        insert into nhan_ho_khau_table(
                        so_ho_khau,
                        so_can_cuoc,
                        quan_he_chu_ho
                        ) values ('%s','%s',N'%s')
                                    """,
                hoKhau.getSoHoKhau(),
                nhanKhau.getSoCanCuoc(),
                nhanKhau.getQuanHeChuHo()
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean update(NhanKhau nhanKhau, HoKhau hoKhau) {
        taoBang();
        String query = String.format(
                """
                        update nhan_ho_khau_table set
                        so_ho_khau = '%s',
                        quan_he_chu_ho = N'%s'
                        where so_can_cuoc = '%s'
                        """,
                hoKhau.getSoHoKhau(),
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

    public boolean delete(NhanKhau nhanKhau, HoKhau hoKhau) {
        taoBang();
        String query = String.format(
                "delete from nhan_ho_khau_table where so_ho_khau = '%s' and so_can_cuoc = '%s'",
                hoKhau.getSoHoKhau(),
                nhanKhau.getSoCanCuoc()
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public List<String> timSoCCBangSoHk(String soHoKhau) {
        taoBang();
        List<String> result = new ArrayList<>();
        String query = String.format(
                "select so_can_cuoc from nhan_ho_khau_table where so_ho_khau = '%s'",
                soHoKhau
        );
        try {
            ResultSet rs = executeQuery(query);
            while (rs.next()) {
                result.add(rs.getString("so_can_cuoc"));
            }
        } catch (SQLException e) {
            return result;
        }
        return result;
    }

    public String timSoHkBangSoCC(String soCanCuoc) {
        taoBang();
        String query = String.format(
                "select so_ho_khau from nhan_ho_khau_table where so_can_cuoc = '%s'",
                soCanCuoc
        );
        try {
            ResultSet resultSet = executeQuery(query);
            if (resultSet.next()) {
                return resultSet.getString("so_ho_khau");
            }
        } catch (SQLException ignored) {
        }
        return "";
    }

}
