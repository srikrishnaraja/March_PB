package com.pom_class_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver;
	
	
	public Homepage(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath="//a[@class='login']")
	private WebElement login;
	
	
	
	
	
	
	
	
	

}
