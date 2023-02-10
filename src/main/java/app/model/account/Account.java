package app.model.account;

public class Account extends AccountInfo{
    private int idAccount;          //ID Tài khoản
    private String password= "";        //Mật khẩu
    private String username = "";        //Tên đăng nhập
    private String role = "";            //Vai trò
    private AccountInfo accountInfo ;//Thông tin chi tiết của tài khoản
    private String accountState = "";    //Trạng thái tài khoản

    public Account(int idAccount) {
        super(idAccount);
    }

    public Account(){};

    public Account(int accountID, String username,String password, String role){
        this.idAccount = accountID;
        this.username = username;
        this.password = password;
        this.role = role;

    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    public String getAccountState() {
        return accountState;
    }

    public void setAccountState(String accountState) {
        this.accountState = accountState;
    }
    public String getEncodePassword(){
        StringBuilder res = new StringBuilder("");
        int idx= Math.max(password.length()-5,0);
        res.append(password.substring(0,idx));
        res.append("*".repeat(Math.max(0, password.length() - idx)));
        return res.toString();
    }
    public void assign(Account account) {
        this.idAccount = account.getIdAccount();
        this.password= account.getPassword();
        this.username= account.getUsername();
        this.role= account.getRole();
        this.accountState = account.getAccountState();
    }
    public Account(String username, String password){
        this.username  = username;
        this.password = password;
    }
}
