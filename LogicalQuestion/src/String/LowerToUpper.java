package String;

public class LowerToUpper {
public static void main(String[] args) {
	String s="hello world";
	char [] chars=s.toCharArray();
	for(int i=0 ;i<chars.length ; i++) {
		if(chars[i] >= 'a' && chars[i]<='z') {
			System.out.print(chars[i]=(char)(chars[i] - 'a' + 'A'));
		}

	}
}
}
