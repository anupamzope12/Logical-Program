package Array;

public class TwoDArray1 {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{5,0,1}};
	int sum1=0;
	int sum2=0;
	for(int i=0;i<arr[0].length;i++)
	{
		sum1=sum1+arr[0][i];
	}
	
	for(int j=0;j<arr[1].length;j++) {
		sum2=sum2+arr[0][j];

	}
	System.out.println(sum1);
	System.out.println(sum2);
	if(sum1==sum2) {
		System.out.println("Yes..");
	}
  }
}