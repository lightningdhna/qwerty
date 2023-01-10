package service;

import components.database.DatabaseConnection;
import components.database.IdentificationTable;
import components.demogrpahic.CIC;
import components.database.CICTable;
import app.model.manage.CICRowInfo;

import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
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

    public boolean addCIC(CIC cic) { return CICTable.getTable().add(cic);}
    public boolean updateCIC(CIC cic) { return CICTable.getTable().update(cic);}
    public boolean deleteCIC(String cicNumber) { return CICTable.getTable().delete(cicNumber);}
    public CIC getCICInfoByAccountID(int accountID){
        String cicNumber = IdentificationTable.getTable().getCICNumberByAccountID(accountID);
        if(cicNumber == ""){
            System.out.println("Không tìm thấy thông tin nhân khẩu với accountID: " + accountID);
            return new CIC();
        }
        return getCICInfoByCICNumber(cicNumber);
    }
    public CIC getCICInfoByCICNumber(String cicNumber){
        List<CIC> cic = CICTable.getTable().getCICByCICNumber(cicNumber);
        if(cic.size()==0){
            System.out.println("Không tìm thấy thông tin nhân khẩu với số CIC: " + cicNumber);
            return new CIC();
        }
        return cic.get(0);
    }
    public CICRowInfo convertToCICRowInfo(CIC cic) {
        CICRowInfo cicRowInfo = new CICRowInfo();
        cicRowInfo.setCICNumber(cic.getCICNumber());
        cicRowInfo.setName(cic.getName());
        cicRowInfo.setOtherName(cic.getOtherName());
        cicRowInfo.setDateOfBirth(cic.getDateOfBirth());
        cicRowInfo.setGender(cic.getGender());
        cicRowInfo.setPlaceOfOrigin(cic.getPlaceOfOrigin());
        cicRowInfo.setPlaceOfResidence(cic.getPlaceOfResidence());
        cicRowInfo.setPlaceOfTemporaryResidence(cic.getPlaceOfTemporaryResidence());
        cicRowInfo.setNationality(cic.getNationality());
        cicRowInfo.setEthnic(cic.getEthnic());
        cicRowInfo.setPassportNumber(cic.getPassportNumber());
        cicRowInfo.setPersonalIdentification(cic.getPersonalIdentification());
        cicRowInfo.setDateOfExpiry(cic.getDateOfExpiry());
        cicRowInfo.setVerifyState(cic.getVerifyState());
        cicRowInfo.setDateVerify(cic.getDateVerify());
        cicRowInfo.setIdVerifier(cic.getIdVerifier());
        cicRowInfo.setNote(cic.getNote());
        cicRowInfo.setFrontCICImageURL(cic.getFrontCICImageURL());
        cicRowInfo.setBackCICImageURL(cic.getBackCICImageURL());

        cicRowInfo.setHouseholdNumber("");
        cicRowInfo.setUsername("");
        cicRowInfo.setVerifierUsername("");
        return cicRowInfo;
    }
    public List<CIC> searchCICByName(String searchString) {
        return CICTable.getTable().searchCICByName(searchString);
    }
//    public static void main(String args[]){
//        DatabaseConnection.createConnection();
//        //Thêm 019826
//        CIC cic1 = new CIC("020g02","Quân","", LocalDate.of(2000,10,2),
//                "sdsdj","dsa9855d","nhà số 10,cách 10km","ddsa","dsa","das",
//                "0123","dsads",LocalDate.of(2001,10,2),"dsad",
//                LocalDate.of(2001,10,2), 6,"", "dsadsadsa","dsadas");
//        System.out.println(CICTable.getTable().canAdd(cic1));
//        if(CICTable.getTable().canAdd(cic1) == "OK"){
//        getService().addCIC(cic1);};

//        for (CIC cic : getService().getAllCICInfo()) {
//            System.out.println(cic.toString());
//        }
//        System.out.println();
//
//        //Tìm CIC bằng CICNumber với giá trị đúng
//        System.out.println(getService().getCICInfoByCICNumber("019826").toString());
//        System.out.println(getService().getCICInfoByAccountID(4).toString());
//        System.out.println();
//        //Tìm CIC bằng CICNumber với giá trị sai
//        System.out.println(getService().getCICInfoByCICNumber("012345").toString());
//        System.out.println(getService().getCICInfoByAccountID(10).toString());
//        System.out.println();
//
//        //update 019826
//        getService().updateCIC(new CIC("019826","Thay đổi","", LocalDate.of(2001,10,2),
//                "Male","123","123","d123","123","đas",
//                "","dsadsá",LocalDate.of(2001,10,2),"dsadá",
//                LocalDate.of(2001,10,2), 6,"", "dsadsadsa","dsadas"));
//        System.out.println(getService().getCICInfoByCICNumber("019826").toString());
//        System.out.println();
//        //Xóa 019826
//        getService().deleteCIC("019826");
//        //System.out.println(getService().getCICInfoByCICNumber("019826").toString()+"\n");
//
//        //Tìm bằng tên
//        for (CIC cic : getService().searchCICByName(" Hà ")) {
//            System.out.println(cic.toString());
//        }
//        System.out.println();
//
//        for (CIC cic : getService().searchCICByName(" ĐắC")) {
//            System.out.println(cic.toString());
//        }
//      }
}
