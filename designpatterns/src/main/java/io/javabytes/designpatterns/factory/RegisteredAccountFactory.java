
package io.javabytes.designpatterns.factory;

import java.util.HashMap;
import java.util.Map;


public class RegisteredAccountFactory {
   
    private static final RegisteredAccountFactory FACTORY = new RegisteredAccountFactory();
    private Map<AccountType,Account> accountMap = new HashMap<>();
    
    private RegisteredAccountFactory(){
       
    }
    public static RegisteredAccountFactory getInstance(){
        return FACTORY;
    }
    
    public void registerAccount(AccountType type,Account account){
      accountMap.put(type, account);  
    }
    
    public Account getAccount(AccountType type){
      return accountMap.get(type);
    }
    
}
