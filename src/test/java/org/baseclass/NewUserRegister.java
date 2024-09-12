package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserRegister extends BaseClass {
	
	public NewUserRegister() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="username")
	private WebElement Username	;		
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(name="location")
	private WebElement drpdown1;
	
	@FindBy(id="hotels")
	private WebElement drpdown2;
	
	@FindBy(id="room_type")
	private WebElement drpdown3;

	@FindBy(id="room_nos")
	private WebElement drpdown4;
	
	@FindBy(name="datepick_in")
	private WebElement datapickin;

	@FindBy(name="datepick_out")
	private WebElement datapickout;
	
	@FindBy(name="adult_room")
	private WebElement adultroom;
	
	@FindBy(name="child_room")
	private WebElement childroom;
	
	@FindBy(name="book_now")
	private WebElement Booknowbutton;
	
	@FindBy(name="Submit")
	private WebElement submit;
	
	@FindBy(name="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(name="continue")
	private WebElement continuebutton;
	
	@FindBy(name="first_name")
	private WebElement Firstname;
	
	@FindBy(name="last_name")
	private WebElement Lastname;
	
	@FindBy(name="address")
	private WebElement Address;
	
	@FindBy(name="cc_num")
	private WebElement creditcardnumber;
	
	@FindBy(id="cc_type")
	private WebElement creditcardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name="order_no")
	private WebElement orderno;
	
	
	public WebElement getBooknowbutton() {
		return Booknowbutton;
	}


	public WebElement getOrderno() {
		return orderno;
	}


	public WebElement getAdultroom() {
		return adultroom;
	}


	public WebElement getChildroom() {
		return childroom;
	}


	public WebElement getSubmit() {
		return submit;
	}
    
	public WebElement getbooknowbutton() {
		return Booknowbutton;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}


	public WebElement getContinuebutton() {
		return continuebutton;
	}


	public WebElement getFirstname() {
		return Firstname;
	}


	public WebElement getLastname() {
		return Lastname;
	}


	public WebElement getAddress() {
		return Address;
	}


	public WebElement getCreditcardnumber() {
		return creditcardnumber;
		
	}


	public WebElement getCreditcardType() {
		return creditcardType;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getCvv() {
		return cvv;
	}


	public WebElement getcontinuebutton() {
		return continuebutton;
	}
	
	
	public WebElement getradiobutton() {
		return radiobutton;
	}
	
	public WebElement getsubmit() {
		return submit;
	}
	
	public WebElement getchildroom() {
		return childroom;
	}

	public WebElement getadultroom() {
		return adultroom;
	}
	
	public WebElement getDatapickin() {
		return datapickin;
	}
	
	public WebElement getDatapickout() {
		return datapickout;
	}

	public WebElement getDrpdown4() {
		return drpdown4;
	}
	
	public WebElement getDrpdown2() {
		return drpdown2;
	}
	public WebElement getDrpdown3() {
		return drpdown3;
	}

	public WebElement getDrpdown1() {
		return drpdown1;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return login;
	}
	
}	