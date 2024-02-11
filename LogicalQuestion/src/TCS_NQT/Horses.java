package TCS_NQT;

public class Horses {
	public static void main(String[] args) {
		int arr[]= {10,20,30,60,70,80,20,50};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<j;k++) {
					int a=arr[k]+arr[k+1];
					//if(a<100) {
						System.out.print(arr[k]);
					//}
				}	
			}
			System.out.println();

		}
		System.out.println();

	}
}
