package HashMap;

import java.util.HashMap;

public class Emp1 {
public static void main(String[] args) {
	HashMap <Integer,String> map=new HashMap<>();
	map.put(null, "one");
	map.put(null, "null");
	map.put(5, "Two");
	map.put(2, "one");
	map.put(4, "Four");
	map.putIfAbsent(4, "five");
	map.put(4, "five");

	System.out.println(map);
	System.out.println("------");
	
	map.remove(2);
	
	System.out.println(map.toString());
	
	
	}
}