package com.codpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codbase.CodBase;

public class CodHomepagefactory extends CodBase {
	
	public  CodHomepagefactory() {
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="(//a[@class='user-header'])[1]")
private WebElement login;

public WebElement getLogin() {
	return login;
}


}

