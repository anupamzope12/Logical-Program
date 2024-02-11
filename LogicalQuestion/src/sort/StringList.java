package sort;

import java.util.ArrayList;
import java.util.Collections;

public class StringList {
	public static void main(String[] args) {
		ArrayList<String> stringlist=new ArrayList<>();
		
		stringlist.add("anupam");
		stringlist.add("rushikesh");
		stringlist.add("pooja");
		stringlist.add("aryan");
		stringlist.add("piyush");

		System.out.println("before sorting");
		
		SortUtils.printlist(stringlist);
		System.out.println("After sorting");
		Collections.sort(stringlist);
		SortUtils.printlist(stringlist);
	}
}
