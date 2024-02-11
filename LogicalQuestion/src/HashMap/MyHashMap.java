package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
	public static void main(String[] args) {
		HashMap <String,Integer> hsmap=new HashMap();
		hsmap.put("Anupam", 1);
		hsmap.put("Anupam", 2);
		hsmap.put("anupam", 3);
		hsmap.put("Anupam", 1);
		hsmap.put("Anupam", 4);
		hsmap.put("sonu", 6);
		System.out.println(hsmap.getClass());;
//		System.out.println("///////////////////");
System.out.println("a");
		System.out.println(hsmap.getOrDefault("sonu", 5));;
		System.out.println();
System.out.println("b");	
System.out.println();//System.out.println("///////////////////");
		System.out.println(hsmap.getOrDefault("sonu", 6));;
System.out.println("c"); System.out.println();		//System.out.println("///////////////////");
		System.out.println(hsmap.containsValue(4));;
System.out.println("d");System.out.println();		//System.out.println("///////////////////");
		System.out.println(hsmap.get("Anupam"));
System.out.println("e");System.out.println();		//System.out.println("///////////////////");
		System.out.println("///////////////////");
		if(hsmap.containsKey("Anupam")) {
			Integer a=hsmap.get("sonu");
System.out.println("f");System.out.println();//			System.out.println(a);
		}
		System.out.println("g");//System.out.println("///////////////////");

		System.out.println(hsmap.toString());;
	}

}
