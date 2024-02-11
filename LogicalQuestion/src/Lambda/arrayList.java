package Lambda;

import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {
		ArrayList <Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(45);
		arrlist.add(89);
		arrlist.add(21);
		arrlist.add(32);
		arrlist.forEach(i->System.out.println(i));
	}
}
