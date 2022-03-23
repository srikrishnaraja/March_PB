package com.pom_class_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="//img[@title='Printed Summer Dress']")
	private WebElement summer;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement submit;

	public Dresspage(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getSummer() {
		return summer;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	

}
