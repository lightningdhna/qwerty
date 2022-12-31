package service;

public class Service {
    private static AccountManagementService accountManagementService;
    private static DemographicManagementService demographicManagementService;
    public static AccountManagementService manageAccount(){
        return accountManagementService;
    }
    public static DemographicManagementService manageDemographic(){
        return demographicManagementService;
    }
}
