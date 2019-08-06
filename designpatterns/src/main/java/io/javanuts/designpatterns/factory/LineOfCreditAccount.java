
package io.javanuts.designpatterns.factory;


public class LineOfCreditAccount implements Account{

    static {
        RegisteredAccountFactory.getInstance().registerAccount(AccountType.LCA, new LineOfCreditAccount());
    }
    @Override
    public String getAccountNumber() {
        return "LCA12345"; 
    }

    @Override
    public AccountType getAccountType() {
       return AccountType.LCA; 
    }

    @Override
    public long getAccountBalance() {
        return 2345; 
    }
    
}
