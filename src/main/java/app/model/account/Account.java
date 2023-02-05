package app.model.account;

public class Account{
    private int idAccount;          //ID Tài khoản
    private String password;        //Mật khẩu
    private String username;        //Tên đăng nhập
    private String role;            //Vai trò
    private AccountInfo accountInfo;//Thông tin chi tiết của tài khoản
    private String accountState;    //Trạng thái tài khoản

    public Account() {}

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
}
