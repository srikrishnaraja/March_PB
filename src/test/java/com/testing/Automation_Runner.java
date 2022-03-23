package com.testing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base_class.Base_Class;
import com.pom_class_adactin.Home_page;
import com.pom_class_automation.Checkoutpage;
import com.pom_class_automation.Dresspage;
import com.pom_class_automation.Homepage;
import com.pom_class_automation.Signinpage;
import com.pom_helper_automation.Page_object_manager_auto;

public class Automation_Runner extends Base_Class {

	public static WebDriver driver = browser_configuration("chrome");

	public static Page_object_manager_auto pom = new Page_object_manager_auto(driver);

	public static void main(String[] args) throws IOException {

		getUrl("http://automationpractice.com/index.php");

		clickOnElement(pom.get_Instance_Hp().getLogin());

		implicitWait(50, TimeUnit.SECONDS);

		String useremail = particular_data(
				"C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\Automation Practice.Testcases.xlsx",
				2, 5);

		inputValueElement(pom.get_Instance_Sp().getEmail(), useremail);

		inputValueElement(pom.get_Instance_Sp().getPass(), particular_data(
				"C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\Automation Practice.Testcases.xlsx",
			3, 5));

		clickOnElement(pom.get_Instance_Sp().getIcon());

		clickOnElement(pom.get_Instance_Dp().getDress());

		implicitWait(50, TimeUnit.SECONDS);

		clickOnElement(pom.get_Instance_Dp().getSummer());

		implicitWait(50, TimeUnit.SECONDS);

		clickOnElement(pom.get_Instance_Dp().getSubmit());

		implicitWait(50, TimeUnit.SECONDS);

		clickOnElement(pom.get_Instance_Cp().getPtc());

		clickOnElement(pom.get_Instance_Cp().getPtc1());

		clickOnElement(pom.get_Instance_Cp().getAddress());

		clickOnElement(pom.get_Instance_Cp().getCgv());

		clickOnElement(pom.get_Instance_Cp().getCarrier());

		clickOnElement(pom.get_Instance_Cp().getCheque());

		clickOnElement(pom.get_Instance_Cp().getSubmit());

		implicitWait(50, TimeUnit.SECONDS);

		takesScreenshot("C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\screenshot\\dre.png");

		clickOnElement(pom.get_Instance_Cp().getOrder());

		scrollUpandDown(pom.get_Instance_Cp().getHistory());

		takesScreenshot("C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\screenshot\\dre1.png");

		close();

	}
}
