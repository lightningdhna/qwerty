module app {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    requires java.sql;
    requires com.microsoft.sqlserver.jdbc;
    requires com.jfoenix;
    requires AnimateFX;


    opens app to javafx.fxml;
    exports app;

    opens app.view.login to javafx.fxml;
    exports app.view.login;
    opens app.view.main to javafx.fxml;
    exports app.view.main;
    exports app.view.manage;
    exports service;
    opens service to javafx.fxml;
    opens app.controller to javafx.base;
    opens app.view.account to javafx.fxml;
    opens app.view.manage to javafx.base, javafx.fxml;
    opens app.model.demographic to javafx.base;
    opens app.model.household to javafx.base;
    exports app.view.viewmodel;
    opens app.view.viewmodel to javafx.fxml;
}