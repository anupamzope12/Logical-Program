package Array;

public class TwoD1Array {
public static void main(String[] args) {
	int arr[][]= {{1,2,3} , {3,2,1}};
	int element=arr[1][0];
	System.out.println("element at [1][0] = " + element);
	System.out.println();
	
	for(int i=0;i<arr.length;i++) {
		int rowsum=0;
		for(int j=0;j<arr[i].length;j++) {
			rowsum=rowsum+arr[i][j];
		}
		System.out.println("sum of row" + i +" " + rowsum);
		System.out.println();
	}
	int sum=0;
	int a[]= {1,2,3,5};
	for(int i=0;i<a.length;i++) {
		sum+= a[i];
	}
	System.out.println(sum);
	}
}