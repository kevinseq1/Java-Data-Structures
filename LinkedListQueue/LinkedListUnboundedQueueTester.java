package LinkedListQueue;

import ArrayStack.Person;

public class LinkedListUnboundedQueueTester {

	public static void main(String[] args) {
		
		LinkedListUnboundedQueue<Integer> llubq1 = new LinkedListUnboundedQueue<>();
		LinkedListUnboundedQueue<String> llubq2 = new LinkedListUnboundedQueue<>();
		LinkedListUnboundedQueue<Person> llubq3 = new LinkedListUnboundedQueue<>();
		
		
		//Inserting and Removing integers from the queue.
	
					llubq1.enqueue(34);
					llubq1.enqueue(55);
					llubq1.enqueue(66);

					
				
				try {
					System.out.println(llubq1.dequeue());
					System.out.println(llubq1.dequeue());
					System.out.println(llubq1.dequeue());
	
				} catch (QueueUnderFlowException e) {
					System.out.println(e.getMessage());
				}
				

					llubq2.enqueue("Hello");
					llubq2.enqueue("Apple");
					llubq2.enqueue("World");
					llubq2.enqueue("Breaking Bad");
					llubq2.enqueue("Sacred Games");

				try {
					System.out.println(llubq2.dequeue());
					System.out.println(llubq2.dequeue());
					System.out.println(llubq2.dequeue());
					System.out.println(llubq2.dequeue());
					System.out.println(llubq2.dequeue());
					
				} catch (QueueUnderFlowException e) {
					System.out.println(e.getMessage());
				}
				
				//Inserts and removing Persons from the queue;

					Person p1 = new Person("Joey",34);
					Person p2 = new Person("Ross",36);
					Person p3 = new Person("Phoebe",30);
					Person p4 = new Person("Rachel",33);
					Person p5 = new Person("Monica",31);
					
					llubq3.enqueue(p1);
					llubq3.enqueue(p2);
					llubq3.enqueue(p3);
					llubq3.enqueue(p4);
					llubq3.enqueue(p5);

				
				try {
					System.out.println(llubq3.dequeue());
					System.out.println(llubq3.dequeue());
					System.out.println(llubq3.dequeue());
					System.out.println(llubq3.dequeue());
					System.out.println(llubq3.dequeue());

				} catch (QueueUnderFlowException e) {
					System.out.println(e.getMessage());
				}
		
	}
}
