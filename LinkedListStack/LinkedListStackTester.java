package LinkedListStack;



public class LinkedListStackTester {

	public static void main(String[] args) {
		
		//Create an object of Linked List Stack
		LinkedListStack<String> lls = new LinkedListStack<String>();
		
		try {
			
			lls.push("France");
			lls.push("Russia");
			lls.push("England");
			lls.push("Canada");
			
			
			
			
			System.out.println("The top most element in the Linked List stack is: " + lls.top());
			System.out.println("Is the Linked List stack empty: "+ lls.isEmpty());
			
			lls.printStackOrdered();
			lls.printStackReversed();
			
		}  catch(StackUnderFlowException e) {
			System.out.println(e.getMessage());
		}

	}

}
