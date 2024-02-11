package HashMap;

import java.util.HashMap;

public class EmpMap {
public static void main(String[] args) {
	
	HashMap <String ,Integer> hsmap=new HashMap<>();
	
	hsmap.put("Deepak", 10);
	hsmap.put("Anupam", 20);
	hsmap.put("Vaibhav", 30);
	hsmap.put("virendra",40);
	hsmap.put("Vaibhav", 50);
	
	System.out.println(hsmap);
	System.out.println("Size of map is : " + hsmap.size());
	
	Integer a = null;
	if(hsmap.containsKey("Deepak")) {
		 a=hsmap.get("Deepak");
	}
	System.out.println(a);
	System.out.println(hsmap.containsValue(20));
	System.out.println(hsmap.remove("Deepak"));
System.out.println(hsmap.size());
	
	}
}
