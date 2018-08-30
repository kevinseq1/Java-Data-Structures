package ArrayStack;

public class StackTester {

	public static void main(String[] args) {
		
		//Creating objects of the Array Stack.
		ArrayStack<String> as1 = new ArrayStack<>();
		ArrayStack<Integer> as2 = new ArrayStack<>();
		ArrayStack<Person> as3 = new ArrayStack<>();
		
		//Testing the String Stack
		try {
			
			as1.push("Jim");
			as1.push("Kelly");
			as1.push("Creed");
			
			
			as1.pop();
			
			System.out.println("The top most element in the stack is: " + as1.top());
			
			System.out.println("Is the stack full: " + as1.isFull());
			System.out.println("Is the stack empty: "+ as1.isEmpty());
			
		} catch(StackOverFlowException e) {
			System.out.println(e.getMessage());
		} catch(StackUnderFlowException e) {
			System.out.println(e.getMessage());
		}
		
		//Testing the Integer Stack
		try {
					
			as2.push(65);
			as2.push(43);
			as2.push(654);
					
			as2.pop();
			as2.pop();
				
			System.out.println("The top most element in the stack is: " + as2.top());
					
			System.out.println("Is the stack full: " + as2.isFull());
			System.out.println("Is the stack empty: "+ as2.isEmpty());
					
		} catch(StackOverFlowException e) {
					System.out.println(e.getMessage());
		} catch(StackUnderFlowException e) {
				System.out.println(e.getMessage());
		}
		
		//Testing the Integer Stack
		try {
							
			Person p1 = new Person("Jordan", 12);
			Person p2 = new Person("Pirlo", 42);
			Person p3 = new Person("Tony", 30);
			
			as3.push(p1);
			as3.push(p2);
			as3.push(p3);
			
							
						
			System.out.println("The top most element in the stack is: " + as3.top());
							
			System.out.println("Is the stack full: " + as3.isFull());
			System.out.println("Is the stack empty: "+ as3.isEmpty());
							
		} catch(StackOverFlowException e) {
			System.out.println(e.getMessage());
		} catch(StackUnderFlowException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
