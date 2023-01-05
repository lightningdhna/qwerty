package service;

import components.database.IdentificationTable;
import components.demogrpahic.CIC;
import components.database.CICTable;

import java.util.List;

//Nguyên 2,4

public class DemographicManagementService extends Service{
    private static DemographicManagementService service = new DemographicManagementService();
    public static DemographicManagementService getService(){
        return service;
    }
    public List<CIC> getAllCICInfo() {
        //Lấy tất cả thoogon tin nhân khẩu
        return CICTable.getTable().getAllCIC();
    }

    public void addCIC(CIC cic) {
        CICTable.getTable().add(cic);
    }

    public CIC getCICInfoByAccountID(int accountID){
        //Trả về thông tin nhân khẩu biết số tài khoản
        String cicNumber = IdentificationTable.getTable().getCICNumberByAccountID(accountID);
        if(cicNumber == null){
            System.out.println("Bug getCICInfo by AccountID");
        }
        return getCICInfoByCICNumber(cicNumber);
    }
    public CIC getCICInfoByCICNumber(String cicNumber){
        // Trả về thông tin nhân khẩu biết số cccd
        List<CIC> cic = CICTable.getTable().getCICByCICNumber(cicNumber);
        if(cic.size()==0){
            System.out.println("Bug getCICInfo by CICNumber");
            return new CIC(cicNumber);
        }
        return cic.get(0);
    }

}
