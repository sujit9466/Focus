package Exception;

public class NewMain {

    public static void main(String[] args) {
        try {
            int sal = 10;
            if(sal <= 0) {
                throw new NegativeOrZeroSalException(
                  101,
                  sal,
                  System.currentTimeMillis(),
                  "Sal should be positive..."
                );
            }
            System.out.println("sal = " + sal);
        }
        catch (NegativeOrZeroSalException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main1(String[] args) {

        try {
            int sal = 0;
            if(sal <= 0) {
                ArithmeticException e = new ArithmeticException("Negative sal");
                throw e;
            }
            System.out.println("sal = " + sal);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }



    }
}
