package String;

public class OccuranceOfEachCharacter {
//	public static void main(String[] args) {
//
//	String str="abcabc";
//	int count=0;
//	
//	char []ch=str.toCharArray();
//	
//	for(int i=0 ; i<ch.length ; i++) {
//		for(int j=0 ;j<ch.length ; j++) {
//			if(ch[i]==ch[j]) {
//				count++;
//			}
//			else {
//				count=1;
//			}
//		}
//		System.out.println(ch[i] + "-" + count);	
//	}	
//	}
	public static void main(String[] args) {
		String str="abcdabcd";
		int count=0;
		char[] ch1=str.toCharArray();
		for(int i=0 ;i<str.length();i++) {
			for(int j=i+1 ; j<str.length();j++) {
				if(ch1[i]==ch1[j]) {
					count++;	
				}
				else {
					count=1;
				}
				if(count>1) {
					System.out.println(ch1[i] + "-" + count);
				}
			}
		}
	}
}