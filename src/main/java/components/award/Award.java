package components.award;

public class Award {
    private int idAward;            //Mã phần thưởng
    private String awardName;       //Tên phần thưởng
    private String description;     //Mô tả
    private double valueByMoney;    //Giá trị bằng tiền
    private String classifyRules;   //Qui tắc phân loại
    private int idEvent;            //Mã sự kiện

    public Award() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValueByMoney() {
        return valueByMoney;
    }

    public void setValueByMoney(double valueByMoney) {
        this.valueByMoney = valueByMoney;
    }

    public String getClassifyRules() {
        return classifyRules;
    }

    public void setClassifyRules(String classifyRules) {
        this.classifyRules = classifyRules;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }
}
