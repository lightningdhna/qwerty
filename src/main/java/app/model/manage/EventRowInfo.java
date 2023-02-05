package app.model.manage;

import components.event.Event;

import java.time.LocalDate;

public class EventRowInfo extends Event {
    private int idEvent;                //Mã sự kiện
    private String eventTypeName;       //Tên loại sự kiện
    private LocalDate createdDate;      //Ngày tạo sự kiện
    private String state;               //Trạng thái sự kiên
    private LocalDate endEvent;         //Lưu ngày kết thúc sự kiện với trạng thái sự kiện là đã kết thúc

    public EventRowInfo() {
    }

    @Override
    public int getIdEvent() {
        return idEvent;
    }

    @Override
    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    @Override
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public LocalDate getEndEvent() {
        return endEvent;
    }

    @Override
    public void setEndEvent(LocalDate endEvent) {
        this.endEvent = endEvent;
    }
}
