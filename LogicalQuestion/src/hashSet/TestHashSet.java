package hashSet;

import java.util.HashSet;

public class TestHashSet {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<>();
	String []names= {"Anupam" ,"Deepak","Virendra","asbdg","ksdkjas"};
	
	for(String s:names) {
		System.out.println("Addesd " + hs.add(s));
	}
	
	System.out.println("HS contents " + hs);;
	System.out.println("HS contents " + hs.contains("Deepak"));;
	System.out.println("HS contents " + hs.remove("Deepak"));;
	System.out.println();
	System.out.println("HS contents " + hs.contains("Deepak"));;
	System.out.println("HS contents " + hs);
	
  }
}
