package app.model.notification;

import java.time.LocalDate;

public class GeneralNotification {
    private int idNotification;         //Mã thông báo
    private String content;             //Nội dung
    private String note;                //Ghi chú
    private LocalDate dateCreated;      //Ngày tạo
    private String type;                //Phân loại
    private int idAccountCadres;              //ID tài khoản cán bộ

    public GeneralNotification() {
    }

    public int getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdAccount() {
        return idAccountCadres;
    }

    public void setIdAccount(int idAccountCadres) {
        this.idAccountCadres = idAccountCadres;
    }
}
