package components.demographic;

import java.time.LocalDateTime;

public class Household {
    private String householdID;             //Số hộ khẩu
    private String cICHeadOfHousehold;      //Số cccd chủ hộ
    private String nameOfHeadOfHousehold;   //Họ tên chủ hộ
    private String addressHousehold;        //Địa chỉ chủ hộ
    private String photoProof;              //Ảnh minh chứng
    private String note;                    //Ghi chú
    private LocalDateTime verifyTime;       //Thời điểm xác thực
    private int idVerifier;                 //ID tài khoản người xác thực
    public Household(String householdID, String cICHeadOfHousehold, String nameOfHeadOfHousehold, String addressHousehold, String photoProof, String note, LocalDateTime verifyTime, int idVerifier){
        this.householdID = householdID;
        this.cICHeadOfHousehold = cICHeadOfHousehold;
        this.nameOfHeadOfHousehold = nameOfHeadOfHousehold;
        this.addressHousehold = addressHousehold;
        this.photoProof = photoProof;
        this.note = note;
        this.verifyTime = verifyTime;
        this.idVerifier = idVerifier;
    }

    public Household() {
    }

    public String getHouseholdID() {
        return householdID;
    }

    public void setHouseholdID(String householdID) {
        this.householdID = householdID;
    }
    public String getcICHeadOfHousehold() {
        return cICHeadOfHousehold;
    }

    public void setcICHeadOfHousehold(String cICHeadOfHousehold) {
        this.cICHeadOfHousehold = cICHeadOfHousehold;
    }

    public String getNameOfHeadOfHousehold() {
        return nameOfHeadOfHousehold;
    }

    public void setNameOfHeadOfHousehold(String nameOfHeadOfHousehold) {
        this.nameOfHeadOfHousehold = nameOfHeadOfHousehold;
    }

    public String getAddressHousehold() {
        return addressHousehold;
    }

    public void setAddressHousehold(String addressHousehold) {
        this.addressHousehold = addressHousehold;
    }

    public String getPhotoProof() {
        return photoProof;
    }

    public void setPhotoProof(String photoProof) {
        this.photoProof = photoProof;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(LocalDateTime verifyTime) {
        this.verifyTime = verifyTime;
    }

    public int getIdVerifier() {
        return idVerifier;
    }

    public void setIdVerifier(int idVerifier) {
        this.idVerifier = idVerifier;
    }
}