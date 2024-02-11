package MapInterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Map5 {
public static void main(String[] args) {
	
	Map <Integer,String> map=new HashMap<>();
	map.put(1, "Anupam");
	map.put(2, "anmmls");
	map.put(3, "sff");
	map.put(4, "sddd");
	
	map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

	}
}
