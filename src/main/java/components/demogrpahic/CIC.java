package components.demogrpahic;

import java.time.LocalDate;

public class CIC {
    String cicNumber;
    String name="<default>";                        //Tên
    String otherName = "";                          //Tên gọi khác nếu có
    LocalDate dateOfBirth=LocalDate.now();          //Ngày sinh
    String gender="<No>";                           //Giới tính

    String placeOfOrigin="<default>";               // quê quán
    String placeOfResidence="<default>";            //Thường trú
    String placeOfTemporaryResidence = "";          //Tạm tr
    String nationality = "Việt Nam";                //Quốc tịch
    String ethnic = "Kinh";                         //Dân tộc
    String passportNumber ="<default>";             //Số hộ chiếu
    String personalIdentification ="<default>";     //Đặc điểm nhân dạng

    LocalDate dateOfExpiry = LocalDate.now();       //Thời gian hiệu lực CIC

    String verifyState = "No";                      //Trạng thái được xác thực
    LocalDate dateVerify = LocalDate.now();         //Ngày được xác thực
    String idVerifier ="-1";                        //Id tài khoản người được xác thực
    String note = "";                               //Ghi chú

    String frontCICImageURL ="/";                   //Ảnh mặt trước

    String backCICImageURL ="/";                    //Ảnh mặc sau

    public CIC(String cicNumber, String name, String otherName, LocalDate dateOfBirth, String gender,
               String placeOfOrigin, String placeOfResidence, String placeOfTemporaryResidence, String nationality,
               String ethnic, String passportNumber, String personalIdentification, LocalDate dateOfExpiry,
               String verifyState, LocalDate dateVerify, String idVerifier, String note,
               String frontCICImageURL, String backCICImageURL) {

        this.cicNumber = cicNumber;
        this.name = name;
        this.otherName = otherName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.placeOfOrigin = placeOfOrigin;
        this.placeOfResidence = placeOfResidence;
        this.placeOfTemporaryResidence = placeOfTemporaryResidence;
        this.nationality = nationality;
        this.ethnic = ethnic;
        this.passportNumber = passportNumber;
        this.personalIdentification = personalIdentification;
        this.dateOfExpiry = dateOfExpiry;
        this.verifyState = verifyState;
        this.dateVerify = dateVerify;
        this.idVerifier = idVerifier;
        this.note = note;
        this.frontCICImageURL = frontCICImageURL;
        this.backCICImageURL = backCICImageURL;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public String getBackCICImageURL() {
        return backCICImageURL;
    }

    public LocalDate getDateVerify() {
        return dateVerify;
    }

    public String getEthnic() {
        return ethnic;
    }

    public String getFrontCICImageURL() {
        return frontCICImageURL;
    }

    public String getGender() {
        return gender;
    }

    public String getIdVerifier() {
        return idVerifier;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getNote() {
        return note;
    }

    public String getOtherName() {
        return otherName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getPersonalIdentification() {
        return personalIdentification;
    }
    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }


    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public String getVerifyState() {
        return verifyState;
    }
    public String getPlaceOfTemporaryResidence() {
        return placeOfTemporaryResidence;
    }

    public String getCicNumber() {
        return cicNumber;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public void setDateVerify(LocalDate dateVerify) {
        this.dateVerify = dateVerify;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public void setFrontCICImageURL(String frontCICImageURL) {
        this.frontCICImageURL = frontCICImageURL;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIdVerifier(String idVerifier) {
        this.idVerifier = idVerifier;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setPersonalIdentification(String personalIdentification) {
        this.personalIdentification = personalIdentification;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public void setPlaceOfTemporaryResidence(String placeOfTemporaryResidence) {
        this.placeOfTemporaryResidence = placeOfTemporaryResidence;
    }

    public void setVerifyState(String verifyState) {
        this.verifyState = verifyState;
    }


    public void setBackCICImageURL(String backCICImageURL) {
        this.backCICImageURL = backCICImageURL;
    }
    public CIC(String ID){
        this.cicNumber = ID;
    }
    public boolean equals(CIC obj) {
        return this.cicNumber.equals( obj.getCicNumber());
    }

}
