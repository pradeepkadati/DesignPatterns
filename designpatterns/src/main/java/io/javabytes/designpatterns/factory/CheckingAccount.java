
package io.javabytes.designpatterns.factory;

public class CheckingAccount implements Account{

    static {
        RegisteredAccountFactory.getInstance().registerAccount(AccountType.CHK, new CheckingAccount());
    }
    @Override
    public String getAccountNumber() {
        return "CHK12345"; 
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.CHK; 
    }

    @Override
    public long getAccountBalance() {
        return 10000; 
    }
    
}
