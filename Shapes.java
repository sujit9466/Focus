
public class Shapes {

	
	
	private int x;
	private int y;
	 
	
	public Shapes() {
		x=y=0;
		
	}
	public Shapes(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	public void draw() {
		System.out.println("x="+ x + "y"+y);
	}
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
	
	public static void main(String[] args) {
		Shape s=new Circale();
		s.draw();
	}
}