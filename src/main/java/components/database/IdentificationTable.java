package components.database;

import java.sql.ResultSet;
import java.sql.SQLException;

//Nguyên 3
public class IdentificationTable extends DatabaseConnection{
    // Bẩng định danh
    private static  IdentificationTable table = new IdentificationTable();
    public static IdentificationTable getTable(){
        return table;
    }
    private boolean hasTable = false;
    public void createTable() {
        if (hasTable) {
            return;
        }
        hasTable = true;
        String query = "create table identification_table(\n" +
                "    id int identity(1, 1),\n" +
                "    account_id int not null unique,\n" +
                "    cic_number varchar(20) not null unique\n" +
                ")";
        try {
            execute(query);
        } catch (SQLException ignored) {
        }
    }
    public String getCICNumberByAccountID(int accountID) {
        createTable();
        String query = String.format("select cic_number from identification_table where account_id = %d", accountID);
        try {
            ResultSet rs = executeQuery(query);
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
