package thrading;

public class Produser extends Thread {
	
	private Holder holder;

	public Produser(Holder holder) {
		this.holder = holder;
	}
	

	public void run() {
		
		int i=0;
		while(true) {
			holder.set(++i);
			
		}
	}

}



