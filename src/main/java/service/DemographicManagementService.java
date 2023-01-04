package service;

import components.demogrpahic.CIC;

import java.util.ArrayList;
import java.util.List;

//Nguyên 2,4

public class DemographicManagementService extends Service{
    private static DemographicManagementService service;
    public static DemographicManagementService getService(){
        return service;
    }
    public List<CIC> getAllCICInfo() {
        return new ArrayList<>();
        //Lấy tất cả thoogon tin nhân khẩu
    }

    public CIC getCICInfoByAccountID(int accountID){
        //Trả về thông tin nhân khẩu biết số tài khoản
        // String cicNumber = IdentificationTable.getTable().getCICNumberByAccountID(accountID);
        // return getCICInfoByCICNumber(cicNumber);
        return new CIC("");
    };
    public CIC getCICInfoByCICNumber(String cicNumber){
        // Trả về thông tin nhân khẩu biết số cccd
        return new CIC(cicNumber);
    }

}
