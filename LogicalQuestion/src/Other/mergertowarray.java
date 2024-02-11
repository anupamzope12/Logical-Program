package Other;

public class mergertowarray {

	public static void main(String[] args) {
		int a1[]= {10,20,30,40,50,60};
		int b1[]= {70,80,90,100};
		
		int a=a1.length;
		int b=b1.length;
		int c1[]=new int [a+b];		
		
		for(int i=0 ;i<a1.length;i++) {
			c1[i]=a1[i];
		}
		
		for(int j=0 ; j<b1.length ; j++) {
			c1[a+j]=b1[j];
		}
		
		for(int i=0 ;i<c1.length ; i++) {
			System.out.print(c1[i] +" ");
		}
		
	}
}
