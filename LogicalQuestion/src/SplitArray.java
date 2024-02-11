
public class SplitArray {
public static void main(String[] args) {
	String str = "anu.pam.zope";
	
//	=str.split("p");
//	String str1[]=str.split("p",3);
	String str1[]=str.split("\\.");
//	String str1[]=str.split("p");
	for(String str2:str1) {
		System.out.println(str2);
	}
	}
}
