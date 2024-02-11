package Array;
import java.util.Arrays;
public class SubarrayOfArray {
	public static void main(String[] args) {
	
		char [] ch= {'a','b','c','d'};
		for(int i=0 ;i<ch.length ;i++) {
			for(int j=i ;j<ch.length ;j++) {
				System.out.print("[");
				for(int k=i ;k<=j ;k++) {
//					int sum1=ch[k] + 
					
					System.out.print(ch[k]);
					if(k<j) {
						System.out.print(",");
					}
				}
				System.out.print("]");
				System.out.println();
			}
		}
	}
}