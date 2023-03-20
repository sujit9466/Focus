
public class Vehical {

	private String passno;
	private String chesino;

	
	public Vehical() {
		
	}
	
	public Vehical(String passno, String chesino) {
		this.passno=passno;
		this.chesino=chesino;
		
	}
	    
	public String getPassno() {
		return passno;
	}

	public void setPassno(String passno) {
		this.passno = passno;
	}
	
	
public String getChesino() {
		return chesino;
	}

	public void setChesino(String chesino) {
		this.chesino = chesino;
	}
	
	public void start(String vtype) {
		System.out.println(vtype+" can start");
	}
	
	public void move(String vtype) {
		System.out.println(vtype+" can move");
	}
	public void stop(String vtype) {
		System.out.println(vtype+" can stop");
	}

public void Display() {
		
		
	System.out.println( "passing no ="+ getPassno() );
	System.out.println("chesi no ="+ getChesino());		
	}
	
public static void main(String[] args) {
	  Car c1= new Car("petrol"," ","MH 10 cc 2222","1HGBH42HFSR101010");
	  Car c2= new Car("","cng","MH 10 cc 2223","1TATA13DSFR20202020" );

	  Bike b1= new Bike("gear","","MH 11 BB 3333","2BJSD43CFDS102233");
	  Bike b2= new Bike("","Spder","MH 11 BB 3344","2HOND43CFDS303030");
	  
	  Bus bus1= new Bus(50,"","lalpari","MH 12 BS 4455","3TATA32DSFR404040");
	  Bus bus2= new Bus(60,"travaler","","MH 12 BS 4545","3MHDR32DSFR404050");
	   c1.Display();
	   c2.Display();
	   b1.Display();
	   b2.Display();
	   bus1.Display();
	   bus2.Display();
}

}
