package List;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(12);
	al.add(23);
	al.add(13);
	al.add(32);
	al.add(54);
	
	System.out.println(al);
	System.out.println(al.size());
	
	al.add(89);
	System.out.println(al);
	System.out.println(al.size());
	 
	al.add(2,22);
	System.out.println(al);
	System.out.println(al.size());
	
	al.remove(0);
	System.out.println(al);
	System.out.println(al.size());
	
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	
	for(int v:al) {
		System.out.println(v);
	}
	
	System.out.println(al.contains(32));
	
	ArrayList<Integer>al1=new ArrayList<Integer>(al);
	System.out.println(al1);
	}
}
