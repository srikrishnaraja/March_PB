package com.pom_class_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement ptc;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement ptc1;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement address;
	
	@FindBy(id="cgv")
	private WebElement cgv;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement carrier;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement cheque;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement order;
	
	@FindBy(xpath="(//td[@class='history_price'])[2]")
	private WebElement history;

	public Checkoutpage(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getPtc() {
		return ptc;
	}

	public WebElement getPtc1() {
		return ptc1;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCgv() {
		return cgv;
	}

	public WebElement getCarrier() {
		return carrier;
	}

	public WebElement getCheque() {
		return cheque;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getOrder() {
		return order;
	}

	public WebElement getHistory() {
		return history;
	}
	
	
	
	
	

}
