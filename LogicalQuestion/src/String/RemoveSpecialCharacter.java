package String;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {	
	String str="!jav$a@scrip&t";
	
	String plainstring=str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(plainstring);
	
	String str1="!@#A#N*U&PAM";
	String newstr=str1.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(newstr);
	
	}
}
