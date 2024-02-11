package leetecodeString;

public class LengthOfLastWord {
	public static void main(String[] args) {
	String s="  Hello World   ";
	System.out.println(length(s));
	}
	
	public static int length(String s) {
		s=s.trim();
		String []words=s.split(" ");
		for(String wd:words) {
		System.out.println(wd);
		}
		if(words.length>0) {
			int ret=words[words.length-1].length();
			return ret;
		}else {
			return 0;
		}
//		System.out.println(ch.length);
//		return 1;
	}
}
