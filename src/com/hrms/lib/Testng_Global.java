package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Testng_Global {
	public WebDriver driver;
	//To provide TestData & object/element for whole application
	//----------------TestData
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String fn = "Madhu";
	public String ln = "Paikara";
	//--------object/element
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String bnt_login = "Submit";
	public String link_logout = "Logout";
	public String txt_firstname = "txtEmpFirstName";
	public String txt_lastname = "txtEmpLastName";
	public String add_emp = "//input[@value='Add'][@type='button']";
	public String save_btn = "btnEdit";
	public String frameName = "rightMenu";
	public String BackBtn ="//input[@value='Back']";
	public String searchbydropdown_name = "loc_code";
	public String search_for_name = "loc_name";
	public String search_btn = "//input[@value='Search']";
	public String checkbox_name = "chkLocID[]";
	public String Delet_btn = "//input[@value='Delete']";

}
