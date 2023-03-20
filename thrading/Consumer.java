package thrading;

public class Consumer  extends Thread{
	private Holder holder;

	
	
	public Consumer(Holder holder) {
		this.holder = holder;
	}
	
	public void run() {
		while(true) {
			holder.get();
		}
	}



	 
	   
}
