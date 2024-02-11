package sort;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerList {
	public static void main(String[] args) {
		ArrayList<Integer> intlist=new ArrayList<Integer>();
		
		intlist.add(54);
		intlist.add(12);
		intlist.add(89);
		intlist.add(10);
		intlist.add(1);
		intlist.add(1);
		intlist.add(12);
		intlist.add(00);
		intlist.add(00);
		intlist.add(1);
		System.out.println("before sorting");
		SortUtils.printlist(intlist);
		
		System.out.println("After sorting");
		Collections.sort(intlist);
		SortUtils.printlist(intlist);
	}
}