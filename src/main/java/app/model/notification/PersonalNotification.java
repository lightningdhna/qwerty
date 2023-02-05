package app.model.notification;

import java.time.LocalDate;

public class PersonalNotification {
    private int idNotification;         //Mã thông báo
    private String specialTime;         //Dịp đặc biệt
    private LocalDate createdTime;      //Ngày tạo
    private String content;             //Nội dung
    private String note;                //Ghi chú
    private int idAccountCadres;        //ID tài khoản cán bộ
    private int idAccount;              //ID tài khoản

    public PersonalNotification() {
    }

    public int getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDate createdTime) {
        this.createdTime = createdTime;
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

    public int getIdAccountCadres() {
        return idAccountCadres;
    }

    public void setIdAccountCadres(int idAccountCadres) {
        this.idAccountCadres = idAccountCadres;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getSpecialTime() {
        return specialTime;
    }

    public void setSpecialTime(String specialTime) {
        this.specialTime = specialTime;
    }
}
