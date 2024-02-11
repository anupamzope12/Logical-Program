package MapInterface;
import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> hm  = new HashMap<String, Integer>(); 
        	hm.put(" ", new Integer(54));
        	hm.put(" ", new Integer(87));
        	hm.put("c", new Integer(98));
        	hm.put("d", new Integer(65));
        	hm.put("e", new Integer(23));
        	hm.put("f", new Integer(45));
        	hm.put("g", new Integer(87));
        	hm.put("h", new Integer(83));
        	
            System.out.println(	hm.entrySet());;
            System.out.println("=======================");
            for(Map.Entry<String, Integer>hm1:hm.entrySet()) {
            	System.out.println(hm1);
            	System.out.println("[][][][][][][][]");
                System.out.println("=======================");
                System.out.print(hm1.getKey());
                System.out.println(hm1.getValue());
            }
    }
}
