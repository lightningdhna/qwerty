package components.demographic;

import java.time.LocalDate;

public class CIC {
    private String cicNumber;
    private String name="<default>";                        //Tên
    private String otherName = "";                          //Tên gọi khác nếu có
    private LocalDate dateOfBirth=LocalDate.now();          //Ngày sinh
    private String gender="<No>";                           //Giới tính

    private String placeOfOrigin="<default>";               // quê quán
    private String placeOfResidence="<default>";            //Thường trú
    private String placeOfTemporaryResidence = "";          //Tạm tr
    private String nationality = "Việt Nam";                //Quốc tịch
    private String ethnic = "Kinh";                         //Dân tộc
    private String passportNumber ="<default>";             //Số hộ chiếu
    private String personalIdentification ="<default>";     //Đặc điểm nhân dạng

    private LocalDate dateOfExpiry = LocalDate.now();       //Thời gian hiệu lực CIC

    private String verifyState = "No";                      //Trạng thái được xác thực
    private LocalDate dateVerify = LocalDate.now();         //Ngày được xác thực
    private int idVerifier = -1;                            //Id tài khoản người xác thực
    private String note = "";                               //Ghi chú
    private String frontCICImageURL ="/";                   //Ảnh mặt trước
    private String backCICImageURL ="/";                    //Ảnh mặt sau
    public CIC(String cicNumber, String name, String otherName, LocalDate dateOfBirth, String gender,
               String placeOfOrigin, String placeOfResidence, String placeOfTemporaryResidence, String nationality,
               String ethnic, String passportNumber, String personalIdentification, LocalDate dateOfExpiry,
               String verifyState, LocalDate dateVerify, int idVerifier, String note,
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

    public String getCICNumber() {
        return cicNumber;
    }

    public String getName() {
        return name;
    }

    public String getOtherName() {
        return otherName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public String getPlaceOfTemporaryResidence() {
        return placeOfTemporaryResidence;
    }

    public String getNationality() {
        return nationality;
    }

    public String getEthnic() {
        return ethnic;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getPersonalIdentification() {
        return personalIdentification;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public String getVerifyState() {
        return verifyState;
    }

    public LocalDate getDateVerify() {
        return dateVerify;
    }

    public int getIdVerifier() {
        return idVerifier;
    }

    public String getNote() {
        return note;
    }

    public String getFrontCICImageURL() {
        return frontCICImageURL;
    }

    public String getBackCICImageURL() {
        return backCICImageURL;
    }

    public void setCICNumber(String cicNumber) {
        this.cicNumber = cicNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setPersonalIdentification(String personalIdentification) {
        this.personalIdentification = personalIdentification;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public void setVerifyState(String verifyState) {
        this.verifyState = verifyState;
    }

    public void setDateVerify(LocalDate dateVerify) {
        this.dateVerify = dateVerify;
    }

    public void setIdVerifier(int idVerifier) {
        this.idVerifier = idVerifier;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setFrontCICImageURL(String frontCICImageURL) {
        this.frontCICImageURL = frontCICImageURL;
    }

    public void setBackCICImageURL(String backCICImageURL) {
        this.backCICImageURL = backCICImageURL;
    }

    public CIC(){};
    public boolean equals(CIC obj) {
        return this.cicNumber.equals( obj.getCICNumber());
    }

    @Override
    public String toString() {
        return "CIC{" +
                "cicNumber='" + cicNumber + '\'' +
                ", name='" + name + '\'' +
                ", otherName='" + otherName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", placeOfOrigin='" + placeOfOrigin + '\'' +
                ", placeOfResidence='" + placeOfResidence + '\'' +
                ", placeOfTemporaryResidence='" + placeOfTemporaryResidence + '\'' +
                ", nationality='" + nationality + '\'' +
                ", ethnic='" + ethnic + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", personalIdentification='" + personalIdentification + '\'' +
                ", dateOfExpiry=" + dateOfExpiry +
                ", verifyState='" + verifyState + '\'' +
                ", dateVerify=" + dateVerify +
                ", idVerifier=" + idVerifier +
                ", note='" + note + '\'' +
                ", frontCICImageURL='" + frontCICImageURL + '\'' +
                ", backCICImageURL='" + backCICImageURL + '\'' +
                '}';
    }

}
