package Array;

public class StringLogArrayTester {

	public static void main(String[] args) {
		
		//Creates and object of type StringLogArray.
		StringLogArray a1 = new StringLogArray("Actors",5);
		
		//Using the insert method to insert elements in the array.
		a1.insert("Jim");
		a1.insert("Kelly");
		a1.insert("Toby");
		a1.insert("Pam");
		a1.insert("Dwight");
		
	    //Using the delete method to delete elements from the array.
		a1.delete("jim");
		a1.delete("pam");
		
		//Print statements.
		System.out.println(a1.toString());
		System.out.println(a1.isFull());
		System.out.println(a1.size());
				
	}
}
