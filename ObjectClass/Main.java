package ObjectClass;

public class Main {
    public static void main(String[] args) {

        IntHolder i1 = new IntHolder(100);
        IntHolder i2 = new IntHolder(100);

        boolean res = i1.equals(i2);
        System.out.println("res = " + res);




        /*IntHolder intHolder = new IntHolder(100);
        System.out.println( intHolder.toString() );

        String str = "This is state of intHolder: " + intHolder;
        System.out.println(str);

        System.out.println(intHolder);
        System.out.println(intHolder.toString());

        int [] arr = {10, 20, 30};

        System.out.println(arr.hashCode());
        System.out.println(arr); //372F7A8D*/


    }
}
