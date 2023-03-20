package Interface4;
public class Main {
    public static void main(String[] args) {



        int val = Integer.parseInt("1234");
        val = Integer.parseInt("1010", 2);
        System.out.println(val);
        val = Integer.parseInt("F", 16);
        System.out.println(val);


        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);

        Loggable l = new Customer(101, "AA");
        l.info();
        l.log("cust.txt");

        l = new Card(12312321, "ABCD");
        l.info();
        l.log("card.txt");






    }
}
