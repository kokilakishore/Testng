package org.oplepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pojo2 extends Pojo1{
	public Pojo2() {
			PageFactory.initElements(driver,this);
		}
			 @FindBy(xpath=("(//button[@aria-label='Search'])[1]"))
			 private WebElement cooker;
			 
			public WebElement getCooker() {
				return cooker;
			}
			
				
	}

