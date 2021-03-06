/*************************************************************************************/
/* This is a program that prompts the user to enter                                  */
/* the weight of the package and display the shipping cost.                          */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 2, Q4                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 18 November 2020                                                   */
/*************************************************************************************/
package assignment2;
import java.util.Scanner;

public class ShippingCost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompts the user to enter the weight
		System.out.print("Enter the weight of the pakage in pound : ");
		int weight = input.nextInt();
		
		//display the shipping cost
		if (weight > 0 && weight <=2)
			System.out.print("Your shipping cost is RM 2.50");
		else if (weight > 2 && weight <= 4)
			System.out.print("Your shipping cost is RM 4.50");
		else if (weight > 4 && weight <= 10)
			System.out.print("Your shipping cost is RM 7.50");
		else if (weight > 10 && weight <= 20)
			System.out.print("Your shipping cost is RM 10.50");
		else
			System.out.print("ERROR! The weight has exceed the limit ");
			
input.close();
	}

}
