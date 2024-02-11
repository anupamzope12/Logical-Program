package HackerRank;
import java.util.*;

public class Refractor {

    //blic static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */  
    //}
static int B;
static int H;
static Scanner scan = new Scanner(System.in);

static{
	System.out.println("Enter the value of B and H");
    B = scan.nextInt();
    H = scan.nextInt();
    try{
        if(B <= 0 || H <= 0){
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e){  
        System.out.println(e);
    }
}

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    if (B > 0 && H > 0){
        System.out.println(B * H);
    }       
}
}