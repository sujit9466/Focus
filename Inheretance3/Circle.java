package Inheretance3;



public class Circle extends Shape {
    private int r;

    public Circle() {
        r = 0;
    }
    
    

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
    

    /*@Override
    public void info() {
        System.out.println("Author: Swati");
        System.out.println("Company: XYZ");
    }*/

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public float area() {
       return 3.14f * r * r;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null || !(obj instanceof Circle)) {
            return false;
        }

        Circle c = (Circle) obj;
        if(this.getX() != c.getX()) {
            return false;
        }

        if(this.getY() != c.getY()) {
            return false;
        }

        return this.r == c.r;
    }
    
    
   
    

    @Override
    public void draw() {
        //super.draw();
        System.out.println("x = " + getX() + " y = " + getY());
        System.out.println("r = " + r);
        System.out.println("---------------------------");
    }
}


final class Base {

}

/*
class Derived extends Base {

}
*/













