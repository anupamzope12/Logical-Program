package hashSet;

import java.util.HashSet;

public class Empset {
public static void main(String[] args) {
	
	Emp e1=new Emp("deepak",101,"jalgaon");
	Emp e2=new Emp("Anupam",102,"bhusawal");
	Emp e3=new Emp("virendra",101,"indore");
	
	HashSet<Emp> empSet=new HashSet<>();
	
	System.out.println("Added" + empSet.add(e1));
	System.out.println("Added" + empSet.add(e2));
	System.out.println("Added" + empSet.add(e3));
	
	for(Emp e : empSet) {
		System.out.println(e);
	}
	System.out.println(e1.hashCode());;
	System.out.println(e2.hashCode());;
	System.out.println(e3.hashCode());;
	System.out.println(e1.equals(e2));;
	System.out.println(e1.equals(e3));;
	System.out.println(e2.equals(e3));;

}
}
