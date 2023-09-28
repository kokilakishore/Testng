package org.oplepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.LibGlobal;

public class Pojo1 extends LibGlobal{

	public  Pojo1() {
		PageFactory.initElements(driver,this);
		}
		 @FindBy(id="Search-In-Modal-Single")
		 private WebElement searchtext;
		 
		public WebElement getSearchtext() {
			return searchtext;
		}
		
		
}
