package service;

import components.demogrpahic.CIC;

import java.util.ArrayList;
import java.util.List;

public class DemographicManagementService extends Service{
    private static DemographicManagementService service;
    public static DemographicManagementService getService(){
        return service;
    }
    public List<CIC> getAllCICInfo() {
        return new ArrayList<>();

    }



}
