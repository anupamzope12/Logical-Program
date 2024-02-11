package Array;

import java.util.HashSet;

public class MissingNoFromArray {
	public static void main(String[] args) {
		Integer [] a= {1,5,8,9,7,0};
		findmissingnumber(a);
		
	}
	
	public static void findmissingnumber(Integer [] arr) 
	{
			HashSet<Integer> set=new HashSet<Integer>();
			for(int a:arr) {
				set.add(a);
			}
			int n=arr.length+1;
			for(int i=0 ;i<n ; i++) {
				if(!set.contains(i))
				{
					System.out.print( i +" ");
				}
			}
	}
}