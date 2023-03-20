
public class Car extends Vehical {
 
	private String petrol ;
	private String cng;
	
	public Car() {
		
	}
	public Car(String petrol,String cng, String passno, String chesino ) {
		super(passno, chesino);
		this.petrol=petrol;
		this.cng=cng;
	}
	
	public String getPetrol() {
		return petrol;
	}
	public void setPetrol(String petrol) {
		this.petrol = petrol;
	}
	public String getCng() {
		return cng;
	}
	public void setCng(String cng) {
		this.cng = cng;
	
	
	}
	public void type( String petrolT,String cngT) {
	petrol=petrolT;
	
	
	 cng= cngT;
	
		
		
	}
	public void Display() {
	super.Display();
		start("Car");
		stop("Car");
		move("Car");
		
		if(getPetrol()=="petrol") {
			System.out.println("car is petrol");
		}
		else {
			System.out.println("car is cng");
		}
		
		
	System.out.println("-----------------------------------------");	
		
	}
	
}
