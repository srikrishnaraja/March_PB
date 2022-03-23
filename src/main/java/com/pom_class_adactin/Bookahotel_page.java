package com.pom_class_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookahotel_page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath= "//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccnum;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement ccexpm;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement ccexpy;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement ccccvv;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;

	public Bookahotel_page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpm() {
		return ccexpm;
	}

	public WebElement getCcexpy() {
		return ccexpy;
	}

	public WebElement getCcccvv() {
		return ccccvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	

}
