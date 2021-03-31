/*************************************************************************************/
/* This is a program that prompts the user to enter the number of students           */
/* and each student’s name and score, and finally displays the names of the          */
/* students with the lowest and second-lowest scores.                                */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 5, Q1                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 19 December 2020                                                   */
/*************************************************************************************/
package assignment5;
import java.util.*;
public class TwoLowestScore {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		//prompt the user to enter number of student
		System.out.print("Enter the number of students : ");
				
		//declaration and initialization of variables
		int studentNum = input.nextInt();
		int i = 1;
		int score = 0;
		int lowest = 100;
		int secLow = 100;
		String name = "";
		String student1 = "";
		String student2 = "";
		
		while(i <= studentNum) { //condition to let the loop continue
			
		//prompt the user to enter student's name and mark
		System.out.print(i + ". " + " NAME  : ");
		name = input.next(); 
		System.out.printf("%12s","SCORE : ");
		score = input.nextInt();
		
		//let the first student have lowest score
		if(i == 1) {
			lowest = score;
			student1 = name;
			
		//check if the second student has lower score than the first student
		} else if(i == 2 && score < lowest) {
			secLow = lowest;
			lowest = score;
			student2 = student1;
			student1 = name;
			
		//check if the second student scored as the second lowest
		} else if(i == 2) {
			secLow = score;
			student2 = name;
		
		//check if the other students has the lowest score
		} else if(i > 2 && score < lowest && score < secLow) {
			secLow = lowest;
			lowest = score;
			student2 = student1;
			student1 = name;
			
		//check if the other students has the second lowest score
		} else if(i > 2 && score < secLow) {
			secLow = score;
			student2 = name;	
		}	
		i++;
		}
		//display the lowest and second lowest student with respective score
		System.out.println("Student with the lowest score is : " + student1 + " / " + lowest);
		System.out.println("Student with the second-lowest score is : " + student2 + " / " + secLow);
		input.close();
	}

}
