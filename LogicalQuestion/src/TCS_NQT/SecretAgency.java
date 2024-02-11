//package TCS_NQT;
//
//public class SecretAgency {
//public static void main(String[] args) {
//	String word="reply";
//	int a=0;
//	char ch;
//	for(int i=0;i<word.length();i++) {
////		a=(int)word.charAt(i)+5;
//		ch=(char)a;
//		
//	}
//  }
//}
package TCS_NQT;

public class SecretAgency {
    public static void main(String[] args) {
        String word = "reply";
        StringBuilder result = new StringBuilder(); // Use StringBuilder to efficiently concatenate characters

        for (int i = 0; i < word.length(); i++) {
            int a = (int) word.charAt(i) + 5;
            if(a>'z') {
            	a -=26;
            }
            char ch = (char) a;
            result.append(ch);
        }

        System.out.println(result.toString()); // Print the final result
    }
}
//package TCS_NQT;
//
//public class SecretAgency {
//  public static void main(String[] args) {
//    String word = "reply";
//    StringBuilder result = new StringBuilder(); // Use StringBuilder to efficiently concatenate characters
//
//    for (int i = 0; i < word.length(); i++) {
//      int a = (int) word.charAt(i) + 5;
//      if (a > 'z') {
//        a -= 26; // Wrap around if the character goes beyond 'z'
//      }
//      char ch = (char) a;
//      result.append(ch);
//    }
//
//    System.out.println(result.toString()); // Print the final result
//  }
//}
