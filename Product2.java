
public  class Product2 {
	private int id;
	private float price;
private String title;

public Product2() {
	
	
}
public Product2(int id, float price, String title) {
	this.id=id;
	this.price=price;
	this.title=title;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

public  void Display() {
	System.out.println("Product Id="+id);
	System.out.println("Product Price="+ price);
	System.out.println("Product name="+title);
}



public static void main(String[] args) {
	
	 Bitcode b1=new Bitcode(112, "bitcode pune");
	 Bitcode b2=new Bitcode(113, "bitcode Mumbai");
	 
	 Tata t=new Tata(122,"tata Moturs","SFEWF343");
	 Tata t2=new Tata(123,"TCS","SFEWF343");
	 Iso iso;
	 iso=b1;
	 iso=b2;
	 iso=t;
	 iso=t2;	 
	 b1.quality();
	 b1.hrPolicy();
	 b2.quality();
	 b2.hrPolicy();
	 
	 t.quality();
	 t.hrPolicy();
	 
	 t2.quality();
	 t2.hrPolicy();
	 
	 t.Display();
	 
	 
	 
}
}
