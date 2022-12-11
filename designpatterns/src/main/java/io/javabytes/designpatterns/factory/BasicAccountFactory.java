/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabytes.designpatterns.factory;


public class BasicAccountFactory {
    
    private static final BasicAccountFactory FACTORY = new BasicAccountFactory();
    private BasicAccountFactory(){
        
    }
    
    public static BasicAccountFactory getInstance(){
        return FACTORY;
    }
    
    public Account getAccount(AccountType type){
      
        Account account = null ;
        if (null !=type )switch (type) {
            case SAV:
                account = new SavingsAccount();
                break;
            case CHK:
                account = new CheckingAccount();
                break;
            case LCA:
                account = new LineOfCreditAccount();
                break;
            case SLA:
                account = new StudentLoanAccount();
                break;
            default:
                break;
        }
        
        return account;
    }
    
}
