package SingaltonPattern;

// final keyword demo

public class Product {

    private final int id;
    private String title;
    private int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Product() {
        this(-1, "Demo Product", 0);
    }

    public void display() {
        System.out.println(id  + " " + title  + " " + price );
    }

    /*public Product() {
        id = -1;
        title = "Demo Product";
        price = 0;
    }*/

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    public static void main(String[] args) {

      //  Product p1 = new Product(101, "laptop", 1000);
        //p1.display();

        Product p1 = new Product();
        p1.display();
        
        Product p2= new Product(0, "laptop", 20009);
        p2.display();
        
    }
}
