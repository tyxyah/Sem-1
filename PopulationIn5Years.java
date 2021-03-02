/*************************************************************************************/
/* This is a program to display the population of                                    */
/* birth, death and new immigrants in the next five years.                           */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 1, Q3                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 3 November 2020                                                    */
/*************************************************************************************/

import java.util.Scanner;

public class PopulationIn5Years {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		//compute seconds in a year as a constant
		final int SECONDS_PER_YEAR = 365 *24 *60 *60;  
		
		//assign current population
		int currentPopulation = 312032486;      
		
		//compute birth per year
		int birthPerYear = SECONDS_PER_YEAR/7;   
		
		//compute death per year
		int deathPerYear = SECONDS_PER_YEAR/13;    
		
		//compute new immigrant per year
		int immigrantPerYear = SECONDS_PER_YEAR/45;    
		
		//compute population in five year
		int firstYear = currentPopulation + birthPerYear - deathPerYear + immigrantPerYear;
		int secondYear = firstYear + birthPerYear - deathPerYear + immigrantPerYear;
		int thirdYear = secondYear + birthPerYear - deathPerYear + immigrantPerYear;
		int fourthYear = thirdYear + birthPerYear - deathPerYear + immigrantPerYear;
		int fifthYear = fourthYear + birthPerYear - deathPerYear + immigrantPerYear;
		
		//display population in 5 years
		System.out.println("The population in 5 years based on current population: ");
		System.out.println("Year 1 = " + firstYear);
		System.out.println("Year 2 = " + secondYear);
		System.out.println("Year 3 = " + thirdYear);
		System.out.println("Year 4 = " + fourthYear);
		System.out.println("Year 5 = " + fifthYear);
			
		input.close();
		

	}

}