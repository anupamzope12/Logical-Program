package GFG;

public class Min {
public static void main(String[] args) {
	
	String s[]= {"my" ,"name","is","anupam","zope"};
	String str1="my" ;
	String str2="zope";
	System.out.println(shortestDistance(s,str1,str2));
}

static int shortestDistance(String s[],String str1,String str2) {
//	int d1=-1 ;
//	int d2=-1;
	int ans=0;
	int k=0,t=0;
	for(int i=0 ;i<s.length;i++) {
		if(s[i]==str1) {
			k=i;
		}
		if(s[i]==str2) {
			t=i;
		}
	}
	return ans=Math.abs(k-t);
}
}
