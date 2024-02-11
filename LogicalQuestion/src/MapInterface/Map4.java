package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Map4 {
public static void main(String[] args) {
	
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "anupam");
	map.put(2, "anupam");
	map.put(3, "anupam");
	map.put(4, "mlsk");
	map.put(5, "asaas");
	map.put(1, "kjl");
	//elements can traverse in any order
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+ m.getValue());;
	}		
   }
}