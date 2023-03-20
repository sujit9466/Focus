public class Bus extends Vehical {
	private String travaler ;
	private String lalpari;
    private int plimit;
	
 public Bus(){
		
	}
 	
 public Bus(int plimit,String travaler,String lalpari, String passno, String chesino) {
	super(passno,chesino);
	this.plimit=plimit;
	this.lalpari=lalpari;
	this.travaler=travaler;
 }
	public String getTravaler() {
	return travaler;
}

public void setTravaler(String travaler) {
	this.travaler = travaler;
}

public String getLalpari() {
	return lalpari;
}
public void setLalpari(String lalpari) {
	this.lalpari = lalpari;
}
	public int getPlimit() {
	return plimit;
}

public void setPlimit(int plimit) {
	this.plimit = plimit;
}

	public void Type(String travalerT, String lalpariT) {
		travaler=travalerT;
		
		lalpari=lalpariT;
		
		
	}
	

public void Display() {
		
		super.Display();
		start("Bus");
		stop("Bus");
		move("Bus");
		System.out.println("passrenger limit ="+getPlimit());

		if(getTravaler()=="travaler") {
			System.out.println("This bus is Travaler");
		}
		else {
			System.out.println("This bus is Lalpari");
		}
	System.out.println("--------------------------");
	}
}
