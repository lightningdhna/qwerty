package app.model.verify;

import java.time.LocalDateTime;

public class RequestVerifyCIC{
    private int idAccount;                     //Id tài khoản người được xác thực
    private String householdNumber;             //Số hộ khẩu
    private LocalDateTime requestVerifyTime;    //Thời điểm yêu cầu xác thực
    private String note;                        //Ghi chú

    public RequestVerifyCIC() {}

    public int getIdVerifier() {
        return idAccount;
    }

    public void setIdVerifier(int idAccount) {
        this.idAccount = idAccount;
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