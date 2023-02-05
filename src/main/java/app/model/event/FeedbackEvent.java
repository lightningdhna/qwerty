package app.model.event;

import java.time.LocalDateTime;

public class FeedbackEvent {
    private int idForm;                         //ID form
    private LocalDateTime feedbackDateTime;     //Ngày giờ gửi form phản hồi
    private String content;                     //Nội dung
    private String note;                        //Ghi chú
    private int idAccount;                      //ID tài khoản
    private int idEvent;                        //Mã sự kiện

    public FeedbackEvent() {
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public LocalDateTime getFeedbackDateTime() {
        return feedbackDateTime;
    }

    public void setFeedbackDateTime(LocalDateTime feedbackDateTime) {
        this.feedbackDateTime = feedbackDateTime;
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
