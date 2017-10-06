/**
 * File Name: AppBasics.java<br>
 * Jiadi, Wu<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: 2017Äê10ÔÂ2ÈÕ
 */
package com.sqa.daisy.helpers;

import java.util.*;

import com.sqa.daisy.helpers.exceptions.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Jiadi, Wu
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method which farewells the user at the end of an application to
	 * say thank you and wish them well
	 *
	 * @param name
	 *            Name of the user
	 * @param appName
	 *            Name of the application
	 */
	public static void farewellUser(String name, String appName) {
		System.out.println("Thank you " + name + ", for using the " + appName + " Application.\nHave a great day!");
	}

	/**
	 * Helper method which greets the user and welcomes them to the Application.
	 * This method then takes their name and returns it to the calling method.
	 *
	 * @param appName
	 * @return name
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to my " + appName + " Application");
		System.out.print("Could I get your name please?");
		return scanner.nextLine();
	}

	public static double requestDouble(String question, double min, double max) {
		double resultNum = 0;
		String input = "";
		boolean valid = false;
		while (!valid) {
			try {
				// ask question
				System.out.print(question + " ");
				// get input string from user
				input = scanner.nextLine();
				// parse input string into int type
				resultNum = Double.parseDouble(input);
				// evaluate valid entry
				// evaluate valid range
				if (resultNum > max | resultNum < min) {
					throw new RequestNumberNotWithinRangeException();
				}
				valid = true;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				/*
				 * System.out.
				 * println("You have not entered a valid formatted number[" +
				 * input + "]"); } catch (RequestNumberUnderMinException e) {
				 * System.out.
				 * println("You have not entered a valid number higher than minimum ("
				 * + min ") - [" + input + "]"); } catch
				 * (RequestNumberOverMaxException e) { System.out.
				 * println("You have not entered a valid number lower than maxium ("
				 * + max ") - [" + input + "]");
				 */
			} catch (RequestNumberNotWithinRangeException e) {
				System.out.println("You have not entered a valid formattd within range(" + min + " to " + max + ")-["
						+ input + "]");
			}
		}
		return resultNum;
	}

	/**
	 * @param string
	 * @return
	 */
	public static int requestInt(String question, int min, int max) {
		int resultNum = 0;
		String input = "";
		boolean valid = false;
		while (!valid) {
			try {
				// ask question
				System.out.print(question + " ");
				// get input string from user
				input = scanner.nextLine();
				// parse input string into int type
				resultNum = Integer.parseInt(input);
				// evaluate valid entry
				// evaluate valid range
				if (resultNum > max | resultNum < min) {
					throw new RequestNumberNotWithinRangeException();
				}
				valid = true;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				/*
				 * System.out.
				 * println("You have not entered a valid formatted number[" +
				 * input + "]"); } catch (RequestNumberUnderMinException e) {
				 * System.out.
				 * println("You have not entered a valid number higher than minimum ("
				 * + min ") - [" + input + "]"); } catch
				 * (RequestNumberOverMaxException e) { System.out.
				 * println("You have not entered a valid number lower than maxium ("
				 * + max ") - [" + input + "]");
				 */
			} catch (RequestNumberNotWithinRangeException e) {
				System.out.println("You have not entered a valid formattd within range(" + min + " to " + max + ")-["
						+ input + "]");
			}
		}
		return resultNum;
	}
}
