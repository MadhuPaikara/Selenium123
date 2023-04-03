package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Testng_General;

public class Testng_Tc002 {
	@Test
	public void tc002(){
		DOMConfigurator.configure("log4j.xml");
		Testng_General obj = new Testng_General();
		obj.openApplication();
		obj.login();
		obj.Enterframe();
		obj.addemp();
		obj.ExitFrame();
		obj.logout();
		obj.closeApplication();
	}
	
}
