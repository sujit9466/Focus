package Inheretance3;

public class Main {
    public static void main(String[] args) {

        Shape s = new Circle();
        s.draw();
        s.info();

        Rect r = new Rect();
        r.draw();
        r.info();


    }

    public static void line() {
        System.out.println("--------------------------------");
    }
}

abstract class Demo {
    public void fun1() {

    }

    public void fun2() {

    }
}








