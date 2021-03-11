/*************************************************************************************/
/* This program is to solve the programming problem number 4.5                       */
/* page 174 on finding the area of a regular polygon in Liang’s  book.               */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 3, Q1                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 25 November 2020                                                   */
/*************************************************************************************/
package assignment3;
import java.util.Scanner;
public class PolygonArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//to prompts the user to enter number of sides and side length
		System.out.print("Enter the number of sides : ");
		int ns = input.nextInt();
		
		System.out.print("Enter the lenght of the side : ");
		double sl = input.nextDouble();
		
		//to display the area of a polygon
		double area = (ns* (sl* sl))/ (4* Math.tan(Math.PI/ns));
		System.out.print("The area of the polygon is " + area);
		
		input.close();

	}

}
