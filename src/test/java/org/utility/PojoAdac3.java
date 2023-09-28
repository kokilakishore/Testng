package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PojoAdac3 extends PojoAdac2{
	public PojoAdac3() {
		 PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="//input[@id='radiobutton_0']")
		private WebElement radio;
		
		@FindBy(xpath="//input[@id='continue']")
		private WebElement contin;
		
		@FindBy(xpath="//input[@id='first_name']")
		private WebElement firstname;
		
		@FindBy(xpath="//input[@id='last_name']")
		private WebElement lastname;	
		
		@FindBy(xpath="//textarea[@id='address']")
		private WebElement address;	
		
		@FindBy(xpath="//input[@id='cc_num']")
		private WebElement cardnum;	
		
		@FindBy(xpath="//select[@id='cc_type']")
		private WebElement cardtype ;	
		
		@FindBy(xpath="//select[@id='cc_exp_month']")
		private WebElement expmonth;	
		
		@FindBy(xpath="//select[@id='cc_exp_year']")
		private WebElement expyear;	
		
		@FindBy(xpath="//input[@id='cc_cvv']")
		private WebElement cvv;
		
		@FindBy(xpath="//input[@id='book_now']")
		private WebElement book;
		
		@FindBy(id="order_no")
		private WebElement orderno;

		public WebElement getRadio() {
			return radio;
		}

		public WebElement getContin() {
			return contin;
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCardnum() {
			return cardnum;
		}

		public WebElement getCardtype() {
			return cardtype;
		}

		public WebElement getExpmonth() {
			return expmonth;
		}

		public WebElement getExpyear() {
			return expyear;
		}

		public WebElement getCvv() {
			return cvv;
		}

		public WebElement getBook() {
			return book;
		}

		public WebElement getOrderno() {
			return orderno;
		}
		
		
		
		
		
		
	}

	

