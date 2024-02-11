package Other;

public class reversedonlyVowelsfromString {
	public static void main(String[] args) {
		String str="gadhanoone";
		char []ch=str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			while(left<right && !isVowels(ch[left])) {
				left++;
			}
			while(left<right && !isVowels(ch[right])) {
				right--;
			}
			//swapping logic

			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		
		String newString =new String(ch);
		System.out.println(newString);
	}
	
private static boolean isVowels(char ch) {
	char c=Character.toLowerCase(ch);
	return c=='a'|| c=='e' || c=='i'|| c=='o' || c=='u' ;
	
	}
}

