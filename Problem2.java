/*************************************************************************************/
/* This is a program that check whether the password meet all requirement            */
/* to be a valid password                                                            */
/* (at least 10 character, has mixed character, at least 3 digit)                    */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 6, Q2                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 30 December 2020                                                   */
/*************************************************************************************/
package assignment6;
import java.util.*; 
public class Problem2 {
	//method to check input has at least 10 character
	public static boolean atLeast10Char(String pass) {
		//to declare and initialized variables
		int len = pass.length(); 
		int min = 10;
		boolean atLeast10Char = false;
		//to check if the character has at least 10 character
		if(len >= min)
			atLeast10Char = true;
		
		return atLeast10Char;
	}
	//method to check input has mixed character
	public static boolean letterDigit(String pass) {
		//to declare and initialized variables
		int len = pass.length();
		int i = 0;
		String specialChar = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		boolean isDigit = false;
		boolean isLetter = false;
		boolean specChar = false;
		boolean letterDigit = false;
		//loop to check every character whether it is digit, letter and special character
		while(i < len) {
			if(Character.isDigit(pass.charAt(i)))
				isDigit = true;
			else if(Character.isLetter(pass.charAt(i)))
				isLetter = true;
			else if(specialChar.contains(Character.toString(pass.charAt(i))))
				specChar = true;
			i++;
		}
		//to check if input has mixed character without special character
		if(isDigit && isLetter && !specChar)
			letterDigit = true;
		
		return letterDigit;		
	}
	//method to check input has at least 3 digits
	public static boolean atLeastThreeDigit(String pass) {
		//to declare and initialized variables
		int len = pass.length();
		int count = 0;
		int min = 3;
		boolean atLeastThreeDigit = false;
		//loop to count number of digit in the input
		for(int i = 0; i < len; i++) {
			if(Character.isDigit(pass.charAt(i)))
				count++;
		}
		//to check if input has at least 3 digit
		if(count >= min)
			atLeastThreeDigit = true; 
		
		return atLeastThreeDigit;
	}
	//main method to check input meet all the requirement
	public static void main(String[] args) {
		//to create a scanner
		Scanner input = new Scanner(System.in);
		//to prompt users to enter a password
		System.out.print("Enter password : " );
		String pass = input.next();
		//to declare and call the other method
		boolean i = atLeast10Char(pass);
		boolean j = letterDigit(pass);
		boolean k = atLeastThreeDigit(pass);
		
		//to check if the password meet all the requirements
		if(i && j && k)
			System.out.print("Valid Password");
		else
			System.out.print("Invalid Password");
		
		input.close();
	}

}
