package SingaltonPattern;


public class Maths {
	// Make static reference of same type.
	private static Maths maths=null;
	
	
	//Make all constructor private.
	private Maths(){
}
	// Static method to get instance.
	public static Maths getInstance() {
		if (maths==null) {
			maths=new Maths();
			
		}
		return maths;
		
	}
	
	public int add(int  num1, int num2) {
		return num1+num2;
	}
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	
	

	
	
	
  	public static void main(String[] args) {
		Maths m1 =Maths.getInstance();
		System.out.println(m1.add(10,20));
		
		Maths m2=Maths.getInstance();
		System.out.println(m2.sub(40,50));
		
		
		Maths m3= Maths.getInstance();
		System.out.println(m3.add(33,44));
		
		System.out.println((m1==m2)+" "+(m2==m3));
		
	}
}