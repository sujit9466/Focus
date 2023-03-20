package generics;

public class MainHolder1 {
	
	public static void main(String[] args) {
		
	
	Holder1<Integer> h1 = new Holder1<Integer>(12);
	Holder1<Float> h2 =  new Holder1 <Float>(12.12f);
	System.out.println(h1.toString());
	
	}
}
