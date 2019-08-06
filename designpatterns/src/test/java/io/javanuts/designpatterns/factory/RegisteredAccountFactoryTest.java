package io.javanuts.designpatterns.factory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegisteredAccountFactoryTest {

	private static RegisteredAccountFactory factory;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
			try
			{
				Class.forName("io.javanuts.designpatterns.factory.SavingsAccount");
				Class.forName("io.javanuts.designpatterns.factory.CheckingAccount");
				Class.forName("io.javanuts.designpatterns.factory.StudentLoanAccount");
				Class.forName("io.javanuts.designpatterns.factory.LineOfCreditAccount");
				
			}
			catch (ClassNotFoundException any)
			{
				any.printStackTrace();
			}
		
		factory = RegisteredAccountFactory.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
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
