/*************************************************************************************/
/* This is a program that reads a text file to determine                             */
/* whether each word in the file contains digit (0-9) only or letters only.          */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 4, Q1                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 10 December 2020                                                   */
/*************************************************************************************/
package assignment4;
import java.util.*;
public class DigitOrLetters {

	public static void main(String[] args) throws Exception {
		
		//to create a file instance
		java.io.File file = new java.io.File("word.txt");
		
		//to create a Scanner
		Scanner input = new Scanner(file);

		//to read data from a file
		while(input.hasNext()) {
			
			//to declare variable
			String fName = input.next();
			int length = fName.length();
			boolean isDigit = false;
			boolean isLetter = false;
			int i = 0;
			
			//to determine each character from the words (digit/letter)
			while (i < length) {
				//to check if the character is digit
				if(Character.isDigit(fName.charAt(i)))
					isDigit = true;
				//to check if the character is letter
				else if(Character.isLetter(fName.charAt(i)))
					isLetter = true;
				i++;
			}	
			
			//to display mixed character
			if (isDigit && isLetter)
				System.out.println("Word " + fName + " is mixed");
			//to display digit only
			else if(isDigit)
				System.out.println("Word " + fName + " contains digit only");
			//to display letters only
			else
				System.out.println("Word " + fName + " contains letters only");
		
		}
	input.close();
	}
}
