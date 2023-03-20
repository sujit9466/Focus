package Inheretence2;

public class Main {
    public static void main(String[] args) {

        Shape s = null;
        int type = 2; //imagine we are scanning value of type from user

        switch (type) {
            case 1:
                s = new Circle();
                break;
            case 2:
                s = new Rect();
        }

        if(s instanceof Circle){
            ((Circle) s).setR(99);
        }
        if(s instanceof Rect) {
            ((Rect)s).setW(300);
            ((Rect)s).setH(300);
        }
        s.draw();



        /*Shape s = new Circle(100, 100, 100);
        s.draw();

        //will not work !!
        *//*s.setR(55);
        System.out.println(s.getR());*//*

        ((Circle)s).setR(55);
        System.out.println(((Circle)s).getR());
        s.draw();

        s = new Rect(200, 200, 200, 200);
        s.draw();

        //((Circle)s).setR(99); //class cast exception

        ((Rect)s).setW(300);
        ((Rect)s).setH(300);
        s.draw();*/


    }

    public static void line() {
        System.out.println("--------------------------------");
    }
}

/**
 * Type casting (other than primitive types) is validated in java at Run-Time.
 */

/**
 * Down casting will work if and only if it is going to result in a complete/valid object.
 *  Else it will generate ClassCastException.
 */














