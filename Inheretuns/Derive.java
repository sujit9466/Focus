package Inheretuns;

public class Derive extends Base{
	
	private int Der;

	public int getDer() {
		return Der;
	}

	public void setDer(int der) {
		Der = der;
	}
	
	public void Display() {
		System.out.println("d="+ Der);
		/* System.out.println("b="+getBase()+ "d="+Der); */
		
		super.Display();
	}
	

}
