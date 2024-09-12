
package org.baseclass;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RunClass extends BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("Chrome");
		
		}
	
	@Before
	public void before() {
      urlLaunch("https://adactinhotelapp.com/");
		
		maximize();
		
		implicitwait(10);

	}
	 @After
	   public void after() {
		   Date d =new Date();
		   System.out.println("After test...."+d);
	   }
	
   @AfterClass
   public static void afterClass() {
	   quit();
}
   @Test
   public void test1()
   {
	   NewUserRegister r = new NewUserRegister();
		
		sendKeys(r.getUsername(), "Priyankanewa");
		
		sendKeys(r.getPassword(),"Attur1290!");
		
		click(r.getLogin());
		
		drpdown1(r.getDrpdown1(),"New York");
		
		drpdown2(r.getDrpdown2(),"Hotel Sunshine");
		
		drpdown3(r.getDrpdown3(),"Deluxe");
		
		drpdown4(r.getDrpdown4(),"3 - Three");
		
		sendKeys(r.getDatapickin(),"09/09/2024");
		
		sendKeys(r.getDatapickin(),"10/09/2024");
		
		adultroom(r.getadultroom(),"3 - Three");
		
		childroom(r.getchildroom(),"1 - One");
		
		click(r.getsubmit());
		
		
		click(r.getradiobutton());
		
		click(r.getcontinuebutton());
   }
   @Test
   public void test2() {
	   NewUserRegister r = new NewUserRegister();
		
		sendKeys(r.getUsername(), "Priyankanewa");
		
		sendKeys(r.getPassword(),"Attur1290!");
		
		click(r.getLogin());
		
		drpdown1(r.getDrpdown1(),"New York");
		
		drpdown2(r.getDrpdown2(),"Hotel Sunshine");
		
		drpdown3(r.getDrpdown3(),"Deluxe");
		
		drpdown4(r.getDrpdown4(),"3 - Three");
		
		sendKeys(r.getDatapickin(),"09/09/2024");
		
		sendKeys(r.getDatapickin(),"10/09/2024");
		
		adultroom(r.getadultroom(),"3 - Three");
		
		childroom(r.getchildroom(),"1 - One");
		
		click(r.getsubmit());
   }
   @Test
   public void test3() {
	   NewUserRegister r = new NewUserRegister();
	
	sendKeys(r.getUsername(), "Priyankanewa");
	
	sendKeys(r.getPassword(),"Attur1290!");
	
	click(r.getLogin());
	
	drpdown1(r.getDrpdown1(),"New York");
	
	drpdown2(r.getDrpdown2(),"Hotel Sunshine");
	
	drpdown3(r.getDrpdown3(),"Deluxe");
	
	drpdown4(r.getDrpdown4(),"3 - Three");
	
	sendKeys(r.getDatapickin(),"09/09/2024");
	
	sendKeys(r.getDatapickin(),"10/09/2024");
	
	adultroom(r.getadultroom(),"3 - Three");
	
	childroom(r.getchildroom(),"1 - One");
	
	click(r.getsubmit());
	
	
	click(r.getradiobutton());
	
	click(r.getcontinuebutton());
	
	sendKeys(r.getFirstname(),"Priyanka");
	
	sendKeys(r.getLastname(),"Saravanan");
	
	sendKeys(r.getAddress(),"Chromepet");

	sendKeys(r.getCreditcardnumber(),"1234 5678 9012 3456");
	
	creditcardtype(r.getCreditcardType(),"American Express");
	
	month(r.getMonth(), "April");
	
	year(r.getYear(),"2027");
	
	sendKeys(r.getCvv(),"801");
	
	click(r.getbooknowbutton());
	
	String attribute = getAttribute(r.getOrderno());
	System.out.println(attribute);
   }   

  
   }


