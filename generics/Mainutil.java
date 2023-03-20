package generics;

public class Mainutil {

	public static void main(String[] args) {
		
		Holder<String> h1= new Holder<String>("sujit");
		Util.stringHoP(h1);
		Util.allType(h1);
		Holder <Integer> h2= new Holder<Integer>(112);
		
		
		Util.numericHolder(h2);
		Util.allType(h1);

		
	}
	
}
