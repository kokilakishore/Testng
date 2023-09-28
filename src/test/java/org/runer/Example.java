package org.runer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.utility.LibGlobal;

public class Example extends LibGlobal {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	openChrome();
	launchUrl("https://www.facebook.com/");
	maxWindow();
	printTitle();
	printUrl();
	WebElement uname=driver.findElement(By.id("email"));
	fillTextBox(uname,"Greens@gmail.com");
	WebElement passw=driver.findElement(By.id("pass"));
	fillTextBox(passw,"Greens123");
	WebElement btnLogin=driver.findElement(By.name("Login"));
	toClick(btnLogin);
	getText(uname);
	hold(3000);
	closeBrowser();

}

}
