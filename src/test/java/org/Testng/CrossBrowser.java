package org.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
WebDriver driver;

@Parameters({"browser"})
@Test
private void tc1(String name) {
	if(name.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(name.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}
}
