package org.pojologin;

import org.openqa.selenium.WebElement;
import org.utility.LibGlobal;

public class ExamplePojo extends LibGlobal{

	public static void main(String[] args) {
	openEdge();
	launchUrl("https://www.facebook.com/");
	maxWindow();
	PojoLogin l=new PojoLogin();
	
	WebElement uname=l.getTxtEmail();
	fillTextBox(uname,"kokila");
	
	
	WebElement pwd=l.getTxtPwd();
	fillTextBox(pwd,"kishore");
	
	WebElement btn=l.getBtnlogin();
	toClick(btn);
	 
}

	
}
