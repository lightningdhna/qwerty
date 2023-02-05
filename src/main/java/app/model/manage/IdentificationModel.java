package app.model.manage;

public class IdentificationModel {
    private int accountID = 0;//id tài khoản
    private String houseHoldNumber = "";//số hộ khẩu
    private String ownerRelation = "";//quan hệ chủ hộ
    private String cicNumber = "";//số CCCD
    private String state = "Thường trú";//trạng thái hộ khẩu(tạm trú,thường trú,tạm vắng,..,vv)

    public int getAccountID() {
        return accountID;
    }

    public String getHouseHoldNumber() {
        return houseHoldNumber;
    }

    public String getOwnerRelation() {
        return ownerRelation;
    }

    public String getCicNumber() {
        return cicNumber;
    }

    public String getState() {
        return state;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setHouseHoldNumber(String houseHoldNumber) {
        this.houseHoldNumber = houseHoldNumber;
    }

    public void setOwnerRelation(String ownerRelation) {
        this.ownerRelation = ownerRelation;
    }

    public void setCicNumber(String cicNumber) {
        this.cicNumber = cicNumber;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "IdentificationModel{" +
                "accountID=" + accountID +
                ", houseHoldNumber='" + houseHoldNumber + '\'' +
                ", ownerRelation='" + ownerRelation + '\'' +
                ", cicNumber='" + cicNumber + '\'' +
                ", State='" + state + '\'' +
                '}';
    }
}
