package GFG;

public class SubArryasWithWEquals0And1 {
	public static void main(String[] args) {
		int [] arr1= {0,1,0,1,0};
		for(int i=0 ;i<arr1.length;i++)
		{
			for(int j=i ; j<arr1.length;j++) {
				System.out.print("[");
				for(int k=i ; k<=j ; k++) {
					if(arr1[k]==0 || arr1[k]==1)
					System.out.print(arr1[k]);
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