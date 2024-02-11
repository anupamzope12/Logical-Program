package leetecodeInteger;

public class NumberOfGoodPairs {
	public static void main(String[] args) {
//		int [] num= {1,2,3,1,1,3};
		int [] num= {1,1,1,1};

		int count=0;
		for(int i=0 ;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}