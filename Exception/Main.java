package Exception;

public class Main {
    public static void main(String[] args) {
        int num1 = 10, num2 = 2;
        int [] arr = {11, 22, 33, 44, 55};

        try {

            /*Connection con = new Connection("ip", username, password);
            con.open();
            */
            //using the con to fetch / post data

            int res = num1 / num2;
            System.out.println("res = " + res);

            System.out.println("arr ele is: " + arr[0]);

            //lots of code

            Shape s = new Circle();
            Rect r = (Rect) s;
            //Circle c = (Circle) s;

        }
       catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Can not divide by 0...");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) { //catch-all block
            System.out.println("Something went wrong...");
        }
        finally {
            System.out.println("finally block executed..");
            //con.close();
        }


    }
}



