package Top50;
public class reversestring {
	public static void main(String[] args) {
//		String str="ANUPAM";
		reversestring rs=new reversestring();
		rs.stringreverse("ANUPAM");
	}
	public void stringreverse(String in) {

//		approach -1
//		String g="";
//		char []ch=in.toCharArray();
//		for(int i=ch.length-1 ; i>=0 ; i--) {
//			g=g+ch[i];
//		}
//		System.out.println(g);
		
//		approach -2
		System.out.println("Calling to reversestringmethod ");
		StringBuilder out=new StringBuilder();
		char [] chars=in.toCharArray();
		for(int i=chars.length-1 ; i>=0 ;i--) {	
			out.append(chars[i]);
		}
		System.out.println(out.toString());
	}
}