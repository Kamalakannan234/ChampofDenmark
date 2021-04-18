package com.codbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CodBase {
	public static WebDriver driver= null;
	
	public static void launchBrowser(String browser) {
		switch(browser) {
		case"chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\New folder\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case"Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\New folder\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
			default:
				System.out.println("please give available browser:"+browser);
		}
	}
	public static void getUrl(String Url) {
		driver.get(Url);
	}
	
}
