package run;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.loginpage;
import utils.aputils;

public class invalid extends aputils{
	@Test
	public void ivaliddata() {
		loginpage lp=new loginpage();
		lp.login("abc", "xyz");
		boolean res=lp.errmessage();
		Assert.assertTrue(res);
	}
	
		
	
		
	

}
