package leetecodeInteger;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
public static void main(String[] args) {
//	[2,3,5,1,3]?
	int candies[]= {2,3,5,1,3};
	int extraCandies=3;
	System.out.println(kidsWithCandies(candies, extraCandies));;
	
}
public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	{
		List<Boolean> result=new ArrayList<Boolean>();

		int maxcand=0;
		for(int can:candies) {
			maxcand=Math.max(can+extraCandies, maxcand);
		}
		System.out.println(maxcand);
		
//List<Boolean> result=new ArrayList<Boolean>();
	
for(int j=0;j<candies.length;j++) {
		int each=0;
		each=candies[j]+extraCandies;
		if(each==maxcand) {
			result.add(true);
		}else {
		result.add(false);	
		}
	}
	return result;
   }
  }
}