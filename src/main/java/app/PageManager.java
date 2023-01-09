package app;

import app.model.Page;
import app.view.main.MainPage;
import app.view.manage.ManagePage;

public class PageManager {
    static PageManager manager = new PageManager();
    public static PageManager getManager(){
        return manager;
    }
    ManagePage managePage ;

    public void setManagePage(ManagePage page){
        this.managePage = page;
    }
    public ManagePage getManagePage(){
        return this.managePage;
    }
}
