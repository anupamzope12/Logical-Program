package leetecodeInteger;
import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacters1 {
	public static void main(String[] args) {
		String [] words= {"leete","code"};
		char x='e';
		System.out.println(findWordsContaining(words, x));;
	}
	    public static List<Integer> findWordsContaining(String[] words, char x) {
	        List<Integer> wordsContaining=new ArrayList();
		for(int i=0;i<words.length;i++) {
			char bbv[]=words[i].toCharArray();
			for(int j=0;j<bbv.length;j++)
			{
				if(bbv[j]== x) {
					wordsContaining.add(i);
					break;
				}
			}
		}
		return wordsContaining;
	}
}