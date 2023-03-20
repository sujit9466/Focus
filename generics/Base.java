package generics;

public class Base<BVAL> {

	private BVAL data;

	public Base(BVAL data) {
		this.data = data;
	}
	
	public Base() {
		this.data=null;
		
		
	}

	public BVAL getData() {
		return data;
	}

	public void setData(BVAL data) {
		this.data = data;
	}
	 
	
	
	
}
