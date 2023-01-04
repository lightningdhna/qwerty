package components.database;

//Nguyên 3
public class IdentificationTable extends DatabaseConnection{
    // Bẩng định danh
    private static  IdentificationTable table;
    public IdentificationTable getTable(){
        return table;
    }
    public String getCICNumberByAccountID(int accountID){
        // Trả về số cccd biết số tài khoản
        return " ";
    }
}
