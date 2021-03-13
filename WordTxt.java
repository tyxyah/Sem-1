/*************************************************************************************/
/* This is a program to create a text file called word.txt                           */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 4, Q1                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 7 December 2020                                                    */
/*************************************************************************************/
package assignment4;
import java.io.*;
public class WordTxt {

	public static void main(String[] args) throws Exception {
		//to create file
		String fName = "word.txt";
		File file = new File(fName);
		
		//to check if the file already exist
		if(file.exists()) {
			System.out.println("File " + fName + " already exist");
			System.exit(0);
			
		}
		//to create file output
		PrintWriter output = new PrintWriter(file);
		//write formatted output to the file
		output.printf("%-7s %-7s %-7s %-6s %-6s \n %-6s %-7s %-11s %-7s", "secret", "codes5", "mayhem", 
					  "13456", "roger2", "alpha", "99gogo", "beta2gamma", "765489");
		output.close();				 
	}

}
