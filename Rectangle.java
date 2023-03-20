
public class Rectangle extends Shape {
    private int h;
	private int w;
	public Rectangle() {
       w=h=0;
      }	
public Rectangle(int x,int y ,int h, int w) {
	super(x, y);
	this.w=w;
	this.h=h;
	
}
public void draw() {
	super.draw();
	
	System.out.println("rectangle"+"w="+w+"h"+h);
	System.out.println("--------------------------------------------");
	
}

public int getH() {
	return h;
}

public void setH(int h) {
	this.h = h;
}

public int getW() {
	return w;
}

public void setW(int w) {
	this.w = w;
}

	
}
