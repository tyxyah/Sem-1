/*************************************************************************************/
/* This is a program that able to add the digits of a four-digit number              */
/* and then adds a fifth digit of 0 or 1 to make the sum of the digits even.         */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 2, Q2                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 12 November 2020                                                   */
/*************************************************************************************/

package assignment2;
import java.util.Scanner;

public class CardNumber {
	public static void main(String[] args) {
		
		Scanner integer = new Scanner(System.in);
		
		//prompt user to enter four-digit number
		System.out.print("Enter four-digit number : ");
		int num = integer.nextInt();
		
		//extract the fourth digit 
		int fourthDigit = num % 10;
		int firstRemainder = num / 10;
		int thirdDigit = firstRemainder % 10;
		int secondRemainder = firstRemainder / 10;
		int secondDigit = secondRemainder % 10;
		int firstDigit = secondRemainder / 10;
		
		//compute sum of all digits
		int sumDigit = firstDigit + secondDigit + thirdDigit+ fourthDigit;
		
		//extract last digit from sumDigit to determine odd or even number
		int checkDigit = sumDigit % 10;
		
		//display the card number
		int newNumber;
		if (checkDigit % 2 == 0)
			newNumber = num* 10;
		
		else 
			newNumber = num* 10 + 1;
		
		System.out.print("The New Number is : " + newNumber );
		
		integer.close();
		

	}

}
