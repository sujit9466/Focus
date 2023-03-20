package Exception;
import java.io.EOFException;

public class BankUtil {

    public static float calculateInterest(
            int p,
            int n,
            float r
    ) throws InterruptedException {

        if (p <= 0 || n <= 0 || r <= 0) {
            throw new InterruptedException("Invalid p or n or r...");
        }
        return (p * n * r) / 100;

    }

    /*public static float calculateInterest(
            int p,
            int n,
            float r
    ) {
        try {
            if(p <= 0 || n <= 0 || r <= 0) {
                throw new ArithmeticException("Invalid p or n or r...");
            }
            return (p * n * r) / 100;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }*/
}