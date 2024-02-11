package hashSet;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<String>();
		String [] names= {"shubham","riya","meera","ram","riya","ankit"};
		for(String s:names) {
			System.out.println("Added " + ls.add(s));
		}
		System.out.println(ls.toString());
		System.out.println(ls);
		
//		TreeSet<String>ts=new TreeSet<>(new Comparator<String>() {
//			@Override
//			public int compare(String o1 , String o2) {	
//				return o2.compareTo(o1);
//			}
//		});
		TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}			
		});
		System.out.println("Sorted set " + ts);
		ts.addAll(ls);
		System.out.println("Sorted Set " + ts);
	}
}