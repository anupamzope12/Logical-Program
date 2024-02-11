//
//package leetecodeString;
//
//public class SplitAStringInBalancedString {
//    public static void main(String[] args) {
//        String s = "RLRRLLRLRL";
//        for (int i = 1; i < s.length(); i++) {
//            s = s.replace('L', 'R');
//        }
//        int n = 0;
//        String modifiedString = s;
//        System.out.println("modifiedString : " + modifiedString);
//        for (int i = 0; i < modifiedString.length(); i++) {
//            if (i % 2 == 0) {
//                n = i;
//                modifiedString = modifiedString.substring(0, i) + 'L' + modifiedString.substring(n + 1);
//            }
//        }
//        int count=0;
//        for(int i=0;i<modifiedString.length();i++) {
//        	if(i%2==0) {
//        			for(int j=0;j<i;j++) {
//        				System.out.print(modifiedString.charAt(j));		
//        			}
//        		}
//        	count++;
//        	System.out.println();
//        }
//        System.out.println(count/2);
//        //System.out.println(modifiedString);
//        
//    }
//}
package leetecodeString;

public class SplitAStringInBalancedString {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        
        for (int i = 1; i < s.length(); i++) {
            s = s.replace('L', 'R');
        }
        
        int n = 0;
        String modifiedString = s;
        System.out.println("modifiedString: " + modifiedString);

        for (int i = 0; i < modifiedString.length(); i++) {
            if (i % 2 == 0) {
                n = i;
                modifiedString = modifiedString.substring(0, i) + 'L' + modifiedString.substring(n + 1);
            }
        }

        int count = 0;

        for (int i = 0; i <= modifiedString.length(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print(modifiedString.charAt(j));
                }
                count++;
                System.out.println();
            }
        }

        System.out.println(count-1);
    }
}
