package app.model.manage;

import components.demographic.Household;

import java.time.LocalDateTime;

public class RequestVerifyHousehold{
    private int idVerifier;                     //ID Tài khoản người xác thực
    private String householdNumber;             //Số hộ khẩu
    private LocalDateTime requestVerifyTime;    //Thời điểm yêu cầu xác thực
    private String note;                        //Ghi chú

    public RequestVerifyHousehold() {}

    public int getIdVerifier() {
        return idVerifier;
    }

    public void setIdVerifier(int idVerifier) {
        this.idVerifier = idVerifier;
    }

    public String getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(String householdNumber) {
        this.householdNumber = householdNumber;
    }

    public LocalDateTime getRequestVerifyTime() {
        return requestVerifyTime;
    }

    public void setRequestVerifyTime(LocalDateTime requestVerifyTime) {
        this.requestVerifyTime = requestVerifyTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}