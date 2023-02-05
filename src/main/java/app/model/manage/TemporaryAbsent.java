package app.model.manage;

import java.time.LocalDate;

public class TemporaryAbsent {
    private int absentID;//ID tạm vắng
    private String cicNumber;//số CCCD
    private LocalDate leaveDate;//Ngày đi
    private LocalDate backDate;//Ngày trở về
    private String reason;//Nguyên nhân tạm vắng

    public int getAbsentID() {
        return absentID;
    }

    public String getCicNumber() {
        return cicNumber;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public LocalDate getBackDate() {
        return backDate;
    }

    public String getReason() {
        return reason;
    }

    public void setAbsentID(int absentID) {
        this.absentID = absentID;
    }

    public void setCicNumber(String cicNumber) {
        this.cicNumber = cicNumber;
    }

    public void setLeaveDate(LocalDate leaveDate) {
        this.leaveDate = leaveDate;
    }

    public void setBackDate(LocalDate backDate) {
        this.backDate = backDate;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "TemporaryAbsent{" +
                "absentID=" + absentID +
                ", cicNumber='" + cicNumber + '\'' +
                ", leaveDate=" + leaveDate +
                ", backDate=" + backDate +
                ", reason='" + reason + '\'' +
                '}';
    }
}
