/*************************************************************************************/
/* This is a program that will read the file                                         */
/* and create a two-dimensional array to hold the data read in.                      */
/* Average mark for each student and average mark for each test will be displayed.   */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 7, Q4                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 27 January 2021                                                    */
/*************************************************************************************/
package assignment7;
import java.io.*;
import java.util.Scanner;
public class Problem4 {

	//method to calculate average mark for each test
	public static double averageMark(int[][]marks, int row, int column) {
		double total = 0;
		double average = 0;
		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j++) {
				total += marks[j][i];
			}
			average = total/row;
			System.out.print(" " + average + "  |");
		}	
		return average;
	}
	//main method
	public static void main(String[] args) throws Exception{
		
		//to create new file
		String Fmarks = "marks.txt";
		File file = new File(Fmarks);
		
		//check if file exist
		if(file.exists()) {
			System.out.println("File " + file + " already exist");
			
		//create scanner for input file
		Scanner input = new Scanner(file);
		int row = input.nextInt();
		int column = input.nextInt();
		
		//display header
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println("|Student" + "|Test 1 " + "|Test 2 " + "|Test 3 " + "|Test 4 " + "| Average |");
		System.out.print("---------------------------------------------------");
		
		//initialize array for marks
		int[][] marks = new int[row][column];
		
		//outer loop to read and print all marks
		while(input.hasNext()) {
			//student number
			int i = 1;
			System.out.println();
			
			//loop to print 2d array for mark
			for(int j = 0; j < row; j++) {
				double total = 0;
				double studentAverage = 0;
				System.out.print("|   " + i + "\t");
				for(int k = 0; k < column; k++) {
					marks[j][k] = input.nextInt();
					
					//display marks in 2d array
					System.out.print("|  " + marks[j][k] + "\t");
					
					//calculate total mark for each row
					total += marks[j][k];
				}	
				//calculate and print each student average mark
				studentAverage = total/column;
				System.out.print("| " + studentAverage + "\t  |");
				System.out.println();
				i++;
			}	
			System.out.println("---------------------------------------------------");
			//display average mark for each test
			System.out.print("|Average|");
			averageMark(marks, row, column);
			System.out.println("\n-----------------------------------------");
		}
		input.close();
		}
		//displayed if the file does not exist
		else
			System.out.println("The file does not exist");	
	}
}
