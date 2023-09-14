package Testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import testbase.BaseClass;


public class TC_002_LoginTest extends BaseClass {

	@Test()
	public void test_login() throws InterruptedException
	{

	
		LoginPage lp=new LoginPage(driver);
	lp.setuser();
	lp.setPassword();
	ScrollByjs();
	Thread.sleep(2000);
	lp.clickLogin();

		
	lp.fillform();
		
	}
}
