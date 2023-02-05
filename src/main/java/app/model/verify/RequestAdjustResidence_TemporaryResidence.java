package app.model.verify;

public class RequestAdjustResidence_TemporaryResidence {
    private int idAccount;          //ID tài khoản người muốn đính chính
    private String typeAdjust;      //Kiểu đính chính
    private String information;     //Thông tin
    private String reason;          //Lý do đính chính
    private String note;            //Ghi chú

    public RequestAdjustResidence_TemporaryResidence() {}

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getTypeAdjust() {
        return typeAdjust;
    }

    public void setTypeAdjust(String typeAdjust) {
        this.typeAdjust = typeAdjust;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
