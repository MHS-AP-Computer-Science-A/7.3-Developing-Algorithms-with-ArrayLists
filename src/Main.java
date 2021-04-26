

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Creating an ArrayList of integer
		ArrayList<Integer> list = new ArrayList<Integer>();		
		
		//Add some elements to the end of the ArrayList
		list.add(10);
		list.add(15);
	
		//Create an IndexOutOfBounds Exception
		//list.add(10, 5);
		
		//Declaring an untyped ArrayList
		ArrayList list2 = new ArrayList();
		
		//We can add anything that is an object
		list2.add("Hello"); //String
		list2.add("Java");  //String
		list2.add(5);       //Integer
		//And the types can be mixed
		
		System.out.println(list2);
		
		//But this can create extra work if you want to use
		//the objects in the list
		
		//String result = list2.get(0).substring(0, 1);
		
		//In this case Java does not know list.get(0) is a String
		//so substring cannot be called
		
		//But we can use a typecast to tell Java it is a String
		String result = ((String)list2.get(0)).substring(0, 1);
		//It's just more effort so we usually just declare
		//the list with a type unless we really need it to be
		//mixed
		
		
		//The remove method returns the value being removed
		list2.add(0, list2.remove(2));
		System.out.println(list2);
		
		//The set method returns the previous value
		list2.add(list2.set(0, 10));
		System.out.println(list2);
		
		list2.set(0, list2.set(2, "World"));
		
	}
}
