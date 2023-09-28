package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAdac2 extends LoginPojo{
	
	public PojoAdac2() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//select[@id='location']")
	private WebElement loc;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement roomnum;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childroom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement submit;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnum() {
		return roomnum;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
		
}
