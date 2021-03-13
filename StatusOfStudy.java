/*************************************************************************************/
/* This is a program that can assign status of study                                 */
/* for the first-year students in the department.                                    */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 4, Q2                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 17 December 2020                                                   */
/*************************************************************************************/
package assignment4;
import java.io.*;
import java.util.*;
public class StatusOfStudy {

	public static void main(String[] args) throws Exception{
		//create a new file
		String inputS = "input.txt";
		String status = "status.txt";
		File inputFile = new File(inputS);
		File statusFile = new File(status);
		
		//check if the file already exist
		if((statusFile.exists() && inputFile.exists())) {
			System.out.println("File " + status + " and " + inputS + " already exist");
		
		//display output at the file (note pad)
		PrintWriter output = new PrintWriter(statusFile);
			//to display name course, code course and marks evaluation application
			output.printf("\n%75s", "STATUS OF FIRST YEAR STUDENTS");
			output.printf("\n%73s\n", "BACHELOR COMPUTER SCIENCE");
						
			//display the header
			output.printf("\n%-5s%-31s%-47s%-25s%-15s\n", "NO.", "MATRIC NO.", "LIST OF COURSES REGISTERED", "GRADE POINT AVERAGE", "STATUS");
			output.println("----------------------------------------------------------------------------------------------------------------------");
			
			//create scanner for input file
			Scanner input = new Scanner(inputFile);
			int matricNo = input.nextInt();		
			
			//declaration of variable
			int i = 1;
			int cCredit = 0;
			String cCode = "";
			String grade = "";
			int mark = 0;
			double evaluationPoint = 0.00;
			double gpa = 0.00;
			double totalGPA = 0.00;
			double gpaAve = 0.00;
			double lowest = 4.00;
			double highest = 0.00;
			String statusL = "";
			
			//loop to read matric number
			while(input.hasNext() && matricNo != 99999) {
				output.printf("%-7s", i + ".");
				//display matric number
				output.printf("%-11s",matricNo);
			
				//declaration of variable
				double gradePoint = 0.00;
				double totalGrade = 0.00;
				double totalCredit = 0.00;
				int counter = 0;
				
				//loop to read course code, course credit and mark
				while(counter < 5) {
					cCode = input.next();
					cCredit = input.nextInt();
					mark = input.nextInt();
					
					//check mark to assign evaluation point and grade
					if(mark >= 80) {
						evaluationPoint = 4.00;
						grade = "A ";
						
					} else if(mark >= 75) {
						evaluationPoint = 3.75;
						grade = "A-";
					
					} else if(mark >= 70) {
						evaluationPoint = 3.50;
						grade = "B+";
					
					} else if(mark >= 65) {
						evaluationPoint = 3.00;
						grade = "B ";					
					
					} else if(mark >= 60) {
						evaluationPoint = 2.75;
						grade = "B-";		
					
					} else if(mark >= 55) {
						evaluationPoint = 2.50;
						grade = "C+";	
					
					} else if(mark >= 50) {
						evaluationPoint = 2.00;
						grade = "C ";
					
					} else if(mark >= 47) {
						evaluationPoint = 1.75;
						grade = "C-";
					
					} else if(mark >= 44) {
						evaluationPoint = 1.50;
						grade = "D+";	
					
					} else if(mark >= 40) {
						evaluationPoint = 1.00;
						grade = "D ";
					
					} else {
						evaluationPoint = 0.00;
						grade = "F ";
					}
					
					//to calculate grade point, total grade point and total credit
					gradePoint = evaluationPoint* cCredit;
					totalGrade = totalGrade + gradePoint;
					totalCredit = totalCredit + cCredit;
					//to display credit code (grade)
					output.printf("%-8s", cCode);
					output.printf("%-5s", "(" + grade + ")");
					
					counter++; 
				}
				//to calculate and display GPA
				gpa = totalGrade/totalCredit;
				output.printf("%12.2f", gpa);
				//to calculate total gpa
				totalGPA = totalGPA + gpa;
				
				//to assign status from gpa
				if(gpa >= 3.75)
					statusL = "OUTSTANDING";
				else if(gpa >= 3.50)
					statusL = "GOOD";
				else if(gpa >= 3.00)
					statusL = "FAIR";
				else if(gpa >= 2.50)
					statusL = "SATISFACTORY";
				else if(gpa >= 2.00)
					statusL = "PASS";
				else
					statusL = "FAIL";
				//to print status
				output.printf("\t\t%-20s\n"," " + statusL);	
				
				//to check lowest and highest gpa
				if(gpa < lowest) {
					lowest = gpa;
				}
					
				if(gpa > highest) {
					highest = gpa;
				}
				
				//to end the loop using sentinel value (99999)
				matricNo = input.nextInt();
			
				i++;	
			
			}
			//to display highest and lowest gpa
			output.printf("\n%-15s%.2f\n", "HIGHEST GPA : " , highest);
			output.printf("\n%-15s%.2f\n", "LOWEST GPA  : " ,  lowest);
			//to calculate and display gpa average
			gpaAve = totalGPA/(i-1); // (i-1) to delete sentinel value for matric number
			output.printf("\n%-15s%.2f\n", "AVERAGE GPA : " , gpaAve );
			
			//to close Scanner
			input.close();
			output.close();
			
		}
		//display if the file does not exist
		else 
			System.out.println("The file does not exist");
	}
	
}
