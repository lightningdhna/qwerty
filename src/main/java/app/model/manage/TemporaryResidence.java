package app.model.manage;

import java.time.LocalDate;

public class TemporaryResidence {
    private int temporaryID;// ID tạm trú
    private String cicNumber;// Số CCCD
    private String temporaryAddress;// Địa chỉ tạm trú
    private String permanentAddress;//Địa chỉ thường trú
    private LocalDate beginDate;//Ngày bắt đầu tạm trú
    private LocalDate endDate;//Ngày kết thúc tạm trú

    public TemporaryResidence(int temporaryID, String cicNumber, String temporaryAddress, String permanentAddress, LocalDate beginDate, LocalDate endDate) {
        this.temporaryID = temporaryID;
        this.cicNumber = cicNumber;
        this.temporaryAddress = temporaryAddress;
        this.permanentAddress = permanentAddress;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public int getTemporaryID() {
        return temporaryID;
    }

    public String getCicNumber() {
        return cicNumber;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setTemporaryID(int temporaryID) {
        this.temporaryID = temporaryID;
    }

    public void setCicNumber(String cicNumber) {
        this.cicNumber = cicNumber;
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
