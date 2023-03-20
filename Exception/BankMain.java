package Exception;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(
                BankUtil.calculateInterest(
                        1000,
                        10,
                        5.0f
                )
        );

        System.out.println(
                BankUtil.calculateInterest(
                        -1000,
                        10,
                        5.0f
                )
        );

        Integer.parseInt("ABCD");

        /*try {
            System.out.println(
                    BankUtil.calculateInterest(
                            1000,
                            10,
                            5.0f
                    )
            );

            System.out.println(
                    BankUtil.calculateInterest(
                            -1000,
                            10,
                            5.0f
                    )
            );
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }*/

    }
}
