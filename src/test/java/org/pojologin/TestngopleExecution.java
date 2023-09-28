package org.pojologin;

import java.util.Date;
import org.openqa.selenium.WebElement;
import org.oplepojo.Pojo3;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.LibGlobal;



public class TestngopleExecution extends LibGlobal {
	@BeforeClass(alwaysRun = true)
	public static void beforetc() throws InterruptedException {
	openEdge();
	launchUrl("https://ople.com.au/");
	maxWindow();
	hold(2000);
	}
	
	@AfterClass
	public static void afterTc() {
		Date d=new Date();
		System.out.println(d);
		
	}
	@Parameters({"product"})
	
	@Test(enabled=true, priority=-4, groups= {"Smoke,Regression"},alwaysRun = true)
	public void tc1(@Optional("cooker")String s1) {
		Pojo3 p=new Pojo3();
		
		WebElement search=p.getSearchtext();
		fillTextBox(search,s1);
		toImplicitWait(2000);
		
		WebElement click=p.getCooker();
		toClick(click);
		toImplicitWait(2000);
		
		WebElement addtocart=p.getAddtocart();
		toClick(addtocart);
		
		String current=driver.getCurrentUrl();
		Assert.assertTrue(current.contains("3D+Rice+Cooker"),"Test condition - 1");
		System.out.println("Test case -1 passed");
		}
		
	@Test(priority=-2, groups="Smoke")
	public void tc3() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@Test(priority=4, groups="Sanity")
	public void tc4() {
		String titleName=driver.getTitle();
		System.out.println(titleName);
	}
	@Test(priority=3, groups="Regression")
	public void tc5() {
		String title=driver.getTitle();
		System.out.println(title);
		}
	@BeforeMethod(alwaysRun = true)
	public void beforeTc() {
		System.out.println("Tc Started.........");
		Date d=new Date();
		System.out.println(d);
	
}
}
