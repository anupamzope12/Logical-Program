package String;

public class ASCII_Value1 {
	public static void main(String[] args) {
	int a=64;
//	int b=64+1;
//	
//	System.out.println((char) b);
	for(int i=1 ;i<=26;i++) {
		int b=64+i;
		System.out.println ((char)b);
		
	}
	System.out.println("==========");
	
	for(int i=64 ; i<156 ;i++) {
		System.out.println(i +"="+ (char)(i));
	}
	
	}
}
