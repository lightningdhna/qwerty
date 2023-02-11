package app.model.message;

import app.view.verify.YeuCauXacThucView;

public class YeuCauXacThucHoKhau extends YeuCauXacThuc{

    private String soHoKhau = "";

    public YeuCauXacThucHoKhau(){
        super();
        setTieuDe("Yêu cầu xác thực hộ khẩu");
    }

    public YeuCauXacThucHoKhau(String soHoKhau){
        this();
        this.soHoKhau = soHoKhau;
        setNoiDung(soHoKhau);
    }

    public YeuCauXacThucHoKhau(String soHoKhau, int idNguoiTao){
        this(soHoKhau);
        setIdTaiKhoanGui(idNguoiTao);
    }
}
