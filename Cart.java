 
public class Cart  {

    private Cartp [] products;
private int noOfItem;

public Cart() {
	products = new Cartp[10];
	noOfItem = 0;
}



public boolean add(Cartp product){
	if(noOfItem == 10) {
		return false;
	}
	products[noOfItem] = product;
	noOfItem++;
	
	return true;
}
public void Display() {
	
	        System.out.println("User Cart (" + noOfItem + ") ");
	        System.out.println("Cart Total = " + getTotal());
	        for(int i = 0; i < noOfItem; i++) {
	            products[i].display();
	            System.out.println("********************");
	        }

	 }

public float getTotal() {
    float cartAmount = 0;
    for(int i = 0; i < noOfItem; i++) {
        cartAmount = cartAmount + products[i].getPrice();
    }
    return cartAmount;
	
}


public void delete() {
	for(int i=0; i<noOfItem; i++) {
		
	}
}
}