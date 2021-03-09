/*************************************************************************************/
/* This is a program that prompts the user to enter binary digits                    */
/* and displays its corresponding decimal value.                                     */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 3, Q2                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 25 November 2020                                                   */
/*************************************************************************************/
package assignment3;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//to prompts the user to enter binary digits
		System.out.print("Enter binary digits (0000 to 1111) : ");
		String binaryString = input.next();
		
		//to check if the input is right and then displayed their decimal value
		if (binaryString.matches("[01]+") && (binaryString.length()==4)) {
			System.out.println("The decimal value for " + binaryString + " is " + Integer.parseInt(binaryString,2));
		}
		//displayed if the users enter wrong input
		else
			System.out.print("Please enter the right input");
		
		input.close();

	}

}
