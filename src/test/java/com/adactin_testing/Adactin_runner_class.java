package com.adactin_testing;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base_class.Base_Class;
import com.pom_class_adactin.Bookahotel_page;
import com.pom_class_adactin.Home_page;
import com.pom_class_adactin.Searchhotel_page;
import com.pom_class_adactin.Selecthotel_page;
import com.pom_helper_adactin.Page_Object_Manager_adactin;

public class Adactin_runner_class extends Base_Class {

	public static WebDriver driver = browser_configuration("chrome");

	public static Page_Object_Manager_adactin pom = new Page_Object_Manager_adactin(driver);

	public static Logger log = Logger.getLogger(Adactin_runner_class.class);

	// public static Home_page hp = new Home_page(driver);

	// public static Searchhotel_page sh = new Searchhotel_page(driver);

	// public static Selecthotel_page shp = new Selecthotel_page(driver);

	// public static Bookahotel_page bh = new Bookahotel_page(driver);

	public static void main(String[] args) throws IOException {

		PropertyConfigurator.configure("log4j.properties");

		log.info("url going to launch");

		getUrl("https://adactinhotelapp.com/");

		log.info("url launch");

		inputValueElement(pom.get_Instance_Hp().getUsername(), particular_data(
				"C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\adactin.testcases.xlsx",
				1, 5));
		
		inputValueElement(pom.get_Instance_Hp().getPassword(), particular_data(
				"C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\adactin.testcases.xlsx", 2, 5));

		clickOnElement(pom.get_Instance_Hp().getLogin());

		dropDown(pom.get_Instance_Sh().getLocation(), "by value", "London");

		dropDown(pom.get_Instance_Sh().getHotels(), "by value", "Hotel Sunshine");

		dropDown(pom.get_Instance_Sh().getRoomtype(), "by value", "Super Deluxe");

		dropDown(pom.get_Instance_Sh().getRoomno(), "by value", "1");

		clearall(pom.get_Instance_Sh().getDatepickin());

		inputValueElement(pom.get_Instance_Sh().getDatepickin(), "20/02/2022");

		clearall(pom.get_Instance_Sh().getDatepickout());

		inputValueElement(pom.get_Instance_Sh().getDatepickout(), "22/02/2022");

		dropDown(pom.get_Instance_Sh().getAdultroom(), "by value", "1");

		clickOnElement(pom.get_Instance_Sh().getSubmit());

		clickOnElement(pom.get_InstanceShp().getRadio());

		clickOnElement(pom.get_InstanceShp().getContinue1());

		inputValueElement(pom.get_Instance_Bh().getFirstname(), particular_data(
				"C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\adactin.testcases.xlsx", 14, 5));

		inputValueElement(pom.get_Instance_Bh().getLastname(), particular_data(
				"C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\adactin.testcases.xlsx", 15, 5));

		inputValueElement(pom.get_Instance_Bh().getAddress(), particular_data(
				"C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\adactin.testcases.xlsx", 16, 5));

		inputValueElement(pom.get_Instance_Bh().getCcnum(), particular_data(
				"C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\adactin.testcases.xlsx", 17, 5));

		dropDown(pom.get_Instance_Bh().getCctype(), "by value", "VISA");

		dropDown(pom.get_Instance_Bh().getCcexpm(), "by value", "6");

		dropDown(pom.get_Instance_Bh().getCcexpy(), "by value", "2022");

		inputValueElement(pom.get_Instance_Bh().getCcccvv(), particular_data(
				"C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\adactin.testcases.xlsx", 20, 5));

		clickOnElement(pom.get_Instance_Bh().getBooknow());
		
		log.info("hotel booked");

	}

}
