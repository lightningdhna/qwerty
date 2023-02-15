package app.database;

import app.model.account.Account;
import app.model.demographic.NhanKhau;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaiKhoanNhanKhauTable extends DatabaseConnection {
    private static TaiKhoanNhanKhauTable table = new TaiKhoanNhanKhauTable();

    public static TaiKhoanNhanKhauTable getTable() {
        return table;
    }

    private boolean hasTable = false;

    public void taoBang() {
        if (hasTable) {
            return;
        }
        hasTable = true;
        String query = "create table tai_khoan_nhan_khau_table(\n" +
                "    id_tai_khoan int primary key\n" +
                "    so_can_cuoc varchar(100) \n" +
                ")";
        try {
            execute(query);
        } catch (SQLException ignored) {
        }
    }

    public boolean add(NhanKhau nhanKhau, Account taiKhoan) {
        taoBang();
        String query = String.format(
                """
                        insert into tai_khoan_nhan_khau_table(
                        id_tai_khoan,
                        so_can_cuoc,
                        ) values ('%d','%s')
                                    """,
                taiKhoan.getIdAccount(),
                nhanKhau.getSoCanCuoc()
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public int timIDTaiKhoanBangSoCC(String soCanCuoc) throws SQLException {
        taoBang();
        String query = String.format("select id_tai_khoan from tai_khoan_nhan_khau_table where so_can_cuoc='%s'", soCanCuoc);
        ResultSet resultSet = executeQuery(query);
        if (resultSet.next()) {
            return resultSet.getInt("id_tai_khoan");
        } else {
            throw new SQLException("Không tìm thấy số căn cước");
        }
    }

    public String timSoCCBangIDTaiKhoan(int idTaiKhoan) throws SQLException {
        taoBang();
        String query = String.format("select so_can_cuoc from tai_khoan_nhan_khau_table where id_tai_khoan='%d'", idTaiKhoan);
        ResultSet resultSet = executeQuery(query);
        if (resultSet.next()) {
            return resultSet.getString("so_can_cuoc");
        } else {
            throw new SQLException("Không tìm thấy id tài khoản");
        }
    }


}
