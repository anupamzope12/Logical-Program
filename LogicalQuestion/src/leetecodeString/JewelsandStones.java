package leetecodeString;

//public class JewelsandStones {
//public static void main(String[] args) {
//	String jewels = "aA";
//	String stones = "aAAbbbb";
//	System.out.println(numJewelsInStones(jewels,stones));;
//}
//public static int numJewelsInStones(String jewels, String stones) {
//	char [] ch=stones.toCharArray();
//	char[]ch1=jewels.toCharArray();
//	int count=0;
//	for(int i=0;i<ch.length;i++) {
//		for(int j=0;j<ch1.length;j++)
//		{
//			if(ch1[j]==ch[i]) {
//				count++;
//			}
//		}
//	}
//	return count;
//    
//}
//
//}
import java.util.HashSet;

public class JewelsandStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }
        System.out.println(jewelSet);
        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count++;
            }
        }
        return count;
    }
}

