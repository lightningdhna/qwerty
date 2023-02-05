package app.model.event;

import java.time.LocalDateTime;

public class RegisterReceiveAward {
    private int idForm;                         //ID form
    private String photoProof;                  //Ảnh minh chứng
    private String content;                     //Nội dung
    private String note;                        //Ghi chú
    private LocalDateTime registerDateTime;     //Ngày giờ gửi đăng ký
    private int idAccount;                      //ID tài khoản
    private int idEvent;                        //Mã sự kiện

    public RegisterReceiveAward() {
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public String getPhotoProof() {
        return photoProof;
    }

    public void setPhotoProof(String photoProof) {
        this.photoProof = photoProof;
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

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(LocalDateTime registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }
}
