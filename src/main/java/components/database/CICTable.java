package components.database;

import components.database.DatabaseConnection;
import components.demogrpahic.CIC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Nguyen 1
public class CICTable extends DatabaseConnection {

    private static CICTable table  = new CICTable();
    public static CICTable getTable(){
        return table;
    }
    private static boolean hasTable = false;

    public List<CIC> castResultSet(ResultSet rs) throws SQLException {
        List<CIC> cicList = new ArrayList<>();
        while (rs.next()) {
            cicList.add(new CIC(
                    rs.getString("cic_number"),
                    rs.getNString("name"),
                    rs.getNString("other_name"),
                    rs.getDate("date_of_birth").toLocalDate(),
                    rs.getNString("gender"),
                    rs.getNString("place_of_origin"),
                    rs.getNString("place_of_residence"),
                    rs.getNString("place_of_temporary_residence"),
                    rs.getNString("nationality"),
                    rs.getNString("ethnic"),
                    rs.getString("passport_number")==null?"":rs.getString("passport_number"),
                    rs.getNString("personal_identification")==null?"":rs.getNString("personal_identification"),
                    rs.getDate("date_of_expiry") == null ? LocalDate.MIN:rs.getDate("date_of_expiry").toLocalDate(),
                    rs.getNString("verify_state"),
                    rs.getDate("date_verify") == null ? LocalDate.MIN: rs.getDate("date_verify").toLocalDate(),
                    rs.getInt("id_verifier"),
                    rs.getNString("note")==null?"": rs.getString("note"),
                    rs.getString("front_cic_image_url"),
                    rs.getString("back_cic_image_url")
            ));
        }
        return cicList;
    }

    //Tạo bảng
    public void createTable() {
        if (hasTable) {
            return;
        }
        hasTable = true;
        String query = """
                create table cic_table(
                    cic_number varchar(100) primary key,
                    name nvarchar(100)  ,
                    other_name nvarchar(100),
                    date_of_birth date ,
                    gender nvarchar(10) ,
                    place_of_origin nvarchar(100) ,
                    place_of_residence nvarchar(100) ,
                    place_of_temporary_residence nvarchar(100),
                    nationality nvarchar(50) ,
                    ethnic nvarchar(50) ,
                    passport_number varchar(50) ,
                    personal_identification nvarchar(200) ,
                    date_of_expiry date,
                    verify_state nvarchar(100) ,
                    date_verify date,
                    id_verifier int ,
                    note nvarchar(200),
                    front_cic_image_url varchar(200)  ,
                    back_cic_image_url varchar(200)  
                )
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {
        }
    }
    public boolean checkExist(String cicNumber){
        String query = String.format("SELECT cic_number FROM cic_table WHERE cic_number='%s'", cicNumber);
        try {
            ResultSet rs = executeQuery(query);
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }
    //Thêm cic
    public boolean add(CIC cic) {
        createTable();
        if (checkExist(cic.getCICNumber())){
            return false;
        }
        String query = String.format(
                """
                insert into cic_table(
                    cic_number,
                    name,
                    other_name,
                    date_of_birth,
                    gender,
                    place_of_origin,
                    place_of_residence,
                    place_of_temporary_residence,
                    nationality,
                    ethnic,
                    passport_number,
                    personal_identification,
                    date_of_expiry,
                    verify_state,
                    date_verify,
                    id_verifier,
                    note,
                    front_cic_image_url,
                    back_cic_image_url
                ) values (
                    '%s', N'%s', N'%s', '%s', N'%s', N'%s',N'%s', N'%s', N'%s', N'%s',
                    '%s', N'%s', '%s', N'%s', '%s', '%d', N'%s', '%s', '%s'
            )
            """,
                cic.getCICNumber(),
                cic.getName(),
                cic.getOtherName(),
                cic.getDateOfBirth(),
                cic.getGender(),
                cic.getPlaceOfOrigin(),
                cic.getPlaceOfResidence(),
                cic.getPlaceOfTemporaryResidence(),
                cic.getNationality(),
                cic.getEthnic(),
                cic.getPassportNumber(),
                cic.getPersonalIdentification(),
                cic.getDateOfExpiry(),
                cic.getVerifyState(),
                cic.getDateVerify(),
                cic.getIdVerifier(),
                cic.getNote(),
                cic.getFrontCICImageURL(),
                cic.getBackCICImageURL()
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

//Update CIC
    public boolean update(CIC cic) {
        createTable();
        String query = String.format(
                """
                update cic_table set
                    name=N'%s',
                    other_name=N'%s',
                    date_of_birth='%s',
                    gender=N'%s',
                    place_of_origin=N'%s',
                    place_of_residence=N'%s',
                    place_of_temporary_residence=N'%s',
                    nationality=N'%s',
                    ethnic=N'%s',
                    passport_number='%s',
                    personal_identification=N'%s',
                    date_of_expiry='%s',
                    verify_state=N'%s',
                    date_verify='%s',
                    id_verifier='%s',
                    note=N'%s',
                    front_cic_image_url='%s',
                    back_cic_image_url='%s'
                where cic_number='%s'
                """,
                cic.getName(),
                cic.getOtherName(),
                cic.getDateOfBirth(),
                cic.getGender(),
                cic.getPlaceOfOrigin(),
                cic.getPlaceOfResidence(),
                cic.getPlaceOfTemporaryResidence(),
                cic.getNationality(),
                cic.getEthnic(),
                cic.getPassportNumber(),
                cic.getPersonalIdentification(),
                cic.getDateOfExpiry(),
                cic.getVerifyState(),
                cic.getDateVerify(),
                cic.getIdVerifier(),
                cic.getNote(),
                cic.getFrontCICImageURL(),
                cic.getBackCICImageURL(),
                cic.getCICNumber()
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

//Xóa CIC
    public boolean delete(String cicNumber) {
        createTable();
        String query = String.format(
                """
                delete from cic_table
                where cic_number='%s'
                """,
                cicNumber
        );
        try {
            execute(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    //Lấy hết CIC
    public List<CIC> getAllCIC() {
        createTable();
        String query = """
            select *
            from cic_table
            """;
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    //Tìm CIC theo cicNumber
    public List<CIC> getCICByCICNumber(String cicNumber) {
        createTable();
        if (!checkExist(cicNumber)){
            return new ArrayList<>();
        }
        String query = String.format(
                """
                select *
                from cic_table
                where cic_number='%s'
                """,
                cicNumber
        );
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<CIC> searchCICByName(String searchString) {
        String query = "SELECT * FROM cic_table WHERE LOWER(name) LIKE N'%" + searchString.toLowerCase().trim() + "%'";
        try {
            ResultSet rs = executeQuery(query);
            return castResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


}