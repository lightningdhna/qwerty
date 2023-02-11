package service;



import app.database.TaiKhoanTable;
import app.model.account.Account;

import java.util.List;

public class AccountManagementService {


    private static final AccountManagementService manager = new AccountManagementService();
    private AccountManagementService(){
    }

    public List<Account> getAllAccount(){
        return TaiKhoanTable.getAllAccount();
    }
    public static AccountManagementService getManager(){
        return manager;
    }
    public boolean checkExist(Account account){
        List<Account> resultSearch= TaiKhoanTable.search(account);
        return resultSearch.size() == 1;
    }
    public int getAccountID(Account account){
        List<Account> resultSearch= TaiKhoanTable.search(account);
        if(resultSearch.size()==0)
            return -1;
        return resultSearch.get(0).getIdAccount();
    }

    public boolean add(Account account){
        return TaiKhoanTable.add(account);
    }
    public Account getAccount(int id){
        List<Account> accounts = TaiKhoanTable.getAccountByID(id);
        if(accounts.size()==0){
            System.out.println("Bug getAccount by id");
            return new Account("","");
        }
        return accounts.get(0);
    }

}
