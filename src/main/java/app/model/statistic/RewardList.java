package app.model.statistic;

public class RewardList {
    private int idAccount;              //ID tài khoản
    private int idEvent;                //Mã sự kiện
    private String passer;              //Người duyệt
    private String datePass;            //Ngày duyệt
    private String information;         //Thông tin
    private State state;                //Trạng thái
    private String photoProof;          //Ảnh minh chứng
    private String note;                //Ghi chú
    private int idAward;                //Mã phần thưởng

    public RewardList() {
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

    public String getPasser() {
        return passer;
    }

    public void setPasser(String passer) {
        this.passer = passer;
    }

    public String getDatePass() {
        return datePass;
    }

    public void setDatePass(String datePass) {
        this.datePass = datePass;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getPhotoProof() {
        return photoProof;
    }

    public void setPhotoProof(String photoProof) {
        this.photoProof = photoProof;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getIdAward() {
        return idAward;
    }

    public void setIdAward(int idAward) {
        this.idAward = idAward;
    }

    enum State{
        passed,
        cancel,
        received,
        receiveLater
    }
}
