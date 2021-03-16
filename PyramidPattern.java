/*************************************************************************************/
/* This is a program display numbers in a pyramid pattern.                           */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 5, Q2                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 20 December 2020                                                   */
/*************************************************************************************/
package assignment5;
public class PyramidPattern {

	public static void main(String[] args) {
	
		//declaration and initialization of variables
		int row = 8;
		int odd = 1;//amount of numbers that print at the column
		int spaces = 7;
		
		//loop for row
		for(int i = 1; i <= row; i++) {
			int k = 0;//number in the column
			
			//loop to insert spaces at the front of numbers
			for(int j = 1; j <= spaces; j++) {
				System.out.print("      ");
			}
			//loop for the number at the column
			for(int j = 1; j <= odd; j++) {
				
				//condition to calculate the number
				if(j == 1) 
					k = k + 1;
				
				else if(j <= i) 
					k = k * 3;//left hand side from the middle number in column(increasing)
				
				else 
					k = k / 3;//right hand side from the middle number in column(decreasing)
				
					//display the number calculated (k)
					System.out.printf("%-4s%-2s", k , " ");	
			}
			//to print next column under the previous one
			System.out.println();
			//to add amount of number consist in the next column
			odd = odd + 2;
			//insert spaces to get pyramid pattern
			spaces = spaces - 1;
		}
	}
}
