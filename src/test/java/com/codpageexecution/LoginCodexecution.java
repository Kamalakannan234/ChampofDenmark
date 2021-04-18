package com.codpageexecution;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codbase.CodBase;
import com.codpagefactory.CodHomepagefactory;

public class LoginCodexecution extends CodBase {

	
	
	@Test
	public void excution() {
	CodBase.launchBrowser("chrome");
	CodBase.getUrl("https://www.champsofdenmark.com/");
	String actual=driver.getCurrentUrl();
	String testedUrl="https://www.champsofdenmark.com/";
	Assert.assertEquals(actual, testedUrl, "Not good");
	CodHomepagefactory lc = new CodHomepagefactory();
	lc.getLogin().click();
	}
}
