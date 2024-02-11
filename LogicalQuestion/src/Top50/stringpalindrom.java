package Top50;
public class stringpalindrom {
	public static void main(String[] args) {
	String s="AEIEA";
	String rev="";
	char ch [] =s.toCharArray();
	for(int i=ch.length-1 ; i>=0 ; i--) {
		rev=rev + s.charAt(i);
	}
	System.out.print(rev);
	System.out.println();
	if(rev.equals(s)) {
		System.out.println("palindrom");
	}
  }  
}