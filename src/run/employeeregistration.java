package run;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.adminutils;
import library.employee;

public class employeeregistration extends adminutils{
	@Parameters({"fname","lname"})
	@Test
	public void checkempreg(String fname,String lname) {
		employee emp=new employee();
		boolean res=emp.addEmployee(fname,lname);
		Assert.assertTrue(res);
		
	}
	

}
