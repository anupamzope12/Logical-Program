package leetecodeString;

public class Truncate_Sentence {
	public static void main(String[] args) {
		String s="Hello how are you Contestant";
		System.out.println(truncateSentence(s, 4));
	}
	 public static String truncateSentence(String s, int k) {
		// List<String>ls=new ArrayList<String>();
		 String [] splitwords=s.split(" ");
	   //System.out.println(Arrays.toString(splitwords));
		 StringBuffer sb=new StringBuffer();
	        for (int i = 0; i < k; i++) {
	            sb.append(splitwords[i]);
	            
	            // Add space only if it's not the last word
	            if (i < k - 1) {
	                sb.append(" ");
	            }
	        }

		 System.out.println("{"+sb.toString()+"}");
		 return sb.toString(); 
	  }
}
