package Other;

public class Armstrong {
	public static void main(String[] args) {
	
	int num=153;
	int temp=num;
	int r;
	int sum=0;
	
	while(temp>0) {
		r=temp%10;
		sum += Math.pow(r, 3);
		temp =temp/10;
	}
	System.out.println(sum);
	if(sum==num) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("not armstrong");
	}
	}
}