package String;

public class sort {
	
	public static void main(String[] args) {
		
	String str1="hello";
	String str2="world";
	
	int a=str1.length();
	int b=str2.length();
	
	System.out.println(a+b);
	
	char [] ch1=str1.toCharArray();
	char [] ch2=str2.toCharArray();
	
	for(int i=0 ; i<ch1.length ; i++)
	{
		for(int j=i+1 ; j<ch1.length ;j++)
		{
			if(ch1[i]>ch1[j])
			{
				char temp=ch1[i];
				ch1[i]=ch1[j];
				ch1[j]=temp;
			}
			
		}
		System.out.print(ch1[i] + " ");
	}
	System.out.println();
	for(int i=0 ; i<ch2.length ; i++)
	{
		for(int j=i+1 ; j<ch2.length ;j++)
		{
			if(ch2[i]>ch2[j])
			{
				char temp=ch2[i];
				ch2[i]=ch2[j];
				ch2[j]=temp;
			}
			
		}
		System.out.print(ch2[i] + " ");
	}
	
	int lexico=str1.compareTo(str2);
	if(lexico<0) {
		System.out.println(lexico);
		System.out.println("NO");
	}
	else {
		System.out.println("YES");
	}
	System.out.println();
	if(str1.charAt(0)>str2.charAt(0)) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
	
	//str1.charAt(0)
	String m=str1.replace(str1.charAt(0), str1.toUpperCase().charAt(0));
	String n=str2.replace(str2.charAt(0), str2.toUpperCase().charAt(0));
	System.out.println(m + " " + n);
	}
}
