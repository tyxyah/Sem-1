/*************************************************************************************/
/* This is a program that check whether a number is a palindrome or not.             */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 6, Q1                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 30 December 2020                                                   */
/*************************************************************************************/
package assignment6;
import java.util.*;
public class Problem1 {

	//method to return the reversal of an integer
	public static int reverse(int num) {
		//to declare and initialized variables
		int reverse = 0;
		int current = 0;
		
		while(num != 0) { //condition for the loop
			current = num % 10; //to get the last digit from the integer
			reverse = (reverse* 10) + current; //to reverse the number
			num = num / 10; //to remove remainder
			
		}
		return reverse;
	}
	
	//method to return true if the number is a palindrome
	public static boolean isPalindrome(int num) {
		//to declare and initialized variables
		int revNum = reverse(num);
		boolean isPalindrome = false;
		
		//condition to return number as a palindrome
		if(num == revNum)
			isPalindrome = true;
		
		return isPalindrome;
	
	}
	
	//main method to test the program
	public static void main(String[] args) {
		//to create a scanner
		Scanner input = new Scanner(System.in);
		//to prompt users to enter a number
		System.out.print("Enter a number : ");
		int i = input.nextInt();
		//let j be the reversal number of i(using reverse method)
		int j = reverse(i);
		//to check if i is a palindrome(using isPalindrome method)
		if(isPalindrome(i))
			System.out.print(i + " = " + j + " (a Palindrome)");
		else
			System.out.print(i + " != " + j + " (not a Palindrome)");
			
		input.close();

	}

}
