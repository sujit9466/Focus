package thrading;

public class MainHolder {

	public static void main(String[] args) {
		
		
		Holder holder= new Holder();
		
		Produser producer= new Produser(holder);
		producer.start();
	 
		Consumer consumer = new Consumer(holder);
		consumer.start();
		
	}
	
}
