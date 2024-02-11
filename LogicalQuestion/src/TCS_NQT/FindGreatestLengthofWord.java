package TCS_NQT;

public class FindGreatestLengthofWord {
public static void main(String[] args) {
	String s="Konwledge is the greatest git";
	int maxlen=0;
	String [] str=s.split(" ");
	for(int i=0;i<str.length;i++)
	{	
		int len=0;
		len=str[i].length();
		maxlen=Math.max(len, maxlen);
	}

	System.out.println(maxlen);
	}
}