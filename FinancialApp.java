/*************************************************************************************/
/* This is a program that lets the user enter the loan amount,                       */
/* number of years, and interest rate                                                */
/* then displays the amortization schedule for the loan.                             */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 5, Q3                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 23 December 2020                                                   */
/*************************************************************************************/
package assignment5;
import java.util.*;
public class FinancialApp {

	public static void main(String[] args) {
		//to create a scanner
		Scanner input = new Scanner(System.in);
		//to prompt user to enter loan amount, number of years and annual interest rate
		System.out.print("Loan Amount : ");
		double balance = input.nextDouble();
		System.out.print("Number Of Years : ");
		int years = input.nextInt();
		System.out.print("Annual Interest Rate : ");
		double annualInterestRate = input.nextDouble();
		//to calculate monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		//declaration and initialization of variables
		double interest = 0.0;
		double principal = 0.0;
		int i = 0;
		
		//to calculate monthly payment
		double monthlyPayment = balance * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
		System.out.printf("\n%-16s%.2f", "Monthly Payment : " , monthlyPayment);
		
		//to calculate total payment
		double totalPayment = monthlyPayment * years * 12;
		System.out.printf("\n%-16s%.2f\n", "Total Payment : ", totalPayment);
		
		//to print header for payment, interest, principal and balance
		System.out.printf("\n%-11s%-14s%-15s%-14s\n", "Payment#", "Interest", "Principal", "Balance" );
		//loop to calculate interest, principal and balance
		for (i = 1; i <= years * 12; i++) {
			 interest = monthlyInterestRate * balance;
			 principal = monthlyPayment - interest;
			 balance = balance - principal;
			 //to display calculated i, interest, principal and balance
			 System.out.printf("%-11d%-14.2f%-15.2f%-14.2f\n", i, interest, principal, balance );

			 input.close();
		}
		
	}

}
