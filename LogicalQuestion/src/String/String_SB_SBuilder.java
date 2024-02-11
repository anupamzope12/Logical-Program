package String;

public class String_SB_SBuilder {
	public static void main(String[] args) {
		String s="Anupam";
		System.out.println(s.getClass());
		System.out.println(s.charAt(1));
		
		StringBuilder sb=new StringBuilder("Navin");
		StringBuilder sb1=new StringBuilder("Navin");

		sb.append(" reddy");
		System.out.println(sb);
		System.out.println(sb.compareTo(sb1));
		
		StringBuffer sb2=new StringBuffer("Navin Reddy");
		sb2.append("  java COder");
		System.out.println(sb2);
	}
}