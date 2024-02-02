package run;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.loginpage;
import utils.aputils;

public class testcases extends aputils {
	
	@Parameters({"adminuid","adminpwd"})
	@Test
	public void checkadminlogin(String uid,String pwd){
		loginpage lp=new loginpage();
		lp.login(uid,pwd);
		boolean res=lp.isadminmoduledisplayed();
		Assert.assertTrue(res);
		System.out.println("test case is pass");
		lp.logout();
		
	}
	
	

}
