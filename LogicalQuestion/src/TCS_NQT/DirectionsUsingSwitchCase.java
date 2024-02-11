//package TCS_NQT;
//import java.util.Scanner;
//public class DirectionsUsingSwitchCase {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n;
//	char c='c';
//	System.out.println("Enter the value of n");
//	n=sc.nextInt();
//	int x=0;
//	int y=0;
//	int distance=10;
//	
//  	while(n>0) {
//for(int i=0;i<n;i++) {
//	switch(c){
////	if(i==0) {
//	case 'R' :
//		x=x+distance;
//		distance=distance+10;
//	    c ='U';
//	    break;
////	}
//	case 'U' :
//		y=y+distance;
//		distance=distance+10;
//		c='L';
//		break;
//	case 'L' :
//		y=y-distance;
//		distance=distance+10;
//		c='D';
//		break;
//	case 'D' :
//		y=y-distance;
//		distance=distance+10;
//		c='A';
//		break;
//	case 'A' :
//		y=y+distance;
//		distance=distance+10;
//		c='R';
//		break;
//	  }
//	n++;
//	}
//	System.out.println(x+"-"+y);
//  }
//}

package TCS_NQT;

import java.util.Scanner;

public class DirectionsUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        char c = 'c';
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        int x = 0;
        int y = 0;
        int distance = 10;

        for (int i = 0; i < n; i++) {
            switch (c) {
                case 'R':
                    x = x + distance;
                    distance = distance + 10;
                    c = 'U';
                    break;
                case 'U':
                    y = y + distance;
                    distance = distance + 10;
                    c = 'L';
                    break;
                case 'L':
                    x = x - distance;
                    distance = distance + 10;
                    c = 'D';
                    break;
                case 'D':
                    y = y - distance;
                    distance = distance + 10;
                    c = 'A';
                    break;
                case 'A':
                    x = x + distance;
                    distance = distance + 10;
                    c = 'R';
                    break;
            }
        }

        System.out.println(x + "-" + y);
    }
}