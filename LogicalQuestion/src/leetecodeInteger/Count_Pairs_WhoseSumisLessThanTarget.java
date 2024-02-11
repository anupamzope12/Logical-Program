package leetecodeInteger;
import java.util.Arrays;
import java.util.List;

public class Count_Pairs_WhoseSumisLessThanTarget {
	public static void main(String[] args) {
		List <Integer>ls=Arrays.asList(-1,1,2,3,1) ;
		int target=2;
		System.out.println(countPairs(ls, target));;
	}
	public static int countPairs(List<Integer> nums, int target) 
	{
		int count=0;
		for(int i=0;i<nums.size()-1;i++) {
			for(int j=1;j<nums.size();j++) {
				if(nums.get(i)+nums.get(j)<target) {
					count++;
				}
			}
		}
		return count;       
    }
}