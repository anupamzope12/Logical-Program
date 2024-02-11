package NaturalSort_CustomSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VideoNo1 {
	public static void main(String[] args) {
	List<Integer>ls=new ArrayList<>();
	ls.add(45);
	ls.add(98);
	ls.add(12);
	ls.add(78);
	ls.add(1);
	for(int in:ls) {
		System.out.print(in +  "  " );
	}
	System.out.println();
	Collections.sort(ls);
	System.out.println("After sorting");
	for(int in:ls) {
		System.out.print(in + "  " );
	}
	}
}