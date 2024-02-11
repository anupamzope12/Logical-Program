package Array;

public class Missing_nofromArray {
	public static void main(String[] args) {
		int [] arr= {1,2,3,5};
		int N=5;
		int Sumofnatele = N*(N+1)/2;
		int sum=0;
		for(int i=0 ; i<arr.length ; i++) {
			 sum = sum+arr[i] ;
			
		}
		System.out.println(Sumofnatele);
		System.out.println(sum);
		System.out.println(Sumofnatele-sum);
	}
}
