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
                    rs.getString("name"),
                    rs.getString("other_name"),
                    rs.getDate("date_of_birth").toLocalDate(),
                    rs.getString("gender"),
                    rs.getString("place_of_origin"),
                    rs.getString("place_of_residence"),
                    rs.getString("place_of_temporary_residence"),
                    rs.getString("nationality"),
                    rs.getString("ethnic"),
                    rs.getString("passport_number")==null?"":rs.getString("passport_number"),
                    rs.getString("personal_identification")==null?"":rs.getString("personal_identification"),
                    rs.getDate("date_of_expiry") == null ? LocalDate.MIN:rs.getDate("date_of_expiry").toLocalDate(),
                    rs.getString("verify_state"),
                    rs.getDate("date_verify") == null ? LocalDate.MIN: rs.getDate("date_verify").toLocalDate(),
                    rs.getInt("id_verifier"),
                    rs.getString("note")==null?"": rs.getString("note"),
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
                    name nvarchar(100) not null ,
                    other_name nvarchar(100),
                    date_of_birth date not null,
                    gender nvarchar(10) not null,
                    place_of_origin nvarchar(100) not null,
                    place_of_residence nvarchar(100) not null,
                    place_of_temporary_residence nvarchar(100) not null,
                    nationality nvarchar(50) not null,
                    ethnic nvarchar(50) not null,
                    passport_number varchar(50) ,
                    personal_identification nvarchar(200) ,
                    date_of_expiry date not null,
                    verify_state nvarchar(100) not null,
                    date_verify date not null,
                    id_verifier int not null unique,
                    note nvarchar(200),
                    front_cic_image_url varchar(200) not null,
                    back_cic_image_url varchar(200) not null
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
                    name='%s',
                    other_name='%s',
                    date_of_birth='%s',
                    gender='%s',
                    place_of_origin='%s',
                    place_of_residence='%s',
                    place_of_temporary_residence='%s',
                    nationality='%s',
                    ethnic='%s',
                    passport_number='%s',
                    personal_identification='%s',
                    date_of_expiry='%s',
                    verify_state='%s',
                    date_verify='%s',
                    id_verifier='%s',
                    note='%s',
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