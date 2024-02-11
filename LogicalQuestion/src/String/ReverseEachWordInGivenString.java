package String;

public class ReverseEachWordInGivenString {
	public static void main(String[] args) 
	{
		String output="";
		String str="java code";
		String [] words=str.split(" ");
		System.out.println("intput::" + str );
		String revWord="" ;
		
		for(String word:words)
		{
			for(int i=word.length()-1 ; i>=0 ; i--) {
				revWord=revWord+word.charAt(i);
			}
			
			output=output+revWord+ " ";
//			output=revWord+ " ";

		}
		System.out.println(output);		
	}
}
