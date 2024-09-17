package org.baseclass;

import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass {
	
	public static void main(String[] args) {
		browserLaunch("Chrome");
		
		urlLaunch("https://adactinhotelapp.com/");
		
		maximize();
		
		implicitwait(10);
		
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
		System.out.println("B");
		
		
	}
	

}
