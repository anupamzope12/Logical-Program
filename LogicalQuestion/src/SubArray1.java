import java.util.ArrayList;

public class SubArray1 {
	public static void main(String[] args) {
		String str="1203349";
		
		ArrayList<String>AL=new ArrayList<>();
		for(int i=0 ;i<str.length();i++) {
			for(int j=0 ;j<str.length();j++) {
				String st1r="";
				for(int k=i ; k<j ;k++) {
					st1r +=str.charAt(k);
				}
				AL.add(st1r);
			}
		}
		System.out.println(AL);
	}
}
