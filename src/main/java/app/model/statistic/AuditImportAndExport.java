package app.model.statistic;

import java.time.LocalDateTime;

public class AuditImportAndExport {
    private int idForm;                 //Mã phiếu
    private String type;                //Loại
    private LocalDateTime dateTime;     //Thời điểm
    private String accountant;          //Người thu chi(vai trò kế toán)
    private double value;               //Giá trị
    private String note;                //Ghi chú
    private int isEvent;                //Mã sự kiện

    public AuditImportAndExport() {
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getAccountant() {
        return accountant;
    }

    public void setAccountant(String accountant) {
        this.accountant = accountant;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getIsEvent() {
        return isEvent;
    }

    public void setIsEvent(int isEvent) {
        this.isEvent = isEvent;
    }
}
