package com.pom_class_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel_page {
	
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement continue1;

	public Selecthotel_page(WebDriver driver2) {
	  
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinue1() {
		return continue1;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
