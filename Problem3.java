/*************************************************************************************/
/* This is a program that requires a user to enter any string                        */
/* and the system will display a menu with several manipulating string options       */
/* Course Name : Computer Programming I                                              */
/* Course Code : SSK3100 Group 3                                                     */
/* Assignment and Question Number : Assignment 6, Q3                                 */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 14 January 2021                                                    */
/*************************************************************************************/
package assignment6;
import java.util.*;
public class Problem3 {
	//method for menu option
	public static int menu(){
		Scanner input = new Scanner(System.in);
			System.out.println("List of menu option number you can choose : ");
			System.out.println("1. Find a character at a specified index");
			System.out.println("2. Compare the string with a new string");
			System.out.println("3. Determine the number vowels and consonants");
			System.out.println("4. Display the string in reverse order");
			System.out.println("5. Replace a character in the string");
			System.out.println("6. Delete any character in the string");
			System.out.println("7. Append a character to the end of a string");
			System.out.println("0. Quit");
			System.out.println();
			
			//prompt users to enter option menu
			System.out.print("Enter your menu option number: ");
			int option = input.nextInt();
			
			return option;	   
	}
	//Option 1 : Method to find a character at specified index
	public static char ch (String str, int index){	
		char ch = 0;
		//index entered must be less than string length
		if(index < str.length()) 
			ch = str.charAt(index);
		//if index is out of boundary
		else 
	   		return 0;
		
		return ch;		
	}
	//Option 2 : Method to compare the string with a new string
	public static boolean compare(String str, String newStr) {
		boolean compare = false;
		//check if the two strings are equal
		if(newStr.equals(str)) {
			compare = true;
			System.out.print(compare + ". The two strings are matched. ");
		} else {
			System.out.print(compare + ". The two strings did not match. ");
	
		}
		return compare;
	}
	//Option 3.0 : Method to determine the number vowels
	public static int countVow(String str) {
		int countVow = 0;
		int i = 0;
		int len = str.length();
		   
		while(i < len) {
			char ch = str.charAt(i);
			//if the character at i is a vowels, count it
		    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			   countVow++;
		    i++;
		}
		return countVow;
	}
	//Option 3.1 : Method to determine the number consonants
	public static int countCons(String str) {
		int countCons = 0;
		int i = 0;
		int len = str.length();
		   
		while(i < len) {
			char ch = str.charAt(i);
			//if the character at i is not vowels, count it as consonants
			if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
			   countCons++;
		   i++;
		   }
		return countCons;
	}
	//Option 4 : Method to display the string in reverse order
	public static String reverse(String str) {
		String reverseStr = "";
		int len = str.length();
		
		   for(int j = len - 1; j >= 0; j--) {
			   reverseStr += str.charAt(j);
		   }
		   System.out.println("The reverse string of " + str + " is " + reverseStr);
		return reverseStr;
	}
	//Option 5 : Method to replace a character in the string
	public static String replaceChar(String str, char replaceChar, char newChar) {
		String result = "";
		int len = str.length();
		for(int i = 0; i < len; i++) {
			//check if the character at index i = character that need to be replaced
		    if(str.charAt(i) == replaceChar) 
		    	result += newChar;
		    else 
		    	result += str.charAt(i);
		    
		 }
		
		return result;
	}
	//Option 6 : Method to delete any character in the string
	public static String deleteChar(String str, char delChar) {
		String result = "";
		int len = str.length();
		
		for (int i = 0; i < len; i++){
	        if (str.charAt(i) != delChar)
	            result += str.charAt(i);
	        }
		return result;
	}
	//Option 7 : Method to append a character to the end of a string
	public static String addChar(String str, char endChar) {
		String result = str + endChar;
		
		return result;
	}	
	//Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompts user to enter any string
		System.out.print("Enter any string : ");
		String str = input.next();
		System.out.println();
		//call menu method
		int option = menu();
		
		while(option != 0) { //condition to continue the loop
		
			switch(option) {
			
			case 1 : 
				System.out.print("Enter an index : ");
				int index = input.nextInt();
				char ch = ch(str, index); //call ch method that check character at specified index
				if(ch == 0)
					System.out.println("The index does not exist. "); 
				else
					System.out.println("The character is : " + ch); 
				break;
				
			case 2 : 
				System.out.print("Enter new string : ");
				String newStr = input.next();
				compare(str,newStr); //call compare method that compare two strings
				System.out.println();
				break;
				
			case 3 : 
				int countVow = countVow(str); //call countVow method to count vowels
				int countCons = countCons(str); //call countCons method to count consonants
				System.out.println("The number of vowals is " + countVow + "\n" + "The number of consonants is " + countCons); 
				break;
				
			case 4 : 
				reverse(str); //call reverse method to reversed the string 
				break;
				
			case 5 : 
				System.out.print("Enter a character that you wish to change : ");
				char changeChar = input.next().charAt(0);
				System.out.print("Enter a new character : ");
				char newChar = input.next().charAt(0);
				String replace = replaceChar(str, changeChar,  newChar); //call replace method to replaced the character
				System.out.println("The new string is : " + replace);
				break;
				
			case 6 : 
				System.out.print("Enter any character you wish to delete : ");
				char delChar = input.next().charAt(0);
				String newDelChar = deleteChar(str, delChar); //call deleteChar method to delete character
				System.out.println("The new string is " + newDelChar);
				break;
				
			case 7 : 
				System.out.print("Enter any character you wish to add : ");
				char endChar = input.next().charAt(0);
				String addChar = addChar(str, endChar); //call addChar method to delete any character
				System.out.println("The new string is : " + addChar); 
				break;
			
			}
		System.out.println();
		option = menu();
		}
		System.out.print("Quit");
		input.close();
	}

}
