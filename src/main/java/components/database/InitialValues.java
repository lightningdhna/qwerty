package components.database;

import java.sql.SQLException;

public class InitialValues extends DatabaseConnection {
    public static void addCICInitialValue() throws SQLException{
        String query = """
                INSERT INTO cic_table 
                (cic_number, name, other_name, date_of_birth, gender, place_of_origin, place_of_residence,
                place_of_temporary_residence, nationality, ethnic, passport_number, personal_identification,
                date_of_expiry, verify_state, date_verify, id_verifier, note, front_cic_image_url, back_cic_image_url)
                VALUES
                ("CIC001", "Nguyễn Văn A", "", "1980-01-01", "Nam", "Thành phố Hồ Chí Minh", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN001", "",
                "2023-12-31", "Đã xác minh", "2022-01-01", 1, "", "front_cic001.jpg", "back_cic001.jpg"),
                ("CIC002", "Trần Thị B", "", "1982-02-01", "Nữ", "Tỉnh Bình Dương", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN002", "",
                "2023-12-31", "Đã xác minh", "2022-01-02", 2, "", "front_cic002.jpg", "back_cic002.jpg"),
                ("CIC003", "Lê C", "", "1984-03-01", "Nam", "Tỉnh Đồng Nai", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN003", "",
                "2023-12-31", "Đã xác minh", "2022-01-03", 3, "", "front_cic003.jpg", "back_cic003.jpg"),
                ("CIC004", "Phạm Thị D", "", "1986-04-01", "Nữ", "Tỉnh Bình Phước", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN004", "",
                "2023-12-31", "Đã xác minh", "2022-01-04", 4, "", "front_cic004.jpg", "back_cic004.jpg"),
                ("CIC005", "Hoàng Văn E", "", "1988-05-01", "Nam", "Tỉnh Long An", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN005", "",
                "2023-12-31", "Đã xác minh", "2022-01-05", 5, "", "front_cic005.jpg", "back_cic005.jpg")
                ("CIC006", "Nguyễn Minh F", "", "1990-06-01", "Nam", "Tỉnh Bà Rịa - Vũng Tàu", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN006", "",
                "2023-12-31", "Đã xác minh", "2022-01-06", 6, "", "front_cic006.jpg", "back_cic006.jpg"),
                ("CIC007", "Đặng Thị G", "", "1992-07-01", "Nữ", "Tỉnh Tây Ninh", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN007", "",
                "2023-12-31", "Đã xác minh", "2022-01-07", 7, "", "front_cic007.jpg", "back_cic007.jpg"),
                ("CIC008", "Vũ Thị H", "", "1994-08-01", "Nữ", "Tỉnh Bình Dương", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN008", "",
                "2023-12-31", "Đã xác minh", "2022-01-08", 8, "", "front_cic008.jpg", "back_cic008.jpg"),
                ("CIC009", "Phan Văn I", "", "1996-09-01", "Nam", "Tỉnh Đồng Nai", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN009", "",
                "2023-12-31", "Đã xác minh", "2022-01-09", 9, "", "front_cic009.jpg", "back_cic009.jpg"),
                ("CIC010", "Lê Thị J", "", "1998-10-01", "Nữ", "Tỉnh Bình Phước", "Thành phố Hồ Chí Minh", "", "Việt Nam", "Kinh", "VN010", "",
                "2023-12-31", "Đã xác minh", "2022-01-10", 10, "", "front_cic010.jpg", "back_cic010.jpg")
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {
        }
    }
}


