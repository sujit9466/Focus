package generics;

public class Derive <DVAl,BVAL> extends Base<BVAL> {

	private DVAl data1;
	


		public Derive(BVAL data, DVAl data1) {
		super(data);
		this.data1=data1;
	}
	
	 

	public Derive() {
		this.data1 =null;

	}





	public DVAl getData1() {
		return data1;
	}

	public void setData1(DVAl data1) {
		this.data1 = data1;
	}

	
	}
