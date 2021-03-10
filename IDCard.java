/*************************************************************************************/
/* This is a program that prompts the user to enter an identification card number    */
/* in the format DDDDDD-DD-DDDD, where D is a digit.                                 */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 3, Q5                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 27 November 2020                                                   */
/*************************************************************************************/
package assignment3;
import java.util.Scanner;
public class IDCard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//to prompts the user to enter their ID card number
		System.out.print("Enter an identification card number : ");
		String cardNumber = input.next();
		
		//to check the validity of the card number
		boolean valid =
				
			//the length of character must be 14
			(cardNumber.length()==14) && 
			
			//the character must be in digit
			(Character.isDigit(cardNumber.charAt(0))) &&
			(Character.isDigit(cardNumber.charAt(1))) &&
			(Character.isDigit(cardNumber.charAt(2))) &&
			(Character.isDigit(cardNumber.charAt(3))) &&
			(Character.isDigit(cardNumber.charAt(4))) &&
			(Character.isDigit(cardNumber.charAt(5))) &&
			
			//the sixth character is "-"
			(cardNumber.charAt(6)== '-') &&
			
			//the character must be in digit
			(Character.isDigit(cardNumber.charAt(7))) &&
			(Character.isDigit(cardNumber.charAt(8))) &&
			
			//the ninth character is "-"
			(cardNumber.charAt(9)== '-') &&
			
			//the character must be in digit
			(Character.isDigit(cardNumber.charAt(10))) &&
			(Character.isDigit(cardNumber.charAt(11))) &&
			(Character.isDigit(cardNumber.charAt(12))) &&
			(Character.isDigit(cardNumber.charAt(13))) ;
		
		//to display the validity of the card
		System.out.println(cardNumber + " is " + ((valid) ? "a valid" : "an invalid") + " identification card number." );

		input.close();
		
	}

}
