//package String;
//public class FirstandLastLetterCapital {
//public static void main(String[] args) {
//		String str="anupam";
//		str.toLowerCase();
//		char ch1[]=str.toCharArray();
//		for(int i=0;i<ch1.length;i++) {
//			if(i==0) {
//			String l=String.valueOf(ch1[i]).toUpperCase();
//			System.out.print(l);
//		}
//	}
//		for(int i=0;i<ch1.length;i++) {
//			if(!(i==0 || i==str.length()-1)) {
//			System.out.print(ch1[i]);
//		}
//	}
//		for(int j=0;j<ch1.length;j++) {
//			if(j==str.length()-1) {
//				String k=String.valueOf(ch1[str.length()-1]).toUpperCase();
//				System.out.print(k);
//		}		
//	  }
//	}
//}

package String;

public class FirstandLastLetterCapital {
    public static void main(String[] args) {
        String str = "anupam";
        if (str.length() > 0) {
            String firstLetter = str.substring(0, 1).toUpperCase();
            String middle = str.substring(1, str.length() - 1);
            String lastLetter = str.substring(str.length() - 1).toUpperCase();

            String result = firstLetter + middle + lastLetter;
            System.out.println(result);
        }
    }
}