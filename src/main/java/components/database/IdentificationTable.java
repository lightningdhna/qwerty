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
                "    account_id int primary key,\n" +
                "    house_hold_number varchar(100)" +
                "    head_relation nvarchar(100)" +
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
        return "";
    }

    public int getAccountIDByCICNumber(String cicNumber) {
        createTable();
        String query = String.format("select account_id from identification_table where cic_number = '%s'", cicNumber);
        try {
            ResultSet rs = executeQuery(query);
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
