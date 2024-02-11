package String;

import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) {
    String s1=a.toLowerCase();
    String s2=b.toLowerCase();

    if(s1.length()==s2.length()){

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    s2 = s2.substring(0,j)+s2.substring(j+1); 
                    break;
                }
            }
        }

    }else{
        return false;
    }

    if(s2.length()==0){
        return true;
    }
    else{
        return false;
    }
}
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}