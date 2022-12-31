package components.demogrpahic;

import java.time.LocalDate;

public class CIC {
    String name="<default>";
        //Tên
    String otherName = "";
        //Tên gọi khác nếu có
    LocalDate dateOfBirth=LocalDate.now();
        //Ngày sinh
    String gender="<No>";
        //Giới tính

    String placeOfOrigin="<default>";
        //
    String placeOfResidence="<default>";
    String nationality = "Việt Nam";
    String ethnic = "Kinh";
    String passportNumber ="<default>";

    String personalIdentification ="<default>";


    LocalDate dateOfExpiry = LocalDate.now();


    String verifyState = "No";
    LocalDate dateVerify = LocalDate.now();
    String idVerifier ="-1";
    String note = "";

    String frontCICImageURL ="/";
    String backCICImageURL ="/";
}
