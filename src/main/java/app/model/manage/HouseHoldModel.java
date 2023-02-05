package app.model.manage;

import java.time.LocalDate;
import java.util.Objects;

public class HouseHoldModel {
    private String houseHoldNumber = "houseHoldNumber";//Số hộ khẩu
    private String houseOwnerCICNumber = "houseOwnerCICNumber";//Số CCCD chủ hộ
    private String houseOwnerName = "houseOwnerName";//Tên chủ hộ
    private String address = "address";//Địa chỉ hộ khẩu
    private LocalDate dateVerify = LocalDate.now();//Ngày xác thực
    private String note = "";//Ghi chú
    private String verifyImageURL = "";//URL ảnh minh chứng hộ khẩu
    private int verifierId = -1;//Id tài khoản xác thực

    public HouseHoldModel() {
    }

    public HouseHoldModel(String houseHoldNumber, String houseOwnerCICNumber, String houseOwnerName, String address,
                          LocalDate dateVerify, String note, String verifyImageURL, int verifierId) {
        this.houseHoldNumber = houseHoldNumber;
        this.houseOwnerCICNumber = houseOwnerCICNumber;
        this.houseOwnerName = houseOwnerName;
        this.address = address;
        this.dateVerify = dateVerify;
        this.note = note;
        this.verifyImageURL = verifyImageURL;
        this.verifierId = verifierId;
    }

    public String getHouseHoldNumber() {
        return houseHoldNumber;
    }

    public String getHouseOwnerCICNumber() {
        return houseOwnerCICNumber;
    }

    public String getHouseOwnerName() {
        return houseOwnerName;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateVerify() {
        return dateVerify;
    }

    public String getNote() {
        return note;
    }

    public String getVerifyImageURL() {
        return verifyImageURL;
    }

    public int getVerifierId() {
        return verifierId;
    }

    public void setHouseHoldNumber(String houseHoldNumber) { this.houseHoldNumber = houseHoldNumber; }

    public void setHouseOwnerCICNumber(String houseOwnerCICNumber) { this.houseOwnerCICNumber = houseOwnerCICNumber; }

    public void setHouseOwnerName(String houseOwnerName) {
        this.houseOwnerName = houseOwnerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateVerify(LocalDate dateVerify) {
        this.dateVerify = dateVerify;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setVerifyImageURL(String verifyImageURL) {
        this.verifyImageURL = verifyImageURL;
    }

    public void setVerifierId(int verifierId) {
        this.verifierId = verifierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseHoldModel houseHoldModel = (HouseHoldModel) o;
        return getVerifierId() == houseHoldModel.getVerifierId() && getHouseHoldNumber().equals(houseHoldModel.getHouseHoldNumber()) && Objects.equals(getHouseOwnerCICNumber(), houseHoldModel.getHouseOwnerCICNumber()) && Objects.equals(getHouseOwnerName(), houseHoldModel.getHouseOwnerName()) && Objects.equals(getAddress(), houseHoldModel.getAddress()) && Objects.equals(getDateVerify(), houseHoldModel.getDateVerify()) && Objects.equals(getNote(), houseHoldModel.getNote()) && getVerifyImageURL().equals(houseHoldModel.getVerifyImageURL());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHouseHoldNumber(), getHouseOwnerCICNumber(), getHouseOwnerName(), getAddress(), getDateVerify(), getNote(), getVerifyImageURL(), getVerifierId());
    }

    @Override
    public String toString() {
        return "HouseHoldInfo{" +
                "houseHoldNumber='" + houseHoldNumber + '\'' +
                ", houseOwnerCICNumber='" + houseOwnerCICNumber + '\'' +
                ", houseOwnerName='" + houseOwnerName + '\'' +
                ", address='" + address + '\'' +
                ", dateVerify=" + dateVerify +
                ", note='" + note + '\'' +
                ", verifyImageURL='" + verifyImageURL + '\'' +
                ", verifierId=" + verifierId +
                '}';
    }
}
