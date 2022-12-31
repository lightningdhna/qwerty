package service;

import java.sql.*;

public class DatabaseConnectionService {
    private static Connection conn = null;
    private static Statement statement = null;

    public static void startConnecting() {
        if(conn==null) {
            createConnection();
        }
        try {
            if(conn.isClosed())
                conn.beginRequest();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(){
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static ResultSet executeQuery(String query) throws SQLException {
        startConnecting();
        ResultSet rs =  statement.executeQuery(query);
        closeConnection();
        return rs;
    }
    public static void execute(String query) throws SQLException {
        startConnecting();
        statement.execute(query);
        closeConnection();
    }
    public static void createConnection(String serverName, String user, String password,String databaseName ,String port ){
        try {
            String dbURL =String.format(
                    """
                    jdbc:sqlserver:// %s : %s ;
                    databaseName= %s ;"+
                    encrypt=true; trustServerCertificate=true;
                    sslProtocol=TLSv1.2
                    """,serverName, port , databaseName
                    );
            conn = DriverManager.getConnection(dbURL, user, password);
            statement=conn.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void createConnection(String serverName, String user, String password, String databaseName){
        createConnection(serverName, user, password,databaseName, "1433");
    }
    public static void createConnection(){
        createConnection("DESKTOP-9UGDV8N\\SQLEXPRESS","sa","1842002","db");
    }

}
