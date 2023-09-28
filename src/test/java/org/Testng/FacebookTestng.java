package org.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.Date;
import org.openqa.selenium.WebElement;
import org.pojologin.PojoLogin;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.utility.LibGlobal;

public class FacebookTestng  extends LibGlobal{
	@BeforeClass
	public void chromeOpen() {
		openEdge();
		maxWindow();		
}
	@AfterClass
	public void chromeClose() {
		closeBrowser();
			}
@BeforeMethod
private void startTime() {
	launchUrl("https://www.facebook.com");
	Date d=new Date();
	System.out.println(d);
}
@AfterMethod
private void endTime() {
	System.out.println(new Date());
}

//@Parameters({"emailId","Password"})
//@Test
//private void tc1(@Optional("Hello Koki") String s1,@Optional("Hello vinokavi") String s2) {
//	PojoLogin l=new PojoLogin();
//	WebElement txtUser=l.getTxtEmail();	
// fillTextBox(txtUser,s1);
//	WebElement txtPass=l.getTxtPwd();
//	fillTextBox(txtPass,s2);
//	WebElement btn=l.getBtnlogin();
//	toClick(btn);
//}

@Test(enabled=true)
private void tc2() throws InterruptedException {
	PojoLogin l=new PojoLogin();
	WebElement txtUser=l.getTxtEmail();	
	fillTextBox(txtUser,"kokila");
	WebElement txtPass=l.getTxtPwd();
	fillTextBox(txtPass,"kishore");
	WebElement btn=l.getBtnlogin();
	toClick(btn);
	Thread.sleep(2000);
	
	
//	String current=driver.getCurrentUrl();
//	SoftAssert s=new SoftAssert();
//	s.assertTrue(current.contains("hai"),"Check the Credential");
//	System.out.println("Test case 2 pass");
//	s.assertAll();
	
}
//@DataProvider(name="Facebook")
//private Object[][]loginData(){
//	return new Object[][]{
//	{"kokila","kokila@123"},
//	{"kishore","kish@123"},
//	{"Gowtham","Gowtham@123"}
	
//};
//}
}






