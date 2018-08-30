package ArrayQueue;
import ArrayStack.Person;

public class ArrayBoundedQueueTester {


	public static void main(String[] args) {
		ArrayBoundedQueue<Integer> abq1 = new ArrayBoundedQueue<>();
		ArrayBoundedQueue<String> abq2 = new ArrayBoundedQueue<>();
		ArrayBoundedQueue<Person> abq3 = new ArrayBoundedQueue<>(4);
		
		//Inserting and Removing integers from the queue.
		try {
			abq1.enqueue(34);
			abq1.enqueue(55);
			abq1.enqueue(66);
			abq1.enqueue(77);
			abq1.enqueue(8);
			
		} catch (QueueOverFlowException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(abq1.dequeue());
			System.out.println(abq1.dequeue());
			System.out.println(abq1.dequeue());
			System.out.println(abq1.dequeue());
			System.out.println(abq1.dequeue());
			System.out.println(abq1.dequeue()); 
			
		} catch (QueueUnderFlowException e) {
			System.out.println(e.getMessage());
		}
		
		//Inserts and removing Strings from the queue;
		try {
			abq2.enqueue("Joey");
			abq2.enqueue("Ross");
			abq2.enqueue("Phoebe");
			abq2.enqueue("Rachel");
			abq2.enqueue("Monica");
			
		} catch (QueueOverFlowException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(abq2.dequeue());
			System.out.println(abq2.dequeue());
			System.out.println(abq2.dequeue());
			System.out.println(abq2.dequeue());
			System.out.println(abq2.dequeue());
			System.out.println(abq2.dequeue()); 
			
		} catch (QueueUnderFlowException e) {
			System.out.println(e.getMessage());
		}
		
		//Inserts and removing Persons from the queue;
		try {
			Person p1 = new Person("Joey",34);
			Person p2 = new Person("Ross",36);
			Person p3 = new Person("Phoebe",30);
			Person p4 = new Person("Rachel",33);
			Person p5 = new Person("Monica",31);
			
			abq3.enqueue(p1);
			abq3.enqueue(p2);
			abq3.enqueue(p3);
			abq3.enqueue(p4);
			abq3.enqueue(p5);
			
		} catch (QueueOverFlowException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(abq3.dequeue());
			System.out.println(abq3.dequeue());
			System.out.println(abq3.dequeue());
			System.out.println(abq3.dequeue());
			System.out.println(abq3.dequeue());
			System.out.println(abq3.dequeue()); 
			
		} catch (QueueUnderFlowException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
