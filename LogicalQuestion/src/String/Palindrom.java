package String;

public class Palindrom {
public static void main(String[] args) {
	

	String str="madam";
	
	char [] ch=str.toCharArray();
	
	int length=str.length();
	String str1 = "";
	for(int i=length-1 ; i>=0 ; i--) {
		 str1= str1 + str.charAt(i);
	}
	System.out.println(str1);
	if(str1.equals(str)) {
		System.out.println("yes");
	}
	//	if(ch[i]==str)
//	{
//		System.out.println("Yes");
//	}
	
}
}
