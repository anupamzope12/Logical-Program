package Array;

public class Merge_Two_Arrays_Into_One {
	public static void main(String[] args) {
		
	
	int a[]= {10,20,30};
	int b[]= {40,50,60,70,80,90,100};
	
	int a1=a.length;
	int b1=b.length;
	
	int c1=a1+b1;
	
	int [] c = new int [c1];
	
	for(int i=0; i<a1 ; i=i+1)
	{
		c[i]=a[i];
	}
	
	for(int i=0 ; i<b1 ; i=i+1)
	{
		c[a1 + i] = b[i];
	}
	for(int i=0 ; i<c1 ; i++) {
		System.out.println(c[i]);
	}
  }
}	