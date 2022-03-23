package com.pom_class_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel_page {
	
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath ="//select[@name='room_nos']")
	private WebElement roomno;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement datepickin;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement datepickout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultroom;
	
	@FindBy(id="Submit")
	private WebElement submit;

	public Searchhotel_page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
