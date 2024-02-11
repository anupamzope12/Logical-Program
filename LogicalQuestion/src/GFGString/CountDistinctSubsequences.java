package GFGString;

public class CountDistinctSubsequences {
	public static void main(String[] args) {
		
	
	String str="gfgfsd";
	char []ch=str.toCharArray();
	int count=0;
	for(int i=0 ;i<ch.length;i++)
	{
		
		for(int j=i ; j<ch.length ;j++) {
			System.out.print(count + " ");
			for(int k=i ; k<=j ; k++) {
				System.out.print( " "+ ch[k] + " ");
				count++;
			}
			System.out.println();
		}
	}				
	}
}
