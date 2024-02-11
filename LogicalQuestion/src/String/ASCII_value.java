package String;

public class ASCII_value {
	public static void main(String[] args) {
//		Character a='a';
		char a='d';
		int asciivalue=(int) a;
		System.out.println(asciivalue);
		String s="HEllo WOrld";
		char [] ch=s.toCharArray();
		System.out.println("Ascii Value ");
		for(int i=0 ; i<ch.length ; i++) {
			System.out.print( (int)ch[i]  + " ");
		}
	}
}