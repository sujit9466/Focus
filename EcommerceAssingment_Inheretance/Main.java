package EcommerceAssingment_Inheretance;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();

        ElectronicProduct ep1 = new ElectronicProduct(
          101,
          "Laptop Asus",
          45000f,
          "A12F45DES23890",
          12
        );
        cart.add(ep1);

        ClothingProduct cp1 = new ClothingProduct(
                501,
                "Mens shirt",
                3400,
                20,
                34,
                10
        );
        cart.add(cp1);

        cart.add(
                new ElectronicProduct(
                        102,
                        "Headphones",
                        3900,
                        "HP234asd",
                        24
                )
        );

        cart.display();

    }
}
