package String;

public class VowelsandConsonants {
	public static void main(String[] args) {
//	String str="anupam";
//	
//	for(int i=0 ;i<str.length() ;i++) {
//		char ch=str.charAt(i);
//		if(ch=='a' || ch=='e' || ch=='i' ||  ch=='o' || ch=='u') {
//				System.out.println("vowels " + ch);
//		}
//		else {
//			System.out.println("consonants " + ch );
//		}
//	}
//  }
//		public void isVowel()
//		{
//			System.out.println("SDD");
//			if(ch=='a' || ch=='e' || ch=='i' ||  ch=='o' || ch=='u')
//			{
//				
//			}
//		}
	String str="absedfrtuiiod";
//	int count=1;
	System.out.println("vowles");
	for(int i=0 ;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' ||  ch=='o' || ch=='u') {
			{System.out.print( ch+" ");
			}
		}
    }
	System.out.println();
	System.out.println("Consonants");
		for(int i=0 ;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch !='a' || ch !='e' || ch !='i' ||  ch !='o' || ch !='u') {
				System.out.print( ch+" ");
		}
      }
   }
}