package Testpackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseHRMclass;
import pompackage.Pomlogin;

public class Logintest extends BaseHRMclass {
	Pomlogin pom;
		public Logintest() {
	super();
	}

	@BeforeMethod
	public void initstep() {
		initiation();
		pom=new Pomlogin();
	}
	@Test(priority=1)
	public void title() {
		String actual=pom.verify();
		System.out.println(actual);
	Assert.assertEquals(actual, "OrangeHRM");
		}
	
	@Test(priority=2)
	public void Login() {
		pom.typeusername(prop.getProperty("Username"));
		pom.typepassword(prop.getProperty("Password"));
		pom.clickbutton();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	}
	


