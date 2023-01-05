package app.controller;

import app.view.manage.CICInfoTablePage;
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
    public static void setInfo(CICInfoTablePage page, TableView tableView){
        class RowInfo extends CIC {
            String accountUsername;
            public String getUsername(){
                return accountUsername;
            }
            public void setUsername(String username){
                accountUsername = username;
            }

        }
        ObservableList<RowInfo> rowInfos =FXCollections.observableArrayList();
        for(CIC cic : DemographicManagementService.getService().getAllCICInfo()){
            RowInfo rowInfo = (RowInfo) cic;
        }
        tableView.setItems(rowInfos);
        tableView.setRowFactory(tv -> {
            TableRow<RowInfo> tableRow = new TableRow<>();
            tableRow.setOnMouseClicked(event -> {
                if (! tableRow.isEmpty() && event.getButton()== MouseButton.PRIMARY && event.getClickCount() == 2) {

                }
            });
            return tableRow ;
        });
        ((TableColumn<RowInfo,String>)tableView.getColumns().get(1)).setCellValueFactory(new PropertyValueFactory<>("cicNumber"));
    }
}
