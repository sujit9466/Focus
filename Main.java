
public class Main{
	 
	  public static void main(String[] args) {

	        Cart cart = new Cart();

	        Eproduct ep1 = new Eproduct(
	                101,
	                "Laptop Asus",
	                45000f,
	                "A12F45DES23890",
	                12
	              );
	              cart.add(ep1);

	        cart.add(ep1);
	    		Clothp cp1 = new Clothp(  501,
	                    "Mens shirt",
	                    3400,
	                    20,
	                    34,
	                    10);
	        cart.add(cp1);

	      
	        cart.Display();

	    }
	 
	 
 }
 
	 
//	 public static void main(String[] args) {
//		
//		 Bitcode b1=new Bitcode(112, "bitcode pune");
//		 Bitcode b2=new Bitcode(113, "bitcode Mumbai");
//		 
//		 Tata t=new Tata(122,"tata Moturs","SFEWF343");
//		 Tata t2=new Tata(123,"TCS","SFEWF343");
//		 Iso iso;
//		 iso=b1;
//		 iso=b2;
//		 iso=t;
//		 iso=t2;
//		
//		 
//		 
//		 
//		 
//		 
//		 
//		 
//		 
//		 
//		 b1.quality();
//		 b1.hrPolicy();
//		 b2.quality();
//		 b2.hrPolicy();
//		 
//		 t.quality();
//		 t.hrPolicy();
//		 
//		 t2.quality();
//		 t2.hrPolicy();
//		 
//		 t.Display();
//		 
//		 
//		 
//	 }
//	 
// }
// 
