package service;

import components.database.DatabaseConnection;
import components.database.IdentificationTable;
import components.demogrpahic.CIC;
import components.database.CICTable;

import java.time.LocalDate;
import java.util.List;

//Nguyên 2,4

public class DemographicManagementService extends Service{
    private static DemographicManagementService service;
    public static DemographicManagementService getService(){
        if(service == null){
            service = new DemographicManagementService();
        }
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
        String cicNumber = IdentificationTable.getTable().getCICNumberByAccountID(accountID);
        if(cicNumber == null){
            System.out.println("Không tìm thấy thông tin nhân khẩu với accountID: " + accountID);
            return null;
        }
        return getCICInfoByCICNumber(cicNumber);
    }
    public CIC getCICInfoByCICNumber(String cicNumber){
        List<CIC> cic = CICTable.getTable().getCICByCICNumber(cicNumber);
        if(cic.size()==0){
            System.out.println("Không tìm thấy thông tin nhân khẩu với số CIC: " + cicNumber);
            return null;
        }
        return cic.get(0);
    }
//    public static void main(String args[]){
//        DatabaseConnection.createConnection();
//        getService().addCIC(new CIC("019826","Na","", LocalDate.of(2001,10,2),
//                "Male","dsadá","dsadsa","dấdsa","dsađấ","đas",
//                "","dsadsá",LocalDate.of(2001,10,2),"dsadá",
//                LocalDate.of(2001,10,2), 5,"", "dsadsadsa","dsadas"));
//
//        for (CIC cic : getService().getAllCICInfo()) {
//            System.out.println(cic.toString());
//        }
//        System.out.println(getService().getCICInfoByCICNumber("019825").toString());
//        System.out.println(getService().getCICInfoByAccountID(5).toString());
//    }
}
