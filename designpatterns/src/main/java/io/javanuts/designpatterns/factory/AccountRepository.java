
package io.javanuts.designpatterns.factory;


public enum AccountRepository {
    
    CHK(AccountType.CHK,new CheckingAccount()),
    SAV(AccountType.SAV,new SavingsAccount()),
    SLA(AccountType.SLA,new StudentLoanAccount()),
    LCA(AccountType.LCA,new LineOfCreditAccount()),;
   
  private AccountType type;
  private Account account;
   
  AccountRepository(AccountType type,Account account){
      this.type = type;
      this.account = account;
  }

    public AccountType getType() {
        return type;
    }
    
    public Account getAccount() {
        return account;
    }

    
 }

