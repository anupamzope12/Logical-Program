//package AlphaSense;
//
//public class ReturnSumOfUniqueInteger1 {
//	public static void main(String[] args) {
//		String s="1,2,3,1";
//		System.out.println(getSum(s));;
//	}
//	public static int getSum(String input) {
//		char [] ch =input.toCharArray();
//		char [] ch1 =new char[ch.length/2] ;
//		int k=0;
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]==',') {
//				//System.out.println( return );
//			}
//			else{
//			ch1[k]=ch[i];
//			k++;
//			}
//			
//		}
//		for(char c:ch1) {
//			System.out.println(c);
//		}
//		return 0;
//	}
//}
package AlphaSense;

public class ReturnSumOfUniqueInteger1 {
    public static void main(String[] args) {
        String s = "1,2,3,1";
        System.out.println(getSum(s));
    }

    public static int getSum(String input) {
        char[] ch = input.toCharArray();
        char[] ch1 = new char[ch.length / 2];  // Set the length to ch.length/2
        int k = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ',') {
                // Skip commas
            } else {
                ch1[k] = ch[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(ch1[i]);
        }

        return 0;
    }
}
