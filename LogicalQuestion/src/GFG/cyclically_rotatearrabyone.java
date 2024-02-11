package GFG;

import java.util.Arrays;

public class cyclically_rotatearrabyone {
	static int [] arr= {1,2,3,4,5,6};
	
	public static void rotate() {
		int lastele=arr[arr.length-1];
		int i;
	        for (i = arr.length - 1; i > 0; i--)
	            arr[i] = arr[i - 1];
	        arr[0] = lastele;
	}
	
	
public static void main(String[] args) {
		
		System.out.println(Arrays.toString(arr));
		rotate();
		System.out.println(Arrays.toString(arr));
	}
}
