/*************************************************************************************/
/* This is a program that prompts the user to enter the year and the first three     */
/* letters of a month name (with the first letter in uppercase) and displays         */
/* the number of days in the month.                                                  */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 3, Q4                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 26 November 2020                                                   */
/*************************************************************************************/
package assignment3;
import java.util.Scanner;
public class DaysOfAMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//to prompts the users to enter year and month
		System.out.print("Enter a year : ");
		int year = input.nextInt();
		System.out.print("Enter a month : ");
		String month = input.next();
		
		//to check the leap year
		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		//to display the number of days in a month
			if (month.equals("Jan")||month.equals("Mar")||month.equals("May")||month.equals("Jul")||month.equals("Aug")||month.equals("Oct")||month.equals("Dec"))
				System.out.print(month + " " + year + " has 31 days");
				
			else if (month.equals("Apr")||month.equals("Jun")||month.equals("Sep")||month.equals("Nov"))
				System.out.print(month + " " + year + " has 30 days");
			
			else if (month.equals("Feb"))
				System.out.print(month + " " + year + " has " + ((leapYear)? 28:29) + " days");
			
			else
				System.out.print(month + " is not a correct month name");
			
			input.close();
			
	}

}
