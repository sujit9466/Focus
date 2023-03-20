package thrading;

public class Car extends Thread {

	private int carid;
	private String model;
	private int speed;
	
	
	public Car(int carid, String model, int speed) {
		this.carid = carid;
		this.model = model;
		this.speed = speed;
		
		new Thread(this).start();
		
	}
	
	
	public void run() {
		
		for (int i=0 ; i<1000; i=i+speed) {
		System.out.println(carid + " "+ model + "reached  " + i +"kms");
		
		try {
			
			
			Thread.sleep(10);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		
		System.out.println("************"+ model+"*******************");
	}
	
	public void move() {
		for (int i=0 ; i<1000; i=i+speed) {
			System.out.println(carid + " "+ model + "reached  " + i +"kms");
		}
		}
	
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
