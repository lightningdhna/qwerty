package components.accountmanagement;





import components.accountmanagement.database.AccountTable;
import components.accountmanagement.model.Account;

import java.util.List;

public class AccountManagementService {


    private static final AccountManagementService manager = new AccountManagementService();
    private AccountManagementService(){
    }

    public List<Account> getAllAccount(){
        return AccountTable.getAllAccount();
    }
    public static AccountManagementService getManager(){
        return manager;
    }
    public boolean checkExist(Account account){
        List<Account> resultSearch= AccountTable.search(account);
         if(resultSearch.size()==1){
             account.assign(resultSearch.get(0));
             return true;
         }
         else return false;
    }

    public boolean add(Account account){
        return AccountTable.add(account);
    }
    public Account getAccount(int id){
        List<Account> accounts = AccountTable.getAccountByID(id);
        if(accounts.size()==0){
            System.out.println("Bug getAccount by id");
            return new Account("","");
        }
        return accounts.get(0);
    }

}
