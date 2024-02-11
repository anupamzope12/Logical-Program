package leetecodeInteger;

public class FinalValueAfterOperations {
public static void main(String[] args) {
	String []arr={"--X","X++","X++"};
	System.out.println(finalValueAfterOperations(arr));;

}


public static int finalValueAfterOperations(String [] operation) {
	int sum=0;
	for(int i=0 ;i<operation.length;i++) {
		if(operation[i].equals("--X") ||operation[i].equals("X--") ) {
			sum--;
		}
		if(operation[i].equals("++X")||operation[i].equals("X++")) {
			sum++;
		}
	}
	return sum;
  }
}
