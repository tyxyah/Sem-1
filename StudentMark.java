/*************************************************************************************/
/* This is a program that able to calculate the total marks accumulated                */
/* by each student registered for the course.                                        */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 1, Q4                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 4 November 2020                                                    */
/*************************************************************************************/

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		
		Scanner mark = new Scanner(System.in);
		
		//display name course, code course and marks evaluation application
		System.out.printf("\n%57s", "COMPUTER PROGRAMMING I");
		System.out.printf("\n%50s\n", "(SSK3100)");
		System.out.println("********************************MARKS EVALUATION APPLICATION*********************************");
		
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
		System.out.printf("\n%-20s%-20s%-20s%-26s%-20s\n", "FIRST TEST (%)", "SECOND TEST (%)", "ASSIGNMENTS (%)", "FINAL EXAMINATION (%)", "TOTAL");
		System.out.println("---------------------------------------------------------------------------------------------");
		
		//compute value in %
		double firstTestPct = (firstTest /50) *20;
		double secondTestPct = (secondTest /50) *20;
		
		//compute all assignments in %
		double assignmentPct = (assignment1 + assignment2 + assignment3)/150 *30;
		
		//compute final exam and accumulated %
		double finalExamPct = (finalExam /100) *30;	
		double accPct = firstTestPct + secondTestPct + assignmentPct + finalExamPct ;
		
		//display marks in %
		System.out.printf("%-20.2f%-20.2f%-20.2f%-26.2f%-4.2f%-20.2s\n", firstTestPct, secondTestPct, assignmentPct, finalExamPct, accPct, "%");
		
		mark.close();     
		
		

	}

}
