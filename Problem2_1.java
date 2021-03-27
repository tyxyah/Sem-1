/*************************************************************************************/
/* This is a program that will count the votes for each candidate                    */
/* to select the two students’ representatives.                                      */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 7, Q2                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 20 January 2021                                                    */
/*************************************************************************************/
package assignment7;
import java.io.*;
import java.util.Scanner;
public class Problem2 {

	//method to display the list
	public static void displayCandidates(String[]candidates, int[]totalVote) {
		//to display the list before sorting
		System.out.println("\n" + "LIST OF CANDIDATES BEFORE SORTING" + "\n");
		System.out.println("Candidates" + "\t" + "Votes");
		System.out.println("----------------------");
		
		for(int i = 0; i < totalVote.length; i++) {
			System.out.println(candidates[i] + "\t" + totalVote[i]);
		}
	}
	
	//method to sort the votes
	public static void sort(String[]candidates, int[]totalVote) {
		for(int i = 0; i < candidates.length; i++) {
			for(int j = i+1; j < totalVote.length; j++) {
				int higher = 0;
				String name = "";
				
				//if the input is higher than the previous vote, move name and total votes simultaneously
				if(totalVote[i] < totalVote[j]) {
					higher = totalVote[i];
					totalVote[i] = totalVote[j];
					totalVote[j] = higher;
					
					//to move the highest vote name to the top
					name = candidates[i];
					candidates[i] = candidates[j];
					candidates[j] = name;
				}
			}
		}
		//to display the list after sorting
		System.out.println("\n"+ "LIST OF CANDIDATES AFTER SORTING" + "\n");
		System.out.println("Candidates" + "\t" + "Votes");
		System.out.println("----------------------");
		
		for(int i = 0; i < candidates.length; i++) {
			System.out.println(candidates[i] + "\t" + totalVote[i]);
		}
	}
	
	//main method
	public static void main(String[] args) throws Exception {
		//to create new file
		String votes = "votes.txt";
		File file = new File(votes);
		
		//to check if the file already exist
		if(file.exists()) {
			System.out.println("File " + file + " already exist");
			
			Scanner input = new Scanner(file);
			//to initialized total vote and candidates
			int[] totalVote = new int[5];
			String[]candidates = {"Tong Seng", "Muhammad Ali", "Rani Raj", "Musa Omar", "Ahmad Marwan"};
			int[] vote = new int[300];
			int count = 0;
			
			while(input.hasNext()) {
				//input from the file
				vote[count] = input.nextInt();
				
				for(int i = 0; i < candidates.length; i++) {
					if(vote[count] == i)
						totalVote[i]++;
				}
				count++;
			}
			//to display candidates before and after sorting
			displayCandidates(candidates, totalVote);
			sort(candidates, totalVote);
			
			//to print top 2 as the winners
			System.out.println("\n" + "The winners are : " + "\n");
			System.out.println(candidates[0] + "\n" + candidates[1]);
			
			input.close();
		}
		//displayed if the file does not exist
		else
			System.out.println("The file does not exist");	
	}
}
