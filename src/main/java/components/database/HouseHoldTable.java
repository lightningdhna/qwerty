package components.database;

import app.model.manage.HouseHoldModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HouseHoldTable extends DatabaseConnection {
    private static HouseHoldTable table = new HouseHoldTable();

    public static HouseHoldTable getTable() {
        return table;
    }

    private static boolean hasTable = false;

    public List<HouseHoldModel> castResultSet(ResultSet rs) throws SQLException {
        List<HouseHoldModel> houseHoldModelList = new ArrayList<>();
        while (rs.next()) {
            houseHoldModelList.add(new HouseHoldModel(
                    rs.getString("house_hold_number"),
                    rs.getString("house_owner_cic_number"),
                    rs.getNString("house_owner_name"),
                    rs.getNString("address"),
                    rs.getDate("date_verify").toLocalDate(),
                    rs.getNString("note"),
                    rs.getString("verify_image_url"),
                    rs.getInt("verifier_id")
            ));
        }
        return houseHoldModelList;
    }

    public void createTable() {
        if (hasTable) {
            return;
        }
        hasTable = true;
        String query = """
                create table house_hold_table(
                    house_hold_number varchar(100) primary key,
                    house_owner_cic_number varchar(100),
                    house_owner_name nvarchar(100),
                    address nvarchar(200),
                    date_verify date,
                    note nvarchar(200),
                    verify_image_url varchar(200),
                    verifier_id int
                )
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {
        }
    }

    public boolean checkExist(String houseHoldNumber) {
        String query = String.format("SELECT house_hold_number FROM house_hold_table WHERE house_hold_number='%s'", houseHoldNumber);
        try (ResultSet rs = executeQuery(query)) {
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean add(HouseHoldModel houseHoldModel) {
        createTable();
        String query = String.format("INSERT INTO house_hold_table VALUES ('%s', '%s', N'%s', N'%s', '%s', N'%s', '%s', %d)",
                houseHoldModel.getHouseHoldNumber(),
                houseHoldModel.getHouseOwnerCICNumber(),
                houseHoldModel.getHouseOwnerName(),
                houseHoldModel.getAddress(),
                houseHoldModel.getDateVerify(),
                houseHoldModel.getNote(),
                houseHoldModel.getVerifyImageURL(),
                houseHoldModel.getVerifierId());
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean update(HouseHoldModel houseHoldModel) {
        createTable();
        String query = String.format("UPDATE house_hold_table SET " +
                        "house_owner_cic_number='%s', house_owner_name=N'%s',address=N'%s', date_verify='%s', " +
                        "note=N'%s', verify_image_url='%s', verifier_id=%d WHERE " +
                        "house_hold_number='%s'",
                houseHoldModel.getHouseOwnerCICNumber(),
                houseHoldModel.getHouseOwnerName(),
                houseHoldModel.getAddress(),
                houseHoldModel.getDateVerify(),
                houseHoldModel.getNote(),
                houseHoldModel.getVerifyImageURL(),
                houseHoldModel.getVerifierId(),
                houseHoldModel.getHouseHoldNumber());
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean delete(String houseHoldNumber) {
        createTable();
        String query = String.format("DELETE FROM house_hold_table " +
                        "WHERE house_hold_number='%s'",
                houseHoldNumber);
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public List<HouseHoldModel> getAllHouseHoldInfo() {
        createTable();
        String query = """
                select *
                from house_hold_table
                """;
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public HouseHoldModel getHouseHoldInfoByhouseHoldNumber(String houseHoldNumber) {
        createTable();
        String query = String.format("SELECT * FROM house_hold_table " +
                        "WHERE house_hold_number='%s'",
                houseHoldNumber);
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs).get(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new HouseHoldModel();
    }

    public HouseHoldModel getHouseHoldInfoByHouseOwnerCICNumber(String houseOwnerCICNumber) {
        createTable();
        String query = String.format("SELECT * FROM house_hold_table " +
                        "WHERE house_owner_cic_number='%s'",
                houseOwnerCICNumber);
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs).get(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new HouseHoldModel();
    }
}