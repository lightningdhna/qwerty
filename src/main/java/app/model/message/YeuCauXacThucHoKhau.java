package app.model.message;

public class YeuCauXacThucHoKhau extends YeuCauXacThuc{

    private String soHoKhau = "";

    public YeuCauXacThucHoKhau(){
        super();
        setNoiDung(soHoKhau);
    }

    public YeuCauXacThucHoKhau(String soHoKhau){
        super();
        this.soHoKhau = soHoKhau;
        setNoiDung(soHoKhau);
    }
}
