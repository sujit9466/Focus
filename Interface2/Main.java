package Interface2;

public class Main {
    public static void main(String[] args) {

        BitCode b1 = new BitCode(101, "BitCode Pune");
        BitCode b2 = new BitCode(102, "BitCode Mum");

        Tata t1 = new Tata(202, "Tata Motors", "FRT56SD");
        Tata t2 = new Tata(203, "Tata Coffee", "ABCD345");

        LocalBusiness lb1 = new LocalBusiness(301, "Construction Business");

        ISO iso;

        iso = b1;
        iso = b2;
        iso = t1;
        iso = t2;
        //iso = lb1;


    }
}
