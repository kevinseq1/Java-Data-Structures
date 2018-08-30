package ArrayStack;

public class Person {

	//Data Members
	private String name;
	private int age;
	
	//Constructors
	public Person(String initName, int initAge) {
		name = initName;
		age = initAge;
	}

	//Methods
	
	//Gets the name of the person.
	public String getName() {
		return name;
	}

	//Sets the name of the person.
	public void setName(String name) {
		this.name = name;
	}

	//Gets the age of the person.
	public int getAge() {
		return age;
	}

	//Sets the age of the person.
	public void setAge(int age) {
		this.age = age;
	}
	
	//Helps to print.
	public String toString() {
		String result = "";
		result = result + getName() + " " + getAge();
		return result;
	}
	
	

}
