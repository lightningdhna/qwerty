package components.event;

import java.time.LocalDate;

public class Event {
    private int idEvent;                //Mã sự kiện
    private String specialTime;         //Dịp đặc biệt
    private String address;             //Địa điểm
    private String regulation;          //Qui chế
    private String note;                //Ghi chú
    private String eventTypeName;           //Tên loại sự kiện
    private LocalDate createdDate;      //Ngày tạo
    private String state;               //Trạng thái
    private LocalDate endEvent;         //Lưu ngày kết thúc sự kiện nếu trạng thái sự kiện là đã kết thúc
    private double totalPrice;          //Tổng chi phí
    private int idAccountLeader;        //ID tài khoản tổ trường tạo sự kiện

    public Event() {
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getSpecialTime() {
        return specialTime;
    }

    public void setSpecialTime(String specialTime) {
        this.specialTime = specialTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegulation() {
        return regulation;
    }

    public void setRegulation(String regulation) {
        this.regulation = regulation;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getEventType() {
        return eventTypeName;
    }

    public void setEventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getIdAccountLeader() {
        return idAccountLeader;
    }

    public void setIdAccountLeader(int idAccountLeader) {
        this.idAccountLeader = idAccountLeader;
    }

    public LocalDate getEndEvent() {
        return endEvent;
    }

    public void setEndEvent(LocalDate endEvent) {
        this.endEvent = endEvent;
    }
}
