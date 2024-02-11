package HackerRank;

import java.util.Scanner;
import java.util.regex.*;

public class PatternChecking
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter int5");
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
        	System.out.println("Enter the string");
            String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
                
            }
            --testCases;
              
        }
    }
}