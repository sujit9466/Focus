package PassingArrrayAndObjectToFuction;

//Passing object and array to function

public class Product {
	private int id;
	private String title;
	private int price;

	public Product(int id, String title, int price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}

	public void display() {
		System.out.println(id + " " + title + " " + price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

		
		 Product p1 = new Product(101, "Laptop", 23000); printProductInfo(p1);
		 p1.display();
		 
		 Product p2 = new Product(202, "Smart Phone", 3400); printProductInfo(p2);
		 p2.display();
		

		Product[] products = new Product[4];
		products[0] = new Product(101, "laptop", 34000);
		products[1] = new Product(98, "TV", 4000);
		products[2] = new Product(103, "watch", 5600);
		products[3] = new Product(54, "phone", 36700);

		printProducts(products);
		sortProducts(products);
		System.out.println();
		printProducts(products);

	}

	public static void sortProducts(Product[] products) {
		for (int i = 0; i < products.length - 1; i++) {
			for (int j = 0; j < products.length - 1; j++) {
				if (products[j].getPrice() > products[j + 1].getPrice()) {
					Product tempProduct = products[j];
					products[j] = products[j + 1];
					products[j + 1] = tempProduct;
				}
			}
		}
	}

	public static void printProducts(Product[] prds) {
		for (Product p : prds) {
			p.display();
			System.out.println("**************************");
		}

	}

	public static void printProductInfo(Product p) {
		p.display();
		System.out.println("--------------------------------------");
		p.setPrice(p.getPrice() + 100);
	}
}
