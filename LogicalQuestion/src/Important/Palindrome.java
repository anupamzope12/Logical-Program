package Important;

public class Palindrome {
public static void main(String[] args) {
	String str="AIEIA";
	char ch[]=str.toCharArray();
	String rev = "";
	for(int i=ch.length-1;i>=0;i--) {
		rev=rev + ch[i];
	}
	System.out.println(rev.equals(str));
}
}
