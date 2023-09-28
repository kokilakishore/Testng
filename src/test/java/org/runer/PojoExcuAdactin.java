package org.runer;

import org.openqa.selenium.WebElement;
import org.utility.LibGlobal;
import org.utility.LoginPojo;
import org.utility.PojoAdac3;

public class PojoExcuAdactin extends PojoAdac3{
	public static void main(String[]args) throws InterruptedException {
		openEdge();
		launchUrl("https://adactinhotelapp.com/");
		maxWindow();
		PojoAdac3 p=new PojoAdac3();
		WebElement uname=p.getTxt();
		fillTextBox(uname,"vinokavi");
		
		WebElement passwrd=p.getTxtPwd();
		fillTextBox(passwrd,"1234vinu");
		
		WebElement btn=p.getLogin();
		toClick(btn);
		
		WebElement loc=p.getLoc();
		selectByVisibleText(loc,"London");
		
		WebElement hotel=p.getHotel();
		selectByVisibleText(hotel,"Hotel Creek");
		
		WebElement roomType=p.getRoomtype();
		selectByVisibleText(roomType,"Double");
		
		WebElement roomNum=p.getRoomnum();
		selectByValue(roomNum,"3");
		
		WebElement adultroom=p.getAdultroom();
		selectByValue(adultroom,"2");
		
		WebElement childroomcount =p.getChildroom();
		selectByValue(childroomcount,"2");
		
		WebElement btnsearch =p.getSubmit();
		toClick(btnsearch);
		
		WebElement btnclick=p.getRadio();
		toClick(btnclick);
		
		WebElement clkcontinue=p.getContin();
		toClick(clkcontinue);

		WebElement fname=p.getFirstname();
		fillTextBox(fname,"kokila");
		
		WebElement lname=p.getLastname();
		fillTextBox(lname,"kishore");
		
		WebElement address =p.getAddress();
		fillTextBox(address,"chennai");
		
		WebElement cardno =p.getCardnum();
		fillTextBox(cardno,"1234567894567894");
		
		WebElement cardtype =p.getCardtype();
		selectByVisibleText(cardtype,"VISA");
				
		WebElement exprmonth =p.getExpmonth();
		fillTextBox(exprmonth,"July");
				
		WebElement expryear =p.getExpyear();
		fillTextBox(expryear,"2016");
				
		WebElement ccvno =p.getCvv();
		fillTextBox(ccvno,"134");
		
		WebElement btnBookNow =p.getBook();
		toClick(btnBookNow);
		
		WebElement orderno =p.getOrderno();
		printText(orderno);
	}

}
