package org.pojologin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.LibGlobal;

public class PojoLogin extends LibGlobal {
//Non-parameterized constructor
	public PojoLogin() {
		PageFactory.initElements(driver,this);	
	}
	//2.private WebElements
	@FindBy(id="email")
	private WebElement txtEmail;
	@FindBy(id="pass")
	private WebElement txtPwd;
	@FindBy(name="login")
	private WebElement btnlogin;
	//3.Getters
	//RightClick ---source----generate getters&setters-----only getters
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtPwd() {
		return txtPwd;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
