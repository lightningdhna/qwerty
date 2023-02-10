package app.model.manage;

import components.demographic.CIC;

public class CICRowInfo extends CIC {
    private String householdNumber = "houseHoldNumber";
    private String accountUsername = "account username ";
    private String verifierUsername = " verifier ";
    public CICRowInfo(){
        super();
    }
    public String getUsername(){
        return accountUsername;
    }
    public void setUsername(String username){
        accountUsername = username;
    }
    public String getHouseholdNumber(){
        return householdNumber;
    }
    public void setHouseholdNumber(String householdNumber){
        this.householdNumber = householdNumber;
    }

    public String getVerifierUsername(){
        return this.verifierUsername;
    }

    public void setVerifierUsername(String verifierUsername) {
        this.verifierUsername = verifierUsername;
    }

}
