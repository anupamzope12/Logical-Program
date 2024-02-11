package GFG;
public class Subarraywith0sum {
    public static void main(String[] args) {
    	int arr[]= {10,-5,-5,3,80};
    	for(int i=0 ;i<arr.length ;i++) {
//    		System.out.println("/");
    		for(int j=i ; j<arr.length ;j++)
    		{
    			int sum=0;
    			for(int k=i ; k<=j ;k++) {
    				sum =sum+arr[k];
    			}
    			if(sum==0) {
    				for(int k=i ; k<=j ;k++) {
        				System.out.print(arr[k] + " ");
        			}	 
    				System.out.println();

    			}
    		}	
    	}
    	
   }
}
