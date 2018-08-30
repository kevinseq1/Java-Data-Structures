package ArrayQueue;

import ArrayStack.Person;

public class ArrayUnboundedQueueTester {

	public static void main(String[] args) {
		
		ArrayUnboundedQueue<Integer> abq1 = new ArrayUnboundedQueue<>();
		ArrayUnboundedQueue<String> abq2 = new ArrayUnboundedQueue<>();
		ArrayUnboundedQueue<Person> abq3 = new ArrayUnboundedQueue<>();
		
		//Inserting and Removing integers from the queue.
		
			abq1.enqueue(34);
			abq1.enqueue(55);
			abq1.enqueue(66);
			abq1.enqueue(77);
			abq1.enqueue(8);
			abq1.enqueue(34);
			abq1.enqueue(55);
			abq1.enqueue(66);
			abq1.enqueue(77);
			abq1.enqueue(8);
			abq1.enqueue(34);
			abq1.enqueue(55);
			abq1.enqueue(66);
			abq1.enqueue(77);
			abq1.enqueue(8);
			abq1.enqueue(34);
			abq1.enqueue(55);
			abq1.enqueue(66);
			abq1.enqueue(77);
			abq1.enqueue(8);
		
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

			abq2.enqueue("Joey");
			abq2.enqueue("Ross");
			abq2.enqueue("Phoebe");
			abq2.enqueue("Rachel");
			abq2.enqueue("Monica");
		
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
