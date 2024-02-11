package String;

public class ReplaceCharacterWithItsOccurance {
	public static void main(String[] args) {
		
	
	String input="opentext";
	
	char charToReplace = 't';
	
//	char[]ch=input.toCharArray();
	int cnt=1;
//	for(int i=0 ; i<ch.length ; i++) {
//		if(ch[i]==charToReplace) {
//			ch[i]=String.valueOf(cnt).charAt(0);
//			cnt++;
//		}
//	System.out.print(ch[i] + " ");
//	}
	for(int i=0 ; i<input.length();i++)
	{
		char ch=input.charAt(i);
		if(ch == charToReplace) {
			input=input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
		cnt++;
		}	
	}
	System.out.println(input);
	
	}
}
