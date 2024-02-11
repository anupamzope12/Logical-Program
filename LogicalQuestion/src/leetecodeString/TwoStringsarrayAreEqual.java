package leetecodeString;

public class TwoStringsarrayAreEqual {
    public static void main(String[] args) {
    	String []word1= {"a","cb"};
    	String []word2= {"a","bc"};
		System.out.println(arrayStringsAreEqual(word1, word2));;
	}
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String s="";
		String m="";
		for(int i=0;i<word1.length;i++) {
			s=s.concat(word1[i]);
			m=m.concat(word2[i]);
		}
		System.out.println(s);
		System.out.println(m);
		if(s.equals(m)) {
			return true;
			
		}
		return false;
	}
}
