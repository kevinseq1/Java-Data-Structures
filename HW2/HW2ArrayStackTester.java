package HW2;

import java.util.Scanner;



public class HW2ArrayStackTester {

	public static void main(String[] args) {
		
		//Variables
		int openPren = 0;
		int openCurl = 0;
		int openBrac = 0;
		int openCarr = 0;
		int	closedPren = 0;
		int closedCurl = 0;
		int closedBrac = 0;
		int closedCarr = 0;
		
		
		//Asks the user for an expression.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Expression and then press enter: ");
		String n = input.next();
		int charSize = n.length();
		
		
		//Creates two stacks.
		HW2ArrayStack openStack = new HW2ArrayStack(charSize);
		HW2ArrayStack closedStack = new HW2ArrayStack(charSize);
		
		//Check to see if each of the character in the array matches any of the cases.
		try {
			char ch;
			for(int i=0; i<n.length(); i++) {
				ch = n.charAt(i);
				switch (ch){
			    	case '(': openStack.push(Character.toString(ch));
			    			  openPren++;
			    			  break;
			    	case '{': openStack.push(Character.toString(ch));
			    			  openCurl++;
			    			  break;
			    	case '[': openStack.push(Character.toString(ch));
			    			  openBrac++;
			    			  break;
			    	case '<': openStack.push(Character.toString(ch));
			    			  openCarr++;
			    			  break;
			    	case ')': closedStack.push(Character.toString(ch));
			    			  closedPren++;
			    			  break;
			    	case '}': closedStack.push(Character.toString(ch));
			    			  closedCurl++;
			    			  break;
			    	case ']': closedStack.push(Character.toString(ch));
			    		      closedBrac++;
			    			  break;
			    	case '>': closedStack.push(Character.toString(ch));
			    			  closedCarr++;
			    			  break;
				}
			}
		} catch(StackOverFlowException e) {
			System.out.println(e.getMessage());
		} 
		
		//Checks to see if the size of both the stack is equal and if the opens are equal to the closed.
		if((openStack.size() == 0) && (closedStack.size() == 0)) {
			System.out.println("The string you entered does not contain any brackets.");
		} else if((openStack.size() == closedStack.size()) && (openPren == closedPren) && (openCurl == closedCurl) && (openBrac == closedBrac) && (openCarr == closedCarr)) {
			System.out.println("The string you entered is balanced.");
		} else {
			System.out.println("The string you entered is unbalanced.");
		}
		
		
		input.close();
	}
}
