# Hỗ trợ Test Report cho Tester

## 1. Test report là gì

Test report là mẫu báo cáo kiểm thử dành cho tester ở khoảng thười gian giữa dự án, thể hiện tiến độ công việc.
Test Report được xác định như một tài liệu chứa các thông tin về các hành động đã được thực thi (Chạy test cases,
phát hiện lỗi, thời gian bỏ ra...) và các kết quả của quá trình thực thi này (test case không thành công/thành công,
số lượng bugs và crashes...)

Thực tế có ít nhất 3 lý do cho việc chuẩn bị Test Reports:

1. Bản Test Report tốt sẽ cho phép "nhóm phát triển" có thể đánh giá trạng thái hiện tại của dự án cũng như chất lượng của sản phẩm.

2. Có khả năng đưa ra những quyết định sáng suốt nếu cần thiết.

3. Test Report có thể là tài liệu cuối cùng xác định việc sản phẩm đã sẵn sàng phát hành hay chưa.

## 2. Hỗ trợ Test Report cho các tester nhóm SE_04

### 2.1. Giao diện Login.

| Module Name      | Login           |  
|------------------|-----------------|
| Create date      | 30-1-2023       |
| Tester           | Nguyễn Kim Hùng |
| Test Environment |                 | 

| Total Executed Testcases | Passed | Failed | Inprogressing | Pending | Blocked | Total |
|--------------------------|--------|--------|---------------|---------|---------|-------|
| 23                       | 23     | 0      | 0             | 1       | 0       | 24    |


| Test Case ID | Test Items                                                                                          | Pre-condition                           | Test Data | Test Steps                                                                              | Expected results                                       | A result(Pass/Fail) | Comments |
|--------------|-----------------------------------------------------------------------------------------------------|-----------------------------------------|-----------|-----------------------------------------------------------------------------------------|--------------------------------------------------------|----------------|----------|
| Login_0001   | Kiểm tra icon, font size, font style, font color.                                                   | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |
| Login_0002   | Kiểm tra highlighted khi house mouse button "Sign in".                                              | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |
| Login_0003   | Kiểm tra đổi màu khi mouse click.                                                                   | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |
| Login_0004   | Kiểm tra prompt text username, password có mờ hoặc được xóa đi khi click.                           | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |
| Login_0005   | Kiểm tra prompt text username, password bị xóa khi nhập giá trị.                                    | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |
| Login_0006   | Kiểm tra paste keyboard, paste right click có hoạt động với username, password không.               | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |
| Login_0007   | Kiểm tra copy keyboard, copy right click có hoạt động với username, password không.                 | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |
| Login_0008   | Kiểm tra đăng nhập thành công với username hợp lệ.                                                  | Truy nhập vào hệ thống, Password hợp lệ |           |                                                                                         |                                                        |                |          |
| Login_0009   | Kiểm tra đăng nhập thành công với username = 1 kí tự thường / ký tự unicode / ký tự bao gồm space.  | Truy nhập vào hệ thống, Password hợp lệ |           |                                                                                         |                                                        |                |          |
| Login_0010   | Kiểm tra đăng nhập thành công với username = 10 kí tự thường / ký tự unicode / ký tự bao gồm space. | Truy nhập vào hệ thống, Password hợp lệ |           |                                                                                         |                                                        |                |          |
| Login_0011   | Kiểm tra đăng nhập thành công với username = 20 kí tự thường / ký tự unicode / ký tự bao gồm space. | Truy nhập vào hệ thống, Password hợp lệ |           |                                                                                         |                                                        |                |          |
| Login_0012   | Kiểm tra đăng nhập không thành công với username không hợp lệ.                                      | Truy nhập vào hệ thống, Password hợp lệ |           |                                                                                         | Thông báo "Thông tin sai :)"                           |                |          |
| Login_0013   | Kiểm tra username =null.                                                                            | Truy nhập vào hệ thống, Password hợp lệ |           | 1. Bỏ trống trường username<br/>2. Nhập đúng password<br/>3. Click vào button "Sign in" | Thông báo "Vui lòng điền đủ thông tin."                |                |          |
| Login_0014   | Kiểm tra đăng nhập thành công với password hợp lệ.                                                  | Truy nhập vào hệ thống, Username hợp lệ |           |                                                                                         |                                                        |                |          |
| Login_0015   | Kiểm tra đăng nhập thành công với password = 1 kí tự thường / ký tự unicode / ký tự bao gồm space.  | Truy nhập vào hệ thống, Username hợp lệ |           |                                                                                         |                                                        |                |          |
| Login_0016   | Kiểm tra đăng nhập thành công với password = 10 kí tự thường / ký tự unicode / ký tự bao gồm space. | Truy nhập vào hệ thống, Username hợp lệ |           |                                                                                         |                                                        |                |          |
| Login_0017   | Kiểm tra đăng nhập thành công với password = 20 kí tự thường / ký tự unicode / ký tự bao gồm space. | Truy nhập vào hệ thống, Username hợp lệ |           |                                                                                         |                                                        |                |          |
| Login_0018   | Kiểm tra đăng nhập không thành công với password không hợp lệ.                                      | Truy nhập vào hệ thống, Username hợp lệ |           |                                                                                         | Thông báo "Thông tin sai :)"                           |                |          |
| Login_0019   | Kiểm tra password =null.                                                                            | Truy nhập vào hệ thống, Username hợp lệ |           | 1. Bỏ trống trường password<br/>2. Nhập đúng username<br/>3. Click vào button "Sign in" | Thông báo "Vui lòng điền đủ thông tin."                |                |          |                                                                                                                                           |         |                                                                                         |                                         |      |     |
| Login_0020   | Kiểm tra đăng nhập thành công có click "Remember me".                                               | Truy nhập vào hệ thống                  |           |                                                                                         | username, password được ghi nhớ cho lần đăng nhập sau. |                |          |
| Login_0021   | Kiểm tra đăng nhập thành công bỏ click "Remember me".                                               | Truy nhập vào hệ thống                  |           |                                                                                         | username, password từ lần đăng nhập sau trở về rỗng    |                |          |
| Login_0022   | Kiểm tra click "Sign in" đăng nhập thành công.                                                      | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |
| Login_0023   | Kiểm tra click "Sign in" nhiều lần đăng nhập thành công.                                            | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |
| Login_0024   | Kiểm tra bảo mật mật khẩu cho người dùng, mật khẩu phải được lưu dưới dạng chuỗi đã mã hóa.         | Truy nhập vào hệ thống                  |           |                                                                                         |                                                        |                |          |

*Bạn có thể chỉnh sửa file này và copy nhưng phần cần thiết tới đường dẫn [MD to PDF](https://www.markdowntopdf.com/)
để tạo Test Report cho riêng bạn*

*Xem [Test Report demo](TestReportDemo.pdf)*