
package io.javanuts.designpatterns.factory;

public interface Account {
    
    String getAccountNumber();
    AccountType getAccountType();
    long getAccountBalance();
}
