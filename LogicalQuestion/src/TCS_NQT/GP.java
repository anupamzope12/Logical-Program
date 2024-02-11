package TCS_NQT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GP {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter nth term");
	int n=sc.nextInt();
	int e = n/2;
	int o = n/2+1;

	System.out.println("value of e  " + e);
	System.out.println("value of o  " + o);

	int enthterm=1;
	int onthterm=1;
    int count=0;
	System.out.print("even term " +"1 " );
	for(int i=0 ;i<e;i++) {
		enthterm=3*enthterm;
		System.out.print(enthterm + " ");
		count++;
	}
	System.out.println();
	System.out.print("odd term " +"1 " );
	for(int i=0 ;i<o;i++) {
		onthterm=2*onthterm;
		System.out.print(onthterm + " ");
		count++;
	}
	  }
}