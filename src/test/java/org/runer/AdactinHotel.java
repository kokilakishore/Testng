package org.runer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.BaseAdactinHotel;

public class AdactinHotel extends BaseAdactinHotel{

	public static void main(String[] args) throws InterruptedException {
	
		openEdge();
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();
		WebElement uname=driver.findElement(By.id("username"));
		fillTextBox(uname,"vinokavi");
		WebElement passw=driver.findElement(By.id("password"));
		fillTextBox(passw,"1234vinu");
		WebElement btnLogin=driver.findElement(By.name("login"));
		toClick(btnLogin);
		
		WebElement allLocations = driver.findElement(By.xpath("//select[@id='location']"));
		selectByVisibleText(allLocations, "London");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		selectByVisibleText(hotel, "Hotel Creek");

		WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		selectByIndex(roomType, 3);
		
		WebElement roomNum = driver.findElement(By.xpath("//select[@id='room_nos']"));
		selectByValue(roomNum, "3");

		//WebElement dateIn = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		
		WebElement adultRm = driver.findElement(By.xpath("//select[@id='adult_room']"));
		selectByValue(adultRm, "3");
		
		WebElement childCount = driver.findElement(By.xpath("//select[@id='child_room']"));
		selectByIndex(childCount, 1);

		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='Submit']"));
        toClick(btnSearch);

        WebElement btnClick = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		toClick(btnClick);
		
		WebElement clickContinue = driver.findElement(By.xpath("//input[@id='continue']"));
		toClick(clickContinue);
		
		WebElement fName = driver.findElement(By.xpath("//input[@id='first_name']"));
		fillTextBox(fName,"kokila"); 

		WebElement lName = driver.findElement(By.xpath("//input[@id='last_name']"));
		fillTextBox(lName,"kishore");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		fillTextBox(address,"chennai");

		WebElement cardNo = driver.findElement(By.xpath("//input[@id='cc_num']"));
		fillTextBox(cardNo,"1234573456789259");
		
		WebElement cardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		selectByValue(cardType, "MAST");
		
		WebElement expMthn = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		selectByValue(expMthn, "3");
		
		WebElement expYr = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		selectByValue(expYr, "2015");
		
		WebElement ccvNo = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		fillTextBox(ccvNo, "134");
		
		WebElement btnBookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
		toClick(btnBookNow);
		
		WebElement orderNum = driver.findElement(By.id("order_no"));
		printText(orderNum);
	
	}
}
	