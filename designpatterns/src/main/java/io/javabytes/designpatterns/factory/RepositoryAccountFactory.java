
package io.javabytes.designpatterns.factory;

import java.util.HashMap;
import java.util.Map;


public class RepositoryAccountFactory {
    
  private static final RepositoryAccountFactory FACTORY = new RepositoryAccountFactory();
  private Map<AccountType,Account> accountMap = new HashMap<>();
    
    private RepositoryAccountFactory(){
    	for(AccountRepository repo:AccountRepository.values()) {
    		accountMap.put(repo.getType(), repo.getAccount());
        }
    }
    
    public static RepositoryAccountFactory getInstance(){
        return FACTORY;
    }
    
    public Account getAccount(AccountType type){
    	return accountMap.get(type);
    } 
    
    
}
