package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;


public class Testng_General extends Testng_Global {
	//To provide all reusable fun: for whole Application
	public void openApplication() {
		System.setProperty("Webdriver.gecko.driver","E:\\Drivers\\FireFox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application Opened");
		Log.info("Application Opened");
	}
public void closeApplication() {
	driver.close();
	System.out.println("Application closed");
	Reporter.log("Application closed");
	Log.info("Application closed");
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(bnt_login)).click();
	System.out.println("Login Completed");
	Reporter.log("Login Completed");
	Log.info("Login Completed");
	
	}
public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	Reporter.log("Logout Completed");
	Log.info("Logout Completed");
}
public void addemp() {
	driver.findElement(By.xpath(add_emp)).click();
	driver.findElement(By.name(txt_firstname)).sendKeys(fn);
	driver.findElement(By.name(txt_lastname)).sendKeys(ln);
	driver.findElement(By.id(save_btn)).click();
	System.out.println("New emp added");
	Reporter.log("New emp added");
	Log.info("New emp added");
}
public void Enterframe()
{
	driver.switchTo().frame(frameName);
}
public void ExitFrame()
{
	driver.switchTo().defaultContent();
}
public void BackBtn() {
	driver.findElement(By.xpath(BackBtn)).click();
}
public void Search_Dropdown() {
	Select st = new Select(driver.findElement(By.name(searchbydropdown_name)));
	st.selectByVisibleText("Emp. First Name");
}
public void Search_for() {
 driver.findElement(By.name(search_for_name)).sendKeys(fn);
 driver.findElement(By.xpath(search_btn)).click();
 }
public void Delete() {
	driver.findElement(By.name(checkbox_name)).click();
	driver.findElement(By.xpath(Delet_btn)).click();
}
}
