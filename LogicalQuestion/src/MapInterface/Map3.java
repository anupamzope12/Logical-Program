package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map3 {
public static void main(String[] args) {
	Map map=new HashMap();
	map.put(1, "Anupam");
	map.put(2, "rahul");
	map.put(3, "lalit");
	map.put(null, null);
	map.put(1, null);
	//map.put(1, "akl");
	//Traversing Map
	
	Set set=map.entrySet();//Converting to set so that we can traverse
	Iterator itr=set.iterator();
	while(itr.hasNext()) {
		Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());;
	}
}
}
