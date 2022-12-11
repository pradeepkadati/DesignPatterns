
package io.javabytes.designpatterns.factory;


public class StudentLoanAccount implements Account{

    static {
        RegisteredAccountFactory.getInstance().registerAccount(AccountType.SLA, new StudentLoanAccount());
    }
    @Override
    public String getAccountNumber() {
        return "SLA12345"; 
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.SLA; 
    }

    @Override
    public long getAccountBalance() {
        return 787; 
    }
    
}
