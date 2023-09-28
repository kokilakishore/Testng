package org.utility;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Example extends LibGlobal {

	@BeforeClass
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
		driver.quit();
	}
	@Test
	public void tc1() {
		System.out.println("Testcase -----1");		
		WebElement search=driver.findElement(By.id("Search-In-Modal-Single"));
		fillTextBox(search,"3D Rice Cooker");
		
		WebElement click=driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]"));
		toClick(click);
				
		WebElement addtocart=driver.findElement(By.xpath("//form[@id='form-7634981519520-template--16086732144800__main']"));
		toClick(addtocart);
		}
		@Before
	public void beforeTc() {
		System.out.println("Tc Started.........");
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void tc3() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@Test
	public void tc4() {
		String titleName=driver.getTitle();
		System.out.println(titleName);
	}
	@Test
	public void tc5() {
		String title=driver.getTitle();
		System.out.println(title);
		}
	
	
	
	
	}

