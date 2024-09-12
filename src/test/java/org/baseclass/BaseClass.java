package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
	public static WebDriver browserLaunch(String bname) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public static String urlLaunch(String urlname) {
		driver.get(urlname);
		return urlname;
	
	}
	 public static void maximize() {
			driver.manage().window().maximize();
		}
	   
	   public static void implicitwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	   }
	  
	   public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	   }
	   public static void click(WebElement e) {
		e.click();
	   }
        public static void drpdown1(WebElement e, String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
		}
        public static void drpdown2(WebElement e, String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
	}
        public static void drpdown3(WebElement e, String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
	
}
        public static void drpdown4(WebElement e, String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
	
}
        public static void adultroom(WebElement e, String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
	
}
        public static void childroom(WebElement e, String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
	
}
        public static void creditcardtype(WebElement e, String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
	
}
        public static void month(WebElement e, String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
	
}
        public static void year(WebElement e, String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
   
}
        public static String getAttribute(WebElement e) {
			String attribute = e.getAttribute("value");
			return attribute; 
		}
        
        public static void quit() {
        	driver.quit();
        }
        }

