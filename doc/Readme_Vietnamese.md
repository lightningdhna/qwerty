# QWERTY

[Readme English](..\Readme.md)

## Mục lục

<!-- TOC -->
* [1. Yêu cầu](#yêu-cầu)
* [2. Cấu hình SQL Server](#cấu-hình-sql-server)
* [3. Chạy chương trình](#chạy-chương-trình)
* [4. Những người đóng góp](#những-người-đóng-góp)
<!-- TOC -->

# Yêu cầu
[SQL Server](https://www.microsoft.com/en-us/sql-server/sql-server-downloads) phiên bản 2022 hoặc mới hơn,
chọn phiên bản phù hợp với hệ điều hành và cấu hình máy tính của bạn.

[SQL Server Management Studio (SSMS)](https://learn.microsoft.com/en-us/sql/ssms/download-sql-server-management-studio-ssms?view=sql-server-ver16) phiên bản 2019 hoặc mới hơn.

### IDE khuyến nghị để chạy chương trình: [Intellij IDEA](https://www.jetbrains.com/idea/download/#section=windows) phiên bản 2022.3.1 hoặc mới hơn.

*Nếu phiên bản hiện tại thấp hơn phiên bản yêu cầu, vui lòng cập nhật lên phiên bản mới nhất.*

# Cấu hình SQL Server 

*Tham khảo từ video [Connect Intellij to SQL Server](https://www.youtube.com/watch?v=RF-_vchtV58)*

## Kích hoạt tài khoản xác thực SQL Server

Đảm bảo rẳng khởi động lại dịch vụ SQL Server sau khi cấu hình.

### Thay đổi Authentication mode:

Thực hiện theo từng bước dưới đây để sử dụng SQL Server Authentication.

1. Đăng nhập vào SQL Server sử dụng SQL Server Management Studio (SSMS). Nếu chưa từng cấu hình trước đó, 
vui lòng kích hoạt `Windows Authentication` in the "Authentication", click chọn `OK`.
2. Chuột phải vào `Tên SQL Server` của bạn, mở `Properties`.
3. Trên trang `Server Properties`, click chọn `Security`. Kích hoạt `SQL Server and Windows Authentication` in the "Authentication".
4. Dưới "Server Proxy Account", click chọn `Enable Proxy Account`, tại "Proxy Account" ghi `sa` và tạo một `mật khẩu` bảo mật, sau đó click `OK`.

### Kích hoạt tài khoản SQL Server Authentication:

1. Kết nối tới giao diện SQL Server bằng cách sử dụng SQL Server Management Studio (SSMS) và chọn `Security` > mở thư mục `Logins`.
2. Click phải chuột vào tài khoản `sa`, mở `Properties`.
3. Ở đầu trang `Status`, bật cài đặt "Login" cho "Account". Click chọn `OK`.
4. `Restart` và `login` tới giao diện SQL Server trong SSMS sử dụng chế độ `SQL Server Authentication` với tài khoản được tạo. Nếu xảy ra lỗi, thử `restart` lại máy.

### Kích hoạt giao thức TCP/IP
1. Mở SQL Server Configuration Management: `Windows` > *tìm kiếm* configuration > chọn `SQL Server Configuration Management`,
   Nếu bạn không tìm thấy, đi tới `Windows` > `Run` > Thêm đường dẫn `C:\Windows\SysWOW64\SQLServerManager16.msc` và nhấn `OK`, có thể tham khảo thêm từ [SQL Server Configuration Management](https://learn.microsoft.com/en-us/sql/relational-databases/sql-server-configuration-manager?view=sql-server-ver16).
2. Chọn `SQL Server Network Configuration` tab, chọn `the protocol of the SQL Server` giao diện hiện tại đang sử dung (thông thường dịch vụ ở trạng thái Running State).
3. Click phải chuột vào `TCP/IP protocol`, mở `Properties`, thay đổi kích hoạt cài đặt thành `Yes`.
4. Đi tới `ID Addresses` tab, trong cài đặt "IPAll" (ở cuối trang), chỉnh kiểu `1433` trong TCP Port. click chọn `OK`.

# Chạy chương trình

### 1. Tạo cơ sở dữ liệu

`Mở` SQL Server Management Studio (SSMS) > `Login` > `New Query` > _tạo mới một database_

Ví dụ:
```
create database Project_SE
go
```
sau đó, `Execute` code.
 
hoặc bạn có thể tạo cơ sở dữ liệu bằng _Công cụ hỗ trợ_.

### 2. Chỉnh sửa đường dẫn tới Database

Đi tới [Path to Database](..\src\main\java\components\database\DatabaseConnection.java). 
Tại phương thức createConnection(), chỉnh sửa các thông tin về serverName, password and databaseName cho phù hợp thông tin cấu hình.

Ví dụ:
```shell
    public static void createConnection(){
        createConnection("LAPTOP-UAFG5AK0\\KIMHUNG","sa","kimhung29042002","Project_SE");
    }
```

Chạy code, nếu bạn bị lỗi các thư viện sau:

```
    requires com.microsoft.sqlserver.jdbc;
    requires com.jfoenix;
    requires AnimateFX;
```

vui lòng đi tới `File` > `Project Structure` > `Modules` > `Dependencies` > `+` > `Jars or Directory..` > *Add path of librarys*
trong `src\main\lib` > `Apply` > `OK`. Sau đó, chạy lại code.

### 3. Tạo tài khoản của bạn

1. Cách thứ nhất: Sử dụng chức năng đăng ký.
2. Cách thứ hai: `Refresh` Database > click phải chuột `dbo.account_table` > mở `Edit Top 200 Rows` > _Thêm một tài khoản để sử dụng_ > _Đăng nhập với tài khoản của bạn_.

# Những người đóng góp

1. [Nguyễn Kim Hùng](https://github.com/NguyenKimHung2002)
2. [Phạm Duy Hưng](https://github.com/lightningdhna)
3. [Lê Thành Nguyên](https://github.com/love123bg)
4. [Trần Anh Quốc](https://github.com/quoctata2911)

# Hỗ trợ user và tester

Bạn có thể xem hướng dẫn sử dụng phần mềm [tại đây](softwareManuals.md).

1. Nếu bạn là một user, bạn sẽ nhận được hỗ trợ khi đi tới [Feedback support](feedback.md) hoặc đi thẳng tới [Comment](https://husteduvn-my.sharepoint.com/:w:/g/personal/hung_nk200260_sis_hust_edu_vn/ESBPLxHU7AlNsod2YY1EUJEBZzVmkfaS67cUxmS7pTMRZQ?e=JVxhjk)
2. Nếu bạn là một tester, bạn sẽ nhận được hỗ trợ khi đi tới [Testcases](testcase.md) và [Test Report](testReport.md)