package io.javanuts.designpatterns.factory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.javabytes.designpatterns.factory.AccountType;
import io.javabytes.designpatterns.factory.BasicAccountFactory;
import io.javabytes.designpatterns.factory.CheckingAccount;
import io.javabytes.designpatterns.factory.LineOfCreditAccount;
import io.javabytes.designpatterns.factory.SavingsAccount;
import io.javabytes.designpatterns.factory.StudentLoanAccount;

public class BasicAccountFactoryTest {
	
	private static BasicAccountFactory factory; 
	
	@BeforeClass
	public static void BeforeClass() {
		factory =  BasicAccountFactory.getInstance();
	}
	
	@AfterClass
	public static void shutdown() throws Exception {
		factory = null;
	}
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

		
	@Test
    public void isCheckingAccount(){
     assertTrue(factory.getAccount(AccountType.CHK) instanceof CheckingAccount);
    }
	
	@Test
    public void isSavingsAccount(){
     assertTrue(factory.getAccount(AccountType.SAV) instanceof SavingsAccount);
    }
	
	@Test
    public void isSLAAccount(){
     assertTrue(factory.getAccount(AccountType.SLA) instanceof StudentLoanAccount);
    }
	
	@Test
    public void isLCAAccount(){
     assertTrue(factory.getAccount(AccountType.LCA) instanceof LineOfCreditAccount);
    }
	
	@Test
    public void isNotSavingsAccount(){
     assertFalse(factory.getAccount(AccountType.LCA) instanceof SavingsAccount);
    }
	
}
