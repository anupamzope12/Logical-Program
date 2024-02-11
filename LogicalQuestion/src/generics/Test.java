package generics;

public class Test {
	public static void main(String[] args) {
		Holder<String> hs=new Holder<String>("ASD");
		System.out.println(hs.getRef());
		
		Holder<Integer> hi=new Holder<Integer>(12354);
		System.out.println(hi.getRef());
		
		Holder<Double> hd=new Holder<Double>(12354.2);
		System.out.println(hi.getRef());
		
	}
}
