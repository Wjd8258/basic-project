package com.sqa.daisy.core;

import org.apache.log4j.*;
import org.openqa.selenium.*;

import com.sqa.daisy.helpers.*;

public class Core {

	private static int count = 1;

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * @return the count
	 */
	private String baseUrl;

	protected WebDriver driver;

	private FirefoxTest curTest;

	private Logger log = Logger.getLogger(this.getClass());

	public Core(FirefoxTest test) {
		this.curTest = test;
		this.baseUrl = test.getBaseUrl();
		this.driver = test.getDriver();
	}

	public Core(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public Core(String baseUrl, WebDriver driver) {
		super();
		this.baseUrl = baseUrl;
		this.driver = driver;
	}

	/**
	 * @return the curTest
	 */
	public String getBaseUrl() {
		return this.baseUrl;
	}

	public FirefoxTest getCurTest() {
		return this.curTest;
	}

	/**
	 * @return
	 */
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return this.driver;
	}

	/**
	 * @return
	 */
	public Logger getLog() {
		// TODO Auto-generated method stub
		return this.log;
	}

	public boolean isElementPresent(String xpathString) {
		return AutoBasics.isElementPresent(getDriver(), By.xpath(xpathString), getLog());
	}

	public void takeScreenshot() {
		AutoBasics.takeScreenshot("screenshots/", "Craiglist Test", count, getDriver(), this.getLog());
		count++;
	}

	// Example of a non static implementation of the static helper method
	public void takeScreenshot(String name) {
		AutoBasics.takeScreenshot("screenshots/", name, count, getDriver(), this.getLog());
		count++;
	}

	protected void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	/**
	 * @param driver
	 *            the driver to set
	 */
	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
