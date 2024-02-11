package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sum_Array1 {
	public static void main(String[] args) {
		
	
	int arr[] = {8,8,5,5,4};
	
	int sum1=Arrays.stream(arr).sum();
	System.out.println("sum1 " + sum1);
	
	int sum2=IntStream.of(arr).sum();
	System.out.println("sum2 " + sum2);
	
	int sum3=Arrays.stream(arr).reduce((x,y)-> x+y).getAsInt();
	System.out.println("sum3 " + sum3);
	
	int sum4=Arrays.stream(arr).reduce(Integer::sum).getAsInt();
	System.out.println("sum4 " + sum4);
	
	long sum5=Arrays.stream(arr).summaryStatistics().getSum();
	System.out.println("sum5 " + sum5);
	
	}
}
