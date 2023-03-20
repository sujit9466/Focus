public class Bike extends Vehical {
	private String gear ;
	private String speder;
	
	public Bike() {
		
	}
	public Bike(String gear,String speder, String passno, String chesino ) {
		 super(passno, chesino);
		 this.gear=gear;
		 this.speder=speder;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getSpeder() {
		return speder;
	}

	public void setSpeder(String speder) {
		this.speder = speder;
	}
public void Display() {
        super.Display();
	    start("Bike");
		stop("Bike");
		move("Bike");
		if(getGear()=="gear") {
			System.out.println("This is Gear Bike");
		}
		else {
			System.out.println("This is Speeder Bike");
		}System.out.println("-----------------------------------------");
		
	}
}
