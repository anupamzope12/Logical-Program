package leetecodeInteger;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int arr[]= {1,9,9};
		PlusOne p=new PlusOne();
		int [] l=p.plusOne(arr) ;
		System.out.println(Arrays.toString(l));;
	}
	    public int[] plusOne(int[] digits) {
	        for (int i = digits.length - 1; i >= 0; i--) {
		if (digits[i] < 9) {
			digits[i]++;
			return digits;
		}
		digits[i] = 0;
	}
	digits = new int[digits.length + 1];
	digits[0] = 1;
	return digits;	        
	    }
	}