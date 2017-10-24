package com.sqa.daisy.core;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.*;
import org.testng.annotations.*;

public class BasicTest extends Core {

	/**
	 * @param test
	 */
	public BasicTest(String baseURL) {
		super(baseURL);
		// TODO Auto-generated constructor stub
	}

	@Test(dataProvider = "dp")
	public void craigslistTest(String item, int minCount) {
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "QA Engineer", 2 }, new Object[] { "Java Developer", 18 }, };
	}

	/**
	 * @return
	 */
	@Override
	public String getBaseUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return
	 */
	@Override
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@BeforeClass(alwaysRun = true)
	public void setUpIE() throws Exception {
		// Sets up the webDriver to use Firefox
		// you can also setup crome driver by using sudo chmod +x cromedrivr to
		// give rights of excuting the cromedriver mac
		// System.setProperty("webdriver.chrome.driver",
		// "drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
		setDriver(new InternetExplorerDriver());
		// sets up default implicit wait to wait for 30 seconds
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Set up other window options such as full screen
		// get the driver instance,sets the baseUrl to amazon.com
		getDriver().get(this.getBaseUrl());
	}

	@AfterClass(enabled = true)
	public void tearDown() throws Exception {
		// close the webdriver and quits the browser;
		this.driver.quit();
	}
}
