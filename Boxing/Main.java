package Boxing;
public class Main {
    public static void main(String[] args) {

        Integer iObj1 = new Integer(100); //boxing
        int iVal = iObj1.intValue(); //unboxing

        Integer iObj2 = 200; //Auto-Boxing
        int iVal2 = iObj2; //Auto-Unboxing

        Character chObj = 'V';
        char ch = chObj;

        Boolean bObj = true;

    }
}
