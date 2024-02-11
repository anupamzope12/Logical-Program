package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Has {
	public static void main(String[] args) {
		HashSet<Integer>hs=new HashSet<>();
		hs.add(32);
		hs.add(54);
		hs.add(23);
		hs.add(89);
		hs.add(56);
		System.out.println(hs.size());
		System.out.println(hs);
		
		for(int i:hs) {
			System.out.println(i);
		}
		
		hs.remove(56);
		System.out.println(hs);
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(hs.add(89));
		System.out.println(hs.contains(54)+" ====="+ hs.contains(56));;
		
	}
}
