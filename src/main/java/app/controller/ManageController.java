package app.controller;

import app.PageManager;
import app.model.manage.CICRowInfo;
import app.view.manage.CICInfoTablePage;
import app.view.manage.ManageCICDetailWindow;
import components.demogrpahic.CIC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import service.DemographicManagementService;

public class ManageController {
    public static void setTableInfo(CICInfoTablePage page, TableView tableView){
        ObservableList<CICRowInfo> rowInfos =FXCollections.observableArrayList();
        for(CIC cic : DemographicManagementService.getService().getAllCICInfo()){
            rowInfos.add(DemographicManagementService.getService().convertToCICRowInfo(cic));
        }
        showTable(rowInfos,tableView);
    }
    public static void searchTableInfo(CICInfoTablePage page, TableView tableView, String name){
        ObservableList<CICRowInfo> rowInfos =FXCollections.observableArrayList();
        for(CIC cic : DemographicManagementService.getService().searchCICByName(name)){
            rowInfos.add(DemographicManagementService.getService().convertToCICRowInfo(cic));
        }
        showTable(rowInfos,tableView);
    }
    static void showTable(ObservableList<CICRowInfo> rowInfos, TableView tableView){
        tableView.setItems(rowInfos);
        tableView.setRowFactory(tv -> {
            TableRow<CICRowInfo> tableRow = new TableRow<>();
            tableRow.setOnMouseClicked(event -> {
                if (! tableRow.isEmpty() && event.getButton()== MouseButton.PRIMARY && event.getClickCount() == 1) {
                    CICRowInfo cicRow = tableRow.getItem();
                    ManageCICDetailWindow detailPage = new ManageCICDetailWindow();
                    detailPage.setInfo(cicRow);
//                    PageManager.getManager().getManagePage().switchPage(detailPage);
                    PageManager.getManager().getManagePage().addWindow(detailPage);
                }
            });
            return tableRow ;
        });
        ((TableColumn<CICRowInfo,String>)tableView.getColumns().get(0)).setCellValueFactory(new PropertyValueFactory<>("CICNumber"));
        ((TableColumn<CICRowInfo,String>)tableView.getColumns().get(1)).setCellValueFactory(new PropertyValueFactory<>("name"));
        ((TableColumn<CICRowInfo,String>)tableView.getColumns().get(2)).setCellValueFactory(new PropertyValueFactory<>("householdNumber"));
        ((TableColumn<CICRowInfo,String>)tableView.getColumns().get(3)).setCellValueFactory(new PropertyValueFactory<>("verifyState"));
        ((TableColumn<CICRowInfo,String>)tableView.getColumns().get(4)).setCellValueFactory(new PropertyValueFactory<>("username"));
    }
}
