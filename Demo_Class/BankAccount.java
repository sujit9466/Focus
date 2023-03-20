package Demo_Class;


//

public class BankAccount {
    private int accNo;
    private String name;
    private int bal;

    public BankAccount(int accNo, String name, int bal) {
        //validations
        this.accNo = accNo;
        this.name = name;
        this.bal = bal;
    }

    void display() {
        System.out.println(accNo  + " " + name + " " + bal);
    }

    public boolean deposit(int amt) {
        if(amt <= 0) {
            return false;
        }

        bal = bal + amt;
        return true;
    }

    public int withDraw(int amt) {
        if(amt > bal) {
            return 0;
        }

        bal = bal - amt;
        return amt;
    }

    public void setName(String name) {
        this.name = name;
    }

    
        public static void main(String[] args) {

            BankAccount b1 = new BankAccount(
                    101,
                    "Vishal",
                    1000
            );
            b1.display();


            if(b1.deposit(200)) {
                System.out.println("Deposit success!");
            }
            else {
                System.out.println("Deposit failed!");
            }

            /*boolean isSuccessful = b1.deposit(200);
            if(isSuccessful) {
                System.out.println("Deposit success!");
            }
            else {
                System.out.println("Deposit failed!");
            }*/
            b1.display();


            System.out.println("Amt withdrawn = " + b1.withDraw(350));
            b1.display();

            System.out.println("Amt withdrawn = " + b1.withDraw(5000));
            b1.display();

            /*int amt = b1.withDraw(350);
            System.out.println("Amt withdrawn = " + amt);
            b1.display();

            amt = b1.withDraw(5000);
            System.out.println("Amt withdrawn = " + amt);
            b1.display();*/

           
        }
    }

