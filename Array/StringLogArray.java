package Array;

public class StringLogArray implements StringLogInterface {
	
	//Data Members
	private int lastIndex;  //Last Index of the Array.
	private String base[];	//Declaring an array.
	private String arrayName; //Declaring the array name;
	
	//Constructors
	public StringLogArray(String initName) {
		lastIndex = -1; //Initializes the last index to -1.
		arrayName = initName; //Initializes the array name with the value passed in the constructor argument.
		base = new String[100]; //Initializes the array size to 100.
	}
	
	public StringLogArray(String initName, int maxSize) {
		lastIndex = -1; //Initializes the last index to -1.
		arrayName = initName; //Initializes the array name with the value passed in the constructor argument.
		base = new String[maxSize]; //Initializes the array size with the value passed in the costructor argument.
	}
	
	//Methods
	
//	This method checks if an item exists in the array.
	public boolean contains(String targetItem) {
		for(int i=0; i<=lastIndex; i++) {
			if(base[i].equalsIgnoreCase(targetItem)) {
				return true;
			}
		}
		return false;
	}

//	This method inserts a new item in the array.
	public void insert(String newItem) {
		if(!contains(newItem)) {
			base[lastIndex+1] = newItem;
			lastIndex++;
		}
	}

//	This method delets an item from the array and rearranges all the elements.
	public boolean delete(String targetItem) {
		for(int i=0; i<=lastIndex; i++) {
			if(base[i].equalsIgnoreCase(targetItem)) {
				if(i == lastIndex) {
					base[i] = null;
					lastIndex--;
				} else {
					for(int j=i; j<lastIndex; j++) {
						base[j] = base[j+1];
					}
				 lastIndex--;
				}	
			}
		}
		return false;
	}
	
	
//	This method checks if the array is full.
	public boolean isFull() {
		return lastIndex == (base.length-1);
	}

//	This method returns the size of the array.
	public int size() {
		return lastIndex+1;
	}

//	This method clears all the elements of the array.
	public void clear() {
		for(int i=0; i<=lastIndex; i++) {
			base[i] = null;
		}
		lastIndex = -1;
	}

//	This method returns the name of the array.
	public String getName() {
		return arrayName;
	}
	
//	This method prints out the array.(not prints!! but is used with the print statement)
	public String toString() {
		String result = "Log: " + arrayName + "\n\n";
		for(int i=0; i<=lastIndex; i++) {
			result += (i+1) + ". " + base[i] + "\n";
		}
		return result;
	}

}
