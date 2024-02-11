package String;

public class RemoveAllWhiteSpacesOfString {
	public static void main(String[] args) {
		String str="  j av a	S cr  i p t		";
		
		System.out.println(str.trim());
		System.out.println(str.replaceAll("\\s", ""));
	}

}
