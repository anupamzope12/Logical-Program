package AlphaSense;
import java.util.HashSet;
import java.util.Set;

public class ReturnSumOfUniqueInteger {
	public static void main(String[] args) {
		String input= "1,2,3,4,1,2";
	System.out.println(SumOfUniqueNumber(input));
	}
	
	public static int SumOfUniqueNumber(String input) {
		int sum=0;
		String [] str=input.split(",");
		Set<Integer>hs=new HashSet<>();
		for(String m : str) {
			hs.add(Integer.parseInt(m));
		}
		System.out.println("hashset element" + hs);
		for(int i:hs) {
			sum=sum+i;
		}
		System.out.println(sum);
		return sum;	
	}
}