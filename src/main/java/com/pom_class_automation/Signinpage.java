package com.pom_class_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
	
	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement icon;

	public Signinpage(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getIcon() {
		return icon;
	}
	
	

}
