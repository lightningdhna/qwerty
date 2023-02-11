package app.model.message;

public class YeuCauXacThucThanhTich extends YeuCauXacThuc{

    private String maThanhTich = "";
    public YeuCauXacThucThanhTich(){
        super();
        setTieuDe("Yêu cầu xác thực thành tích");
    }

    public String getMaThanhTich() {
        return maThanhTich;
    }

    public void setMaThanhTich(String maThanhTich) {
        this.maThanhTich = maThanhTich;
    }

    public YeuCauXacThucThanhTich(String maThanhTich){
        this();
        setMaThanhTich(maThanhTich);
    }
}
