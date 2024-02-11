
public class RemoveVowelsfromstring2 {
public static void main(String[] args) {
	String str="apurva";
	removeVowel(str);
}
	public static void removeVowel(String str) {
		char ch []=str.toCharArray();
		char newch[]=new char[ch.length];
		int k=0;
		for(int i=ch.length-1;i>=0;i--) {
			if(!isVowel(ch[i])) {
				newch[k]=ch[i];
				k++;
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(newch[i] + " ");
		}
		
		
	}
	public static boolean isVowel(char c) {
		 c=Character.toLowerCase(c);
		 return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ;
	}
}
