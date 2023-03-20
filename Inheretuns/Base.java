package Inheretuns;


public class Base {

	private int Base;

	public int getBase() {
		return Base;
	}

	public void setBase(int Base) {
		this.Base = Base;
	}
	
	public void Display() {
		System.out.println( " b="+ Base);
	}
	
		public static void main(String[] args) {
		
			Derive d= new Derive();
			d.setBase(100);
			d.setDer(200);
			d.Display();
		}
	}	

