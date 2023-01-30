# Xây dựng testcase cơ bản

## 1. Khái niệm Testcase

Test case là tập hợp các trường hợp điều kiện mà Tester dựa vào đó để xác định ứng dụng, hệ thống phần mềm hoặc là 1 
trong các chức năng của nó có hoạt động như mong muốn hay không.

Quá trình phát triển test case có thể giúp tìm ra lỗi trong các yêu cầu hoặc thiết kế của ứng dụng, vì nó đòi hỏi phải 
tư duy hoàn toàn thông qua các hoạt động của ứng dụng. 

Các trường hợp kiểm thử phải bao phủ được toàn bộ luồng xử lý chức năng mô tả trong tài liệu phân tích và thiết kế; các 
yêu cầu về bảo mật an toàn thông tin, yêu cầu hiệu năng của hệ thống.

## 2. Cấu trúc của Testcase

**• Test Case ID** : Giá trị cần để xác định số lượng trường hợp cần để kiểm thử.

**• Test Items** : Dựa theo chức năng của hệ thống có thể chia nhỏ các functions ra để tạo testcases rõ ràng hơn.

**• Pre-condition** : Điều kiện tiền đề nếu có

**• Test Data** : Những dữ liệu cần chuẩn bị để test

**• Test Steps** : Mô tả các bước thực hiện test

**• Expected results** : Kết quả mong đợi từ các bước thực hiện trên

**• A result** : Thông thường sẽ là pass, fail

**• Comments** : Cột này dùng để note lại thông tin liên quan khi thực hiện test case.

## 3. Xây dựng Testcase hỗ trợ Tester

### 3.1. Các Testcase cần test cho màn hình Login

#### 3.1.1. Yêu cầu Testcase

1. Username:

    Không được để trống và có độ dài 1-100 ký tự

2. Password:

    Không được để trống và có độ dài 1-100 ký tự

3. Các message thông báo lỗi:

    `"Vui lòng điền đủ thông tin."`

    `"Thông tin sai :)"`

4. Nhập đúng username và password sẽ chuyển vào màn hình chính.
#### 3.1.2. Testcase
1. UI
    ```shell
    Kiểm tra icon, font size, font style, font color của các text trên màn hình login & Error validation.

    Kiểm tra button "Sign In" highlighted khi hover mouse.

    Kiểm tra button "Sign In" đổi màu khi mouse click.

    Kiểm tra prompt text Username, Password mờ hoặc xoá khi click vào Username, Password textbox.

    Kiểm tra prompt text Username, Password bi xoá khi nhập value vào Username, Password textbox.

    Kiểm tra Paste keyboard, right click hoạt động với username, password.

    Kiểm tra Copy keyboard, right click hoạt động với username, password.
    ```
    

2. Function

    **• Username**

    ```shell
    Đăng nhập thành công với user hợp lệ.

    Đăng nhập thành công với user = 1 kí tự thường / ký tự unicode / ký tự bao gồm space

    Đăng nhập thành công với user = 10 kí tự thường / ký tự unicode / ký tự bao gồm space

    Đăng nhập thành công với user = 20 kí tự thường / ký tự unicode / ký tự bao gồm space

    Đăng nhập không thành công với user không hợp lệ. => Hiện thị tin nhắn "Thông tin sai :)"

    Đăng nhập không thành công với user =null. => Hiện thị tin nhắn "Vui lòng điền đủ thông tin."
    ```
   
    **• Password**

    ```shell
    Đăng nhập thành công với passwword hợp lệ

    Đăng nhập thành công với password = 1 kí tự thường / ký tự unicode / ký tự bao gồm space

    Đăng nhập thành công với password = 10 kí tự thường / ký tự unicode / ký tự bao gồm space
    
    Đăng nhập thành công với password = 20 kí tự thường / ký tự unicode / ký tự bao gồm space

    Đăng nhập không thành công với passwword không hợp lệ. => Hiện thị tin nhắn "Thông tin sai :)"
   
    Đăng nhập không thành công với password =null. => Hiện thị tin nhắn "Vui lòng điền đủ thông tin."
    ```

   **• Remember me**

    ```shell
   Đăng nhập thành công có click "Remember me" => username, password được ghi nhớ cho lần đăng nhập sau.
   Đăng nhâp thành công bỏ click "Remember me" => username, password từ lần đăng nhập sau trở về rỗng.
   ```

   **• Sign in**

    ```shell
    Click "Sign in" đăng nhập thành công

    Click "Sign in" nhiều lần đăng nhập thành công
    ```

3. Security

    ```shell
    Password không được lưu dưới dạng chuỗi thông thường mà phải lưu dưới dạng chuỗi
    đã mã hóa để đảm bảo không bị lộ mật khẩu dù mất database.
    ```
   *Phần mềm nhóm phát triển chưa thỏa mãn testcase này, sẽ hoàn thiện sớm trong thời gian tới. Dự kiến có hai lớp mã hóa bảo mật là MD5 và base64.*

   *Dể được hỗ trợ viết Test Report, vui lòng đi tới [Test Report](testReport.md).*