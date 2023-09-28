package org.utility;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

public static WebDriver driver;
public static Alert a;
public static Actions ac;
public static Robot r;
public static Select s;


public static void openChrome() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
public static void openEdge() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
}
public static void closeBrowser() {
	driver.close();
}
public static void printTitle() {
	String titlename=driver.getTitle();
	System.out.println(titlename);
}
public static void printUrl() {
	String url=driver.getCurrentUrl();
	System.out.println(url);
}
public static void launchUrl(String url) {
	driver.get(url);
}
public static void toReload() {
	driver.navigate().refresh();
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
//get Text method
public static void getText(WebElement val) {
	String txt=val.getText();
	System.out.println(txt);
	}
//get Attribute method
public static void getAttribute(WebElement val) {
	String attr=val.getAttribute("value");
	System.out.println(attr);
}
//alert methods
public static void acceptAlert() {
	a=driver.switchTo().alert();
	a.accept();
}
public static void cancelAlert() {
	a=driver.switchTo().alert();
	a.dismiss();
}
//Actions class methods
public static void dragDrop(WebElement e1,WebElement e2) {
	ac=new Actions(driver);
	ac.dragAndDrop(e1, e2).perform();
}
public static void mouseHover(WebElement ele) {
	ac=new Actions(driver);
	ac.moveToElement(ele).perform();
	}
public static void doubleClick(WebElement ele) {
	ac=new Actions(driver);
	ac.doubleClick(ele).perform();
	}
public static void contextClick() {
	ac=new Actions(driver);
	ac.contextClick().perform();
}
public static void keyUp(String val) {
	ac=new Actions(driver);
	ac.keyUp(val);
}
//Robot Class
public static void keyDown(String val) {
	ac=new Actions(driver);
	ac.keyDown(val);
}
public static void copyUsingKeyboard() throws AWTException{
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
}
public static void pasteUsingKeyboard() throws AWTException{
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
}
public static void enterUsingKeyboard() throws AWTException{
	r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
public static void tabUsingKeyboard() throws AWTException{
	r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
}
//snapshot method
public static void takesnap(String picName)throws IOException {
	TakesScreenshot tk=(TakesScreenshot) driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\ACER\\eclipse-workspace\\Maven\\Screenshots\\"+picName+".png");
	FileUtils.copyFile(src,des);
}
//JavaScript method
public static void fillUsingJs(WebElement element,String input) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','"+input+"')",element);
}
//get All links- findElements methods
public static void linkCount() {
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	System.out.println("No of links:"+ allLinks.size());
	}
public static void tableCount() {
	List<WebElement> allTable=driver.findElements(By.tagName("table"));
	System.out.println("No of tables:"+allTable.size());
}
//DropDown methods
public static void selectUsingText(WebElement ele,String value) {
	s = new Select(ele);
	s.selectByVisibleText(value);
}
public static void selectUsingIndex(WebElement element,int indexNo) {
	s = new Select(element);
	s.selectByIndex(indexNo);
}
public static void printAllOptions(WebElement element) {
	s=new Select(element);
	List<WebElement> allOptions=s.getOptions();
	for(WebElement eachOption:allOptions) {
		System.out.println(eachOption.getText());
		}
	}
// Navigate methods
public static void Url(String val) {
		driver.navigate().to(val);
}
public static void forward() {
	driver.navigate().forward();
}
public static void back() {
	driver.navigate().back();
}
public static void frame(int val) {
	driver.switchTo().frame(val);
}
public static void parentframe () {
	driver.switchTo().parentFrame();
}
public static void defaultframe () {
	driver.switchTo().defaultContent();
}
//WindowHandle method
public static void windowHandle() {
	String parentId=driver.getWindowHandle();
	System.out.println(parentId);
}
//WindowHandles methods
public static void windowHandles() {
	Set<String> allWindowId=driver.getWindowHandles();
	System.out.println(allWindowId);
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

public static void DateandTime(int val) {
	Date d= new Date(val);
	System.out.println(d);
	
}

}




