package app.model.statistic;

public class AwardRowInfo {
    private int idAward;            //Mã phần thưởng
    private String awardName;       //Tên phần thưởng
    private double valueByMoney;    //Giá trị bằng tiền
    private int idEvent;            //Mã sự kiện
    private String eventTypeName;   //Tên loại sự kiện

    public AwardRowInfo() {
    }

    public int getIdAward() {
        return idAward;
    }

    public void setIdAward(int idAward) {
        this.idAward = idAward;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public double getValueByMoney() {
        return valueByMoney;
    }

    public void setValueByMoney(double valueByMoney) {
        this.valueByMoney = valueByMoney;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}
