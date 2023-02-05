package service;

import components.database.HouseHoldTable;
import app.model.manage.HouseHoldModel;

import java.util.List;

public class HouseHoldManagementService extends Service {
    private static HouseHoldManagementService service;

    public static HouseHoldManagementService getService() {
        if (service == null) {
            service = new HouseHoldManagementService();
        }
        return service;
    }

    public List<HouseHoldModel> getAllHouseHoldInfo() {
        return HouseHoldTable.getTable().getAllHouseHoldInfo();
    }

    public boolean addHouseHoldInfo(HouseHoldModel houseHoldModel) {
        return HouseHoldTable.getTable().add(houseHoldModel);
    }

    public boolean updateHouseHoldInfo(HouseHoldModel houseHoldModel) {
        return HouseHoldTable.getTable().update(houseHoldModel);
    }

    public boolean deleteHouseHoldInfo(String houseHoldNumber) {
        return HouseHoldTable.getTable().delete(houseHoldNumber);
    }

    public HouseHoldModel getHouseHoldInfoByHouseHoldNumber(String houseHoldNumber) {
        return HouseHoldTable.getTable().getHouseHoldInfoByhouseHoldNumber(houseHoldNumber);
    }

    public HouseHoldModel getHouseHoldInfoByHouseOwnerCICNumber(String houseOwnerCICNumber) {
        return HouseHoldTable.getTable().getHouseHoldInfoByHouseOwnerCICNumber(houseOwnerCICNumber);
    }
}