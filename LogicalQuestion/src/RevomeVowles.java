
public class RevomeVowles {
	public static boolean isVowel(char c)
	{
		c=Character.toLowerCase(c);
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
	}
public static void main(String[] args) {
	String str ="anupam";
	char [] ch=str.toCharArray();
	char [] newch = new char[ch.length];
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
}