package app.view.message;

import javafx.scene.control.Alert;

public class Mes {

    public static void messageUnfinished(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Tính năng chưa hoàn thiện");
        alert.setContentText("Tính năng này chưa được nhóm phát triển\n");
        alert.show();
    }
    
    public static void inform(String title, String content){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}
