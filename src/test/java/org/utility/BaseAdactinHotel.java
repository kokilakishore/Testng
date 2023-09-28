package org.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseAdactinHotel{

	public static WebDriver driver;
	public static Select s;
	
	public static void openChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	public static void openEdge() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	public static void openFirefox() {
		WebDriverManager.firefoxdriver().setup();
		}
	public static void launchUrl(String Pageurl) {
		driver.get(Pageurl);
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void hold(int time) throws InterruptedException      {
		 Thread.sleep(time);
	}
	public static void fillTextBox(WebElement element,String input) {
		element.sendKeys(input);
	}
	public static void toClick(WebElement element) {
		element.click();
	}
	public static void selectByVisibleText(WebElement ele , String input) {

		 s = new Select(ele);
		 s.selectByVisibleText(input);
		}
	public static void selectByIndex(WebElement ele , int input) {

		s = new Select(ele);
		s.selectByIndex(input);
	}
	
	public static void selectByValue(WebElement ele , String input) {
	
		s = new Select(ele);
        s.selectByValue(input);	
	}
	public static void toImplicitWait(int input) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(input));
	}
	
	public static void printText(WebElement element) {

		String text = element.getText();
		System.out.println(text);
	}

}
