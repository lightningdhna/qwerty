package app.model.message;

public class YeuCauXacThucNhanKhau extends YeuCauXacThuc{

    private String soCCCD = "";
    public YeuCauXacThucNhanKhau(){
        super();
        setTieuDe("Yêu cầu xác thực nhân khẩu");
        setNoiDung(soCCCD);
    }
    public YeuCauXacThucNhanKhau(String soCCCD){
        super();
        this.soCCCD = soCCCD;
        setNoiDung(soCCCD);
    }
}
