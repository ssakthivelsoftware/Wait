package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXWait {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "https://www.facebook.com/");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	}

}
