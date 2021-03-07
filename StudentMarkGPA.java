/*************************************************************************************/
/* This is a program that able to calculate the total marks accumulated              */
/* by each student registered for the course and their respective GPA.               */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 2, Q1                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 11 November 2020                                                   */
/*************************************************************************************/

package assignment2;
import java.util.Scanner;

public class StudentMarkGPA {
	public static void main(String[] args) {
		
		Scanner mark = new Scanner(System.in);
		
		//display name course, code course and marks evaluation application
		System.out.printf("\n%57s", "COMPUTER PROGRAMMING I");
		System.out.printf("\n%50s\n", "(SSK3100)");
		System.out.println("**************************************MARKS EVALUATION APPLICATION***************************************");
		
		System.out.println("\nPLEASE ENTER MARKS:-");   
		
		//display FIRST TEST
		System.out.printf("\n%20s", "FIRST TEST:  ");      
		double firstTest = mark.nextDouble();              
		  
		//display SECOND TEST
		System.out.printf("%20s", "SECOND TEST:  ");       
		double secondTest = mark.nextDouble();            
		
		//display ASSIGNMENT 1
		System.out.printf("\n%20s", "ASSIGNMENT 1:  ");    
		double assignment1 = mark.nextDouble();           
		
		//display ASSIGNMENT 2
		System.out.printf("%20s", "ASSIGNMENT 2:  ");      
		double assignment2 = mark.nextDouble();            
		 
		//display ASSIGNMENT 3
		System.out.printf("%20s", "ASSIGNMENT 3:  ");      
		double assignment3 = mark.nextDouble();           
		
		//display FINAL EXAMINATION
		System.out.printf("\n%15s", "FINAL EXAMINATION:  ");    
		double finalExam = mark.nextDouble();                  
		
		//display calculated mark
		System.out.printf("\n%55s\t\n", "CALCULATED MARKS");      
		
		//display table header
		System.out.printf("\n%-20s%-20s%-20s%-26s%-15s%-20s\n", "FIRST TEST (%)", "SECOND TEST (%)", "ASSIGNMENTS (%)", "FINAL EXAMINATION (%)", "TOTAL(%)", "GPA");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		//compute value in %
		double firstTestPct = (firstTest /50) *20;
		double secondTestPct = (secondTest /50) *20;
		
		//compute all assignments in %
		double assignmentPct = (assignment1 + assignment2 + assignment3)/150 *30;
		
		//compute final exam and accumulated %
		double finalExamPct = (finalExam /100) *30;	
		
		//compute total mark and round it off
		double totalPct = Math.round(firstTestPct + secondTestPct + assignmentPct + finalExamPct) ;
		
		//display marks in %
		System.out.printf("%-20.2f%-20.2f%-20.2f%-26.2f%-15.0f", firstTestPct, secondTestPct, assignmentPct, finalExamPct, totalPct);
		
		//determine GPA
		if (totalPct <= 39)
			System.out.print("0.00");
		else if (totalPct <=43 )
			System.out.print("1.00");
		else if(totalPct <= 46)
			System.out.print("1.50");
		else if(totalPct <= 49)
			System.out.print("1.75");
		else if(totalPct <= 54)
			System.out.print("2.00");
		else if(totalPct <= 59)
			System.out.print("2.50");
		else if(totalPct <= 64)
			System.out.print("2.75");
		else if(totalPct <= 69)
			System.out.print("3.00");
		else if(totalPct <= 74)
			System.out.print("3.50");
		else if(totalPct <= 79)
			System.out.print("3.75");
		else 
			System.out.print("4.00");
				
		mark.close();     
		
	}

}
