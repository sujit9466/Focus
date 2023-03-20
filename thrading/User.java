package thrading;

public class User extends Thread{
	
	private String name;
	private Printer printer;
	public User(String name, Printer printer) {
		this.name = name;
		this.printer = printer;
	}
	public void run() {
		synchronized(printer) {
			printer.print(name+".pdf");
		}
		
	}
	
	
	

}
