package String;

public class ReverseString {
	public static void main(String[] args) {
		String [] str= {"Anupam" , "Vinit" , "Ashish" , "Bhushan" , "Kirti" , "Apurva" ,"Yashshri"};
		
		System.out.println("Original array");
		for(int i=0 ; i<str.length ; i++) {
			System.out.print(str[i] + "	 ");
		}
		System.out.println();
		System.out.println("Reverse array");
		for(int i=str.length-1 ; i>=0 ; i--) {
			System.out.print(str[i] + "	 ");
		}
	}

}
