package String;

public class UpperToLower {
public static void main(String[] args) {
	String s="HELLO WORLD";
	char [] ch=s.toCharArray();
	for(int i=0 ; i<ch.length ; i++) {
		if(ch[i] >='A' && ch[i]<='z') {
			System.out.print(ch[i]=(char) (ch[i] - 'A' + 'a'));
		}
	}
}
}
