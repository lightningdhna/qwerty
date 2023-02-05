package app.model.event;

import java.time.LocalDate;

public class NewEvent {
    private int idForm;                 //Mã form
    private LocalDate createdDate;      //Ngày tạo sự kiện
    private int idAccountCadres;        //ID tài khoản cán bộ
    private int idEvent;                //Mã sự kiện

    public NewEvent() {
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public int getIdAccountCadres() {
        return idAccountCadres;
    }

    public void setIdAccountCadres(int idAccountCadres) {
        this.idAccountCadres = idAccountCadres;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }
}
