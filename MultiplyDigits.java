/*************************************************************************************/
/* This is a program that read an integer between 100 and 999                        */
/* and the product of all the digits in the number.                                  */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 1, Q2                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 2 November 2020                                                    */
/*************************************************************************************/

import java.util.Scanner;

public class MultiplyDigits {

	public static void main(String[] args) {
		
		Scanner integer = new Scanner(System.in);
		
		//display integer
		System.out.println("Input an integer between 100 to 999: ");   
		int num = integer.nextInt();          
		
		//extract the third digit
		int thirdDigit = num % 10;        
		
		//remove the extracted digit to get remainder
		int remainder = num / 10;         
		
		//extract the remainder to get second digit
		int secondDigit = remainder % 10; 
		
		//remove the extracted digit and get the first digit
		int firstDigit = remainder / 10;     
		
		//compute the product of all digits 
		int productAllDigits = firstDigit * secondDigit * thirdDigit;        
		
		//display the result
		System.out.println("Product of all digits in " + num + " is " + productAllDigits);
		
		integer.close(); 
		
	}
	
}

