/*************************************************************************************/
/* This is a program  that prompts the user to enter a decimal                       */
/* integer then displays its corresponding binary value.                             */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 5, Q4                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 20 December 2020                                                   */
/*************************************************************************************/
package assignment5;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		//prompts the user to enter a decimal integer
		System.out.print("Enter a decimal integer : ");
		int decimal = input.nextInt();
		//declaration and initialization for binary 
		String binary = "";
		
		//loop to calculate entered decimal integer
 		while(decimal >= 1) {
 			//check if decimal integer can be divided by 2 to assign 0 to the binary number
			if(decimal % 2 == 0) 
				binary = "0" + binary;//binary must be put at the back because it was read from the back
			
			//check if decimal integer cannot be divided by 2 to assign 1 to the binary number
			else 
				binary = "1" + binary;
			
			//to remove the remainder from previous calculation
			decimal = decimal / 2;
		}
 		//to print binary value
		System.out.println("The binary value : " + binary);
		input.close();
	}

}
