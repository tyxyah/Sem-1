/*************************************************************************************/
/* This program prompts the user to enter two characters                             */
/* and displays the study program and status represented in the characters.          */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 3, Q3                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 26 November 2020                                                   */
/*************************************************************************************/
package assignment3;
import java.util.Scanner;
public class StudyProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//to prompts the user to enter two characters
		System.out.print("Enter two characters : ");
		String status = input.nextLine();
		
		//to read character from console
		char course = Character.toUpperCase(status.charAt(0));
		char year = status.charAt(1);
		
		//declaration of variables
		String courseName = "";
		String yearName = "";
			
		//to display user's course name and year
		if (course == 'C' || course == 'S' || course == 'N' || course == 'M') {
			
			switch (course) {
			case 'C' : courseName = "Computer Science"; break;
			case 'S' : courseName = "Software Engineering"; break;
			case 'N' : courseName = "Network"; break;
			case 'M' : courseName = "Multimedia"; break;
			default : System.out.println("Invalid input");
			}
			
			switch (year) {
			case '1' : yearName = "Freshman"; break;
			case '2' : yearName = "Sophomore"; break;
			case '3' : yearName = "Junior"; break;
			case '4' : yearName = "Senior"; break;
			default : System.out.println("Invalid input");
			}
			
			System.out.print("Your study program is " + courseName + " and you are a " + yearName + " student.");
		}
		
		//displayed if the users enter an invalid input
		else 
			System.out.print("Invalid status. Please enter the two characters correctly.");
	
			input.close();
	}

}
