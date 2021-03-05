/*************************************************************************************/
/* This is a program that randomly generates an integer between 1 and 12             */
/* and displays the English month names January, February, …,                        */
/* December for the number 1, 2, …, 12, accordingly.                                 */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 2, Q3                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 12 November 2020                                                   */
/*************************************************************************************/

package assignment2;

public class MonthName {
	public static void main(String[] args) {
		
		//integer randomly generated
		int month = (int)(Math.random()* 12)+1 ;
		
		//display the random generated integer
		if (month == 1)
			System.out.print(" The " + month + "st month is ");
		else if (month == 2)
			System.out.print(" The " + month + "nd month is ");
		else if (month == 3)
			System.out.print(" The " + month + "rd month is ");
		else 
			System.out.print(" The " + month + "th month is ");
		
		//display month name
		switch (month) {
		case 1: System.out.print("January"); break;
		case 2: System.out.print("February"); break;
		case 3: System.out.print("March"); break;
		case 4: System.out.print("April"); break;
		case 5: System.out.print("Mei"); break;
		case 6: System.out.print("June"); break;
		case 7: System.out.print("July"); break;
		case 8: System.out.print("August"); break;
		case 9: System.out.print("September"); break;
		case 10: System.out.print("October"); break;
		case 11: System.out.print("November"); break;
		case 12: System.out.print("December"); break;
		default : System.out.print("The month does not exist");
		
			System.exit(0);
		
		}
		
	}

}
