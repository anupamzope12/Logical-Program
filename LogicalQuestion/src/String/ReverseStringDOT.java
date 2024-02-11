package String;

import java.util.HashSet;
import java.util.Set;

public class ReverseStringDOT {
	public static void main(String[] args) {
		String []s={"abc.def.ghi"};
//		char []ch=s.toCharArray();
		for(int i=s.length-1 ;i>=0 ; i--) {

			while(s[i]==".")
			{
				Set set= new HashSet();
				set.add(s[i]);
				System.out.println(set);
				
				
			}
		}
		System.out.println("456");
	}

}
