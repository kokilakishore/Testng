package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends LibGlobal{

	public LoginPojo() {
		
		PageFactory.initElements(driver,this);
		}
	
		@FindBy(id="username")
		private WebElement txt;
		 
		@FindBy(id="password")
		private WebElement txtPwd;
		
		@FindBy(name="login")
		private WebElement login;

		public WebElement getTxt() {
			return txt;
		}

		public WebElement getTxtPwd() {
			return txtPwd;
		}

		public WebElement getLogin() {
			return login;
		}
		
		
}
		
		
