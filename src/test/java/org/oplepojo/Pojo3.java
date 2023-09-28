package org.oplepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3 extends Pojo2 {
	public Pojo3() {
		PageFactory.initElements(driver,this);
	}
		 @FindBy(xpath=("//form[@id='form-7634981519520-template--16086732144800__main']"))
		 private WebElement addtocart;
		 
		public WebElement getAddtocart() {
			return addtocart;
		}
		 
		
		}
		
