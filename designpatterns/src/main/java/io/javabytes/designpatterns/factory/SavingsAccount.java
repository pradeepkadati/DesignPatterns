
package io.javabytes.designpatterns.factory;


public class SavingsAccount implements Account{

    static {
        RegisteredAccountFactory.getInstance().registerAccount(AccountType.SAV, new SavingsAccount());
    }
    @Override
    public String getAccountNumber() {
        return "SAV12345"; 
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.SAV; 
    }

    @Override
    public long getAccountBalance() {
        return 456;
    }
    
}
