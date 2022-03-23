package com.pom_helper_automation;

import org.openqa.selenium.WebDriver;

import com.pom_class_automation.Checkoutpage;
import com.pom_class_automation.Dresspage;
import com.pom_class_automation.Homepage;
import com.pom_class_automation.Signinpage;

public class Page_object_manager_auto {
	
	public WebDriver driver;
	
	private Homepage hp;
	
	public Page_object_manager_auto(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public Signinpage get_Instance_Sp() {
		
		if (sp==null) {
			
			 sp = new Signinpage(driver);
		}
		
		 return sp;
		
	}

	public Dresspage get_Instance_Dp() {
		
		if (dp==null) {
			
			 dp = new Dresspage(driver);
			
		}
		
		
		return dp;
	}

	public Checkoutpage get_Instance_Cp() {
		
		if (cp==null) {
			
			 cp = new Checkoutpage(driver);
		}
		
		return cp;
	}

	public Homepage get_Instance_Hp() {
		
		if (hp==null) {
			
			hp = new Homepage(driver);
		} 
		
		return hp;
	}

	private Signinpage sp;
	
	private Dresspage dp;
	
	private Checkoutpage cp;
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
