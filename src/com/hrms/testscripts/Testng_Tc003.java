package com.hrms.testscripts;

import com.hrms.lib.Testng_General;

public class Testng_Tc003 {
	public static void main(String args[]) throws Exception {
		//Test Steps
		Testng_General obj = new Testng_General();
		obj.openApplication();
		obj.login();
		obj.Enterframe();
		obj.addemp();
		Thread.sleep(3000);
		obj.BackBtn();
		Thread.sleep(3000);
		obj.Search_Dropdown();
		Thread.sleep(3000);
		obj.Search_for();
		Thread.sleep(3000);
		obj.Delete();
		obj.ExitFrame();
		obj.logout();
		obj.closeApplication();
	}
}
