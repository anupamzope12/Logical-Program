package Array;

public class FIndParisIntheArrayWIththeGivenSum {
	public static void main(String[] args) {
		
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=11;
	
	for(int i=0 ;i<arr.length;i++){
		for(int j=i+1 ; j<arr.length ; j++) {
			if(arr[i]+arr[j]==sum) {
				System.out.println( "pair  " + arr[i] + " "+ " "+arr[j]);
//				System.out.println(?);
			}
//			else {
//				System.out.println("pair not found");
//			}
		}
	}
	
	}
}
