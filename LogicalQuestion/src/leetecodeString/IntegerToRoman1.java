package leetecodeString;

public class IntegerToRoman1 {
	public static void main(String[] args) {
		String s="MCMXCIV";
		IntegerToRoman1 i=new IntegerToRoman1();
		System.out.println(i.romanToInt(s));;
	}

	public int romanToInt(String s) {
	    int result = 0;
	    char[] ch = s.toCharArray();
	    int prevValue = 0;

	    for (int i = ch.length - 1; i >= 0; i--) {
	        int currValue = getValue(ch[i]);
	        
	        if (currValue < prevValue) {
	            result -= currValue;
	        } else {
	            result += currValue;
	        }

	        prevValue = currValue;
	    }
	    
	    return result;
}

	private int getValue(char c) {
	    switch (c) {
	        case 'I':
	            return 1;
	        case 'V':
	            return 5;
	        case 'X':
	            return 10;
	        case 'L':
	            return 50;
	        case 'C':
	            return 100;
	        case 'D':
	            return 500;
	        case 'M':
	            return 1000;
	        default:
	            return 0; // Handle invalid characters gracefully
	    }
	}

}
