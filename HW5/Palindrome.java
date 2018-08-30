package HW5;

public class Palindrome {

	//Return true if the userInput is a palindrome, false otherwise.
	public static boolean check(String userInput) {
		
		char ch;
		char fromStack;
		char fromQueue;
		int length;
		int numLetters = 0;
		int charCount = 0;
		boolean isStillPalindrome = true;
		
		//Assigns the lenght of the user input to the lenght variable.
		length = userInput.length();
		StackInterface<Character> stack = new ArrayStack<Character>(length); //Creates a stack object.
		QueueInterface<Character> queue = new ArrayQueue<Character>(length); //Creates a queue object.
		
		//Iterates through the string and inserts the characters into the stack and the queue.
		for(int i=0; i < length; i++) {
			ch = userInput.charAt(i);
			if(Character.isLetter(ch)) {
				numLetters++;
				ch = Character.toLowerCase(ch);
				try {
					stack.push(ch);
					queue.enqueue(ch);
				} catch (OverflowException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		//Removes the element from the stack and the queue as long as it is still a palindrome and the character count is less than the number of letters.
		while(isStillPalindrome && (charCount < numLetters)) {
			try {
				fromStack = stack.top();
				stack.pop();
				fromQueue = queue.dequeue();
				if(fromStack != fromQueue) {
					isStillPalindrome = false;
				}
				charCount++;
			} catch (UnderflowException e) {
				System.out.println(e.getMessage());
			}
		}
		return isStillPalindrome;
	}
	
}
