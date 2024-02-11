package Important;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println(isArmstrong(1634));;
	}

	public static boolean isArmstrong(Integer num) {
		Integer temp=num;
		int length=Integer.toString(num).length();
		//System.out.println(length);
		int r;
		double sum = 0;
		while(temp>0) {
			r=temp%10;
			sum=sum+Math.pow(r, length);
			temp=temp/10;
		}
		
		if(sum==num) {
		return true;
		}
		return false;
		
	}
}
