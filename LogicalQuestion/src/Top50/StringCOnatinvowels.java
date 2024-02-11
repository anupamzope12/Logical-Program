package Top50;

public class StringCOnatinvowels {
	public static void main(String[] args) {
		System.out.println("String conatin vowels" );
		StringCOnatinvowels vs=new StringCOnatinvowels();
		System.out.println(vs.stringvowels("HELLO"));				
	}
	public boolean stringvowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
		
	}
}
