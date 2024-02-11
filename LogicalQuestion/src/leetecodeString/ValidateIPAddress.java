package leetecodeString;

public class ValidateIPAddress {
	public static void main(String[] args) {
		String str="1.1.1.1";
		System.out.println(validateIPAddess(str));;
	}
//	public static String validateIPAddess(String address) {
//		return address.replace(".","[.]");
//	}
	public static String validateIPAddess(String address) {
		StringBuilder sb=new StringBuilder();
		for(char c:address.toCharArray()) {
			sb.append((c=='.')?"[.]":c);
		}
		//System.out.println(sb);
		return sb.toString();
	}
}
