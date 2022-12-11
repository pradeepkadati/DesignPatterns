
package io.javabytes.designpatterns.factory;

public interface Account {
    
    String getAccountNumber();
    AccountType getAccountType();
    long getAccountBalance();
}
