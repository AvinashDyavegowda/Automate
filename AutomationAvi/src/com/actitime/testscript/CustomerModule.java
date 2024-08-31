package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass{

	@Test
	public void createCustomer() {
	Assert.fail(); Reporter.log("createCustomer", true);
	}

	@Test
	public void deleteCustomer() {
	Reporter.log("deleteCustomer", true);
	}

	@Test
	public void modifyCustomer() {
	// Assert.fail();
	Reporter.log("modifyCustomer", true);

	}

}
