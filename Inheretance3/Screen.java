package Inheretance3;

public class Screen {

    public static void drawToScreen(Shape s) {
        System.out.println(s.area());
        s.draw();
    }


    public static void drawCircle(Circle c) {
        c.draw();
    }

    public static void drawRect(Rect r) {
        r.draw();
    }

}
