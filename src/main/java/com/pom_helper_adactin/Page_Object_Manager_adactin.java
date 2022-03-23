package com.pom_helper_adactin;

import org.openqa.selenium.WebDriver;

import com.pom_class_adactin.Bookahotel_page;
import com.pom_class_adactin.Home_page;
import com.pom_class_adactin.Searchhotel_page;
import com.pom_class_adactin.Selecthotel_page;

public class Page_Object_Manager_adactin {
	
	public WebDriver driver;
	
	private Home_page hp ;
	
	private Searchhotel_page sh;
	
	private Selecthotel_page shp;
	
	private Bookahotel_page bh;

	public Page_Object_Manager_adactin(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public Home_page get_Instance_Hp() {
		
		if (hp==null) {
			
			hp = new Home_page(driver);
		}
		
		return hp;
	}

	public Searchhotel_page get_Instance_Sh() {
		
		if (sh==null) {
			sh = new Searchhotel_page(driver);
		}
		return sh;
	}

	public Selecthotel_page get_InstanceShp() {
		
		if (shp==null) {
			shp = new Selecthotel_page(driver);
		}
		return shp;
	}

	public Bookahotel_page get_Instance_Bh() {
		
		if (bh==null) {
			bh = new Bookahotel_page(driver);
		}
		return bh;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
