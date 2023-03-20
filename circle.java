import java.util.Objects;

class Circle extends Shape {
	private  int r;
	public Circle() {
		r=0;
		
	}
	public Circle(int x, int y,int r) {
		super(x,y);
		this.r = r;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(equals, r);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Circle other = (Circle) obj;
//	//	return equals == other.equals && r == other.r;
//	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
public void draw() {
		super.draw();
		System.out.println("circle"+"r=r");
		System.out.println("----------------------------------------");
	}
	

}
