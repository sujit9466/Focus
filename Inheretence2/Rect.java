package Inheretence2;

public class Rect extends Shape {
    private int w;
    private int h;

    public Rect() {
        w = h = 0;
    }

   public Rect(int x, int y, int w, int h) {
       super(x, y);
       this.w = w;
       this.h = h;
   }

   @Override
   public void draw() {
       super.draw();
       System.out.println("w = " + w + " h = " + h);
       System.out.println("---------------------------");
   }

   public int getW() {
       return w;
   }

   public void setW(int w) {
       this.w = w;
   }

   public int getH() {
       return h;
   }

   public void setH(int h) {
       this.h = h;
   }
}
