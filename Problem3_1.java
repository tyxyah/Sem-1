/*************************************************************************************/
/* This is a program that generated integer numbers between 10 to 20 randomly        */
/* and find the first row and column                                                 */
/* that accumulated the highest sum of elements.                                     */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 7, Q3                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 19 January 2021                                                    */
/*************************************************************************************/
package assignment7;
public class Problem3 {
	
	//method to create 5x5 matrix
	public static int[][] matrix5x5() {
		
		//to declare and initialized matrix
		int[][]matrix = new int[5][5];
		int min = 9;
		int max = 20;
		
		//loop for row
		for(int i = 0; i < matrix.length; i++) {
			System.out.println();
			
			//loop for column
			for(int j = 0; j < matrix.length; j++) {
				//to generate random number between 10 to 20
				int num = (int)((Math.random()* (max - min)+1) + min);
				//to assign generated number into 5x5 matrix
				matrix[i][j] = num;
				System.out.print(matrix[i][j] + "\t");
			}
		}
		return matrix;
	}
	//method to calculate the first highest sum at row
	public static int highestSumRow(int[][]matrix) {
		int total = 0;
		
		//loop to calculate sum of element at row 0
		for(int i = 0; i < matrix.length; i ++) {
			total += matrix[0][i];
		}
		//to assign row 0 as the highest sum
		int maxTotal = total;
		int maxRow = 0;
		
		//loop to calculate sum at another row
		for(int i = 0; i < matrix.length; i++) {
			total = 0;
			for(int j = 0; j < matrix.length; j++) {
				total += matrix[i][j];
			}
			//condition to change the highest sum at the row
			if(total > maxTotal) {
				maxTotal = total;
				maxRow = i;
			}
		}
		return maxRow;
	}
	//method to calculate the first highest sum at column
	public static int highestSumColumn(int[][]matrix) {
		int total = 0;
		
		//loop to calculate sum of element at column 0
		for(int i = 0; i < matrix.length; i++) {
			total = matrix[i][0];
		}
		//to assign column 0 as the highest sum
		int maxTotal = total;
		int maxColumn = 0;
		
		//loop to calculate sum at another column
		for(int i = 0; i < matrix.length; i++) {
			total = 0;
			for(int j = 0; j < matrix.length; j++) {
				total += matrix[j][i];
			}
			//condition to change the highest sum at the column
			if(total > maxTotal) {
				maxTotal = total;
				maxColumn = i;
			}
		}
		return maxColumn;
	}
	//main method
	public static void main(String[] args) {
		
		//to call all the methods
		int[][] mat = matrix5x5();
		int highestRow = highestSumRow(mat);
		int highestColumn = highestSumColumn(mat);
		
		//to display the first row and column with highest sum of element
		System.out.println("\n\n" + "The first row with highest sum of elements is " + highestRow);	
		System.out.println("The first column with highest sum of elements is " + highestColumn);	
	}
}
