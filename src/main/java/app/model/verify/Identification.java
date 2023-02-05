package app.model.verify;

public class Identification {
    private int idAccount;              //ID tài khoản chủ hộ
    private String householdNumber;     //Số hộ khẩu
    private String relationshipWithHeadOfHousehold; //Mối quan hệ với chủ hộ
    private String cICNumber;           //Số cccd người xác định mối quan hệ với chủ hộ

    public Identification() {}

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(String householdNumber) {
        this.householdNumber = householdNumber;
    }

    public String getRelationshipWithHeadOfHousehold() {
        return relationshipWithHeadOfHousehold;
    }

    public void setRelationshipWithHeadOfHousehold(String relationshipWithHeadOfHousehold) {
        this.relationshipWithHeadOfHousehold = relationshipWithHeadOfHousehold;
    }

    public String getcICNumber() {
        return cICNumber;
    }

    public void setcICNumber(String cICNumber) {
        this.cICNumber = cICNumber;
    }
}
