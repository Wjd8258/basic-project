package com.sqa.daisy.core;

import org.testng.annotations.*;

public class CraiglistTest extends FirefoxTest {

	public CraiglistTest() {
		super("http://sfbay.craiglist.com");
	}

	@Test(dataProvider = "dp")
	public void craglistTest(String item, int minCount) {
		System.out.println("Test " + item);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "QA Engineer", 2 }, new Object[] { "Java Developer", 10 }, };
	}
}