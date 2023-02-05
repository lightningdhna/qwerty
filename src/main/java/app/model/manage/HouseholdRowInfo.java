package app.model.manage;

import components.demographic.CIC;
import components.demographic.Household;

import java.util.List;

public class HouseholdRowInfo extends Household {
    //Những điều nên hiển thị cho thông tin hộ khẩu.
    private String householdNumber;
    private String nameOfHeadOfHousehold;
    private String addressHoldhouse;
    private List<CIC> memberHousehold;

    public HouseholdRowInfo() {
        super();
    }

    public String getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(String householdNumber) {
        this.householdNumber = householdNumber;
    }

    @Override
    public String getNameOfHeadOfHousehold() {
        return nameOfHeadOfHousehold;
    }

    @Override
    public void setNameOfHeadOfHousehold(String nameOfHeadOfHousehold) {
        this.nameOfHeadOfHousehold = nameOfHeadOfHousehold;
    }

    public String getAddressHoldhouse() {
        return addressHoldhouse;
    }

    public void setAddressHoldhouse(String addressHoldhouse) {
        this.addressHoldhouse = addressHoldhouse;
    }

    public List<CIC> getMemberHousehold() {
        return memberHousehold;
    }

    public void setMemberHousehold(List<CIC> memberHousehold) {
        this.memberHousehold = memberHousehold;
    }
}