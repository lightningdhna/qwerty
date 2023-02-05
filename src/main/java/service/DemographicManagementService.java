package service;

import components.database.IdentificationTable;
import components.demogrpahic.CIC;
import components.database.CICTable;
import app.model.manage.CICRowInfo;


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

}
