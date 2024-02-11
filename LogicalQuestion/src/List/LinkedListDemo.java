package List;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> animals=new LinkedList<String>();
	animals.add("dog");
	animals.add("cat");
	animals.add("piggy");
	animals.add("gadha");
	animals.add("dukar");
	
	System.out.println(animals.size());
	System.out.println(animals);
	animals.add("lion");
	System.out.println(animals);
	
	}
}
