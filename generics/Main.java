package generics;

public class Main {

public static void main(String[] args) {

	
	Derive <String,String> d1= new Derive <String,String>("suj it", "Bhujbal");
	System.out.println(d1.getData());
	
	
// Holder <String> Stringholder= new Holder <String>("1234");
// 
// Holder <Integer>  Intgerholder= new Holder <Integer>(20);
// 
// System.out.println(Stringholder.getData());
// 
// System.out.println(Intgerholder.getData());
// 
// Pair<String , String> a1 =new Pair<String, String>("suit", "Bhujbal");
// System.out.println(a1.getKey()+ " " + a1.getVal());
// 
// a1.setKey("mayur");
// System.out.println(a1.getKey()+ " " + a1.getVal());

}
	
}
