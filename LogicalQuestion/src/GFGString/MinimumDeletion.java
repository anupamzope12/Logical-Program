package GFGString;
//Check if a string can be obtained by rotating another string 2 places
public class MinimumDeletion {
	public static void main(String[] args) {
		String str1="amazon";
		String str2="azonam";
        System.out.println(isRotated(str1, str2) ?  "Yes"
                : "No");
	}
	public static boolean isRotated(String str1,String str2) {
		if(str1.length() != str2.length())
		{
			return false;
		}
		if(str1.length()<2) {
			return str1.equals(str2);
		}
		
		String clockwise="";
		String anticlockwise="";
		
		int length=str2.length();
		 // Initialize string as anti-clockwise rotation
		anticlockwise = anticlockwise +
                        str2.substring(length-2, length) +
                        str2.substring(0, length-2) ;
		
		clockwise = clockwise +
					str2.substring(2) +
					str2.substring(0, 2);
		return (str1.equals(clockwise) || str1.equals(anticlockwise));
	}
}