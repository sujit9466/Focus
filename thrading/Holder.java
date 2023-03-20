package thrading;

public class Holder {
	
private int data;
private boolean flag;


public Holder() {
	flag=false;
	
}
public synchronized void set(int data) {
	
	
	if(flag== false){
		this.data=data;
		System.out.println("put:"+data);
		flag=true;
		notify();
		try {
			wait();
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
			
		}
}
		
		public synchronized void get() {
			
			
			if(flag== true){
				System.out.println("got:"+data);
				flag=false;
				notify();
				try {
					wait();
				}
				catch(InterruptedException e) {
					
					e.printStackTrace();
					
				}
	}
}

}
