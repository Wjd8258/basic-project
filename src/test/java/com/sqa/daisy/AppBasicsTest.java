/**
 * File Name: AppBasicsTest.java<br>
 * Jiadi, Wu<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: 2017Äê10ÔÂ7ÈÕ
 */
package com.sqa.daisy;

import org.testng.*;
import org.testng.annotations.*;

import com.sqa.daisy.helpers.*;

/**
 * AppBasicsTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Jiadi, Wu
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasicsTest {

	@Test()
	public void testRequestDouble() {
		double curWallet = AppBasics.requestDouble("How much money do you have on hand?");
		Assert.assertEquals(5.0, curWallet, .1);
	}

	@Test
	public void testRequestInt() {
		int num = AppBasics.requestInt("What should your int value be?");
		Assert.assertEquals(10, num);
	}

	@Test
	public void testRequestString() {
		String favColor = AppBasics.requestString("Can I get your favourite color?");
		Assert.assertEquals("blue", favColor);
	}
}
