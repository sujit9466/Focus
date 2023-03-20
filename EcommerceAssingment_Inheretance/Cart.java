package EcommerceAssingment_Inheretance;

public class Cart {
    private Product [] products;
    private int numOfProducts;

    public Cart() {
        products = new Product[10];
        numOfProducts = 0;
    }

    public boolean add(Product product) {

        if(numOfProducts == 10) {
            return false;
        }

        products[numOfProducts] = product;
        numOfProducts++;

        return true;
    }

    public void display() {
        System.out.println("User Cart (" + numOfProducts + ")  ---->");
        System.out.println("Cart Total = " + getTotal());
        for(int i = 0; i < numOfProducts; i++) {
            products[i].display();
        }
    }

    public float getTotal() {
        float cartAmount = 0;
        for(int i = 0; i < numOfProducts; i++) {
            cartAmount = cartAmount + products[i].getPrice();
        }
        return cartAmount;
    }
}
