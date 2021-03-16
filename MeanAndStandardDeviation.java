/*************************************************************************************/
/* This is a program that prompts the user to enter 10 numbers                       */
/* and displays the mean and standard deviations of those numbers.                   */                     
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 5, Q5                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 23 December 2020                                                   */
/*************************************************************************************/
package assignment5;
import java.util.*;
public class MeanAndStandardDeviation {

	public static void main(String[] args) {
		//to create a scanner
		Scanner input = new Scanner(System.in);
		//to prompt users to enter 10 numbers
		System.out.print("Enter 10 numbers : ");
		
		//declaration and initialization of variables
		int i = 0;
		double num = 0.0;
		double mean = 0.0;
		double deviation = 0.0;
		
		//loop for repeated mean and deviation
		while(i < 10) {
			num = input.nextDouble();
			mean = mean + num; 
			deviation = deviation + Math.pow(num, 2);
			i++;
		}
		//to calculate final mean and standard deviation
		deviation = Math.sqrt(((deviation) - (Math.pow(mean, 2)/i)) / (i-1));
		mean = mean/i;
		//to display final mean and standard deviation
		System.out.print("The mean is " + mean);
		System.out.printf("\n%-26s%.5f", "The standard deviation is ", deviation);
		
		input.close();
		
	}

}
