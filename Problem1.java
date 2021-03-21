/*************************************************************************************/
/* This is a program that reads the integers between 1 and 50                       */
/* and counts the occurrences of each. The input ends with 0.                        */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 7, Q1                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 18 January 2021                                                    */
/*************************************************************************************/
package assignment7;
import java.util.*;
public class Problem1 {

	//method to display counts
	public static void displayCounts(int[]counts) {
		//condition to display result
		for(int i = 0; i < 50; i++) {
					
			//displayed if the number at i element = 1(time)
			if(counts[i] == 1)
				System.out.println(i+1 + " occurs " + counts[i] + " time");
			
			//displayed if the number at i element > 1(times)
			else if(counts[i] > 1)
				System.out.println(i+1 + " occurs " + counts[i] + " times");	
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//to set array size
		int[]counts = new int[50];
		
		//prompt users to enter integers between 1 and 50
		System.out.print("Enter the integers between 1 and 50 : ");
		
		//this input will become the first number insert to the array
		int num = input.nextInt();
		
		//loop will continue until users enter 0
		while(num != 0) {
			
			//to check if the number entered is less than 50
			if(num <= 50)
				//assign the first input at element(number-1) and count as 1 occurrence
				counts[num-1]++;
			
		//to continue the loop, the next number must be entered
		num = input.nextInt();
		}
		//call method to display counts
		displayCounts(counts);
		input.close();
	}
}