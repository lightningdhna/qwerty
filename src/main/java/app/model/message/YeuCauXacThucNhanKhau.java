package app.model.message;

public class YeuCauXacThucNhanKhau extends YeuCauXacThuc{

    private String soCCCD = "";
    public YeuCauXacThucNhanKhau(){
        super();
        setTieuDe("Yêu cầu xác thực nhân khẩu");
    }
    public YeuCauXacThucNhanKhau(String soCCCD){
        this();
        this.soCCCD = soCCCD;
        setNoiDung(soCCCD);
    }
}
