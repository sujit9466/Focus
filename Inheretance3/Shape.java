package Inheretance3;

public abstract class Shape {
    private int x;
    private int y;

    public  void priantInfo(int x, int y) {
    	
    	this.x=20;
    	this.y=29;
    	
    	
    }
    
    
    public Shape() {
        x = y = 0;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //a final function can not be overridden
    public final void info() {
        System.out.println("Author: Vishal Jagtap");
        System.out.println("Company: BitCode");
    }

    public abstract void draw();
    public abstract float area();

    /*public void draw() {
        System.out.println("x = " + x  + " y = " + y);
    }*/

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
