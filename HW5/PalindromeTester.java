package HW5;

import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {
		
		//Asks the input for a string and assigns it to inputByUser.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputByUser = input.nextLine();
			
		//Checks if the method is true.
		if(Palindrome.check(inputByUser)) {
			System.out.println("The string entered is a palindrome.");
		} else {
			System.out.println("The string entered is not a palindrome.");
		}
			
		input.close();
	}

}
