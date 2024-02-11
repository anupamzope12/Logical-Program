
public class ReverseString {
	public static void main(String[] args) {
		String str="Anupam";
		System.out.println("1");
		reverseString1(str);
		System.out.println();
		System.out.println("2");
		reverseString2(str);
		System.out.println("3");
		reverseString3(str);
		System.out.println("4");
		reverseString4(str);
	}
	
	public static void reverseString1(String str) {
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)+" ");
		}
	}
	
	public static void reverseString2(String str) {
		// you can use any string buffer and string builder
		StringBuffer sb=new StringBuffer(str);
		sb=sb.reverse();
		
		System.out.println("Original String " + str +"");
		System.out.println("Reversed String " + sb+ "");
		
	}
	public static void reverseString3(String str) {
		StringBuilder sb1=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb1.append(str.charAt(i));
		}
		System.out.println("reversed string :-" + sb1.toString());
	}
	public static void reverseString4(String str) {
		char ch[]=str.toCharArray();
		int k=0;
		char newch[]=new char[str.length()];
		for(int i=ch.length-1;i>=0;i--) {
			newch[k]=ch[i];
			k++;
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		String newString=new String(newch);
		System.out.println(newString +" ");
	}
}
