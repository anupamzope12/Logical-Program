package Top50;

public class removewhitespacefromstring {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	StringBuilder s = null;
	String input="My name is anupam";
	char [] ch=input.toCharArray();
	for(char c: ch ) {
		if (!Character.isWhitespace(c))
			s=sb.append(c);
	}
	System.out.println(s);
}
}
