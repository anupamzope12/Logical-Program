
public class SplitArray3 {
public static void main(String[] args) {
	String str = "anupamzope";
	
//	=str.split("p");
	String str1[]=str.split("p",3);
	for(String str2:str1) {
		System.out.println(str2);
	}
	}
}
