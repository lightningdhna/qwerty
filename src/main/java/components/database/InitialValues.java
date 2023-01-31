package components.database;

import java.sql.SQLException;

public class InitialValues extends DatabaseConnection {
    public static void addCICInitialValue() throws SQLException {
        String query = """
                INSERT INTO cic_table 
                (cic_number, name, other_name, date_of_birth, gender, place_of_origin, place_of_residence,
                place_of_temporary_residence, nationality, ethnic, passport_number, personal_identification,
                date_of_expiry, verify_state, date_verify, id_verifier, note, front_cic_image_url, back_cic_image_url)
                VALUES
                ('CIC001', N'Nguyễn Văn A', N'', '1980-01-01', N'Nam', N'Thành phố Hồ Chí Minh', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN001', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-01', 1, N'', 'front_cic001.jpg', 'back_cic001.jpg'),
                ('CIC002', N'Trần Thị B', N'', '1982-02-01', N'Nữ', N'Tỉnh Bình Dương', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN002', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-02', 2, N'', 'front_cic002.jpg', 'back_cic002.jpg'),
                ('CIC003', N'Lê C', N'', '1984-03-01', N'Nam', N'Tỉnh Đồng Nai', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN003', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-03', 3, N'', 'front_cic003.jpg', 'back_cic003.jpg'),
                ('CIC004', N'Phạm Thị D', N'', '1986-04-01', N'Nữ', N'Tỉnh Bình Phước', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN004', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-04', 4, N'', 'front_cic004.jpg', 'back_cic004.jpg'),
                ('CIC005', N'Hoàng Văn E', N'', '1988-05-01', N'Nam', N'Tỉnh Long An', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN005', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-05', 5, N'', 'front_cic005.jpg', 'back_cic005.jpg'),
                ('CIC006', N'Nguyễn Minh F', N'', '1990-06-01', N'Nam', N'Tỉnh Bà Rịa - Vũng Tàu', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN006', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-06', 6, N'', 'front_cic006.jpg', 'back_cic006.jpg'),
                ('CIC007', N'Đặng Thị G', N'', '1992-07-01', N'Nữ', N'Tỉnh Tây Ninh', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN007', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-07', 7, N'', 'front_cic007.jpg', 'back_cic007.jpg'),
                ('CIC008', N'Vũ Thị H', N'', '1994-08-01', N'Nữ', N'Tỉnh Bình Dương', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN008', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-08', 8, N'', 'front_cic008.jpg', 'back_cic008.jpg'),
                ('CIC009', N'Phan Văn I', N'', '1996-09-01', N'Nam', N'Tỉnh Đồng Nai', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN009', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-09', 9, N'', 'front_cic009.jpg', 'back_cic009.jpg'),
                ('CIC010', N'Lê Thị J', N'', '1998-10-01', N'Nữ', N'Tỉnh Bình Phước', N'Thành phố Hồ Chí Minh', N'', N'Việt Nam', N'Kinh', 'VN010', N'',
                '2023-12-31', N'Đã xác minh', '2022-01-10', 10, N'', 'front_cic010.jpg', 'back_cic010.jpg')
                """;
        try {
            execute(query);
        } catch (SQLException ignored) {
        }
    }
}


