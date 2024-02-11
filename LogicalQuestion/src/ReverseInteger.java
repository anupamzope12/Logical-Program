
public class ReverseInteger {
	public static void main(String[] args) {
		int m =56234;
		String s=Integer.toString(m);
		String reversed= "";
		for(int i=s.length()-1;i>=0;i--) {
			reversed +=s.charAt(i);
		}

		System.out.println(reversed);
	}
}
