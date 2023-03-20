package generics;

public class Holder1 < T extends Number  >{

	
	private T data;
	
	public Holder1(T data) {
		this.data = data;
	}
	
	

	@Override
	public String toString() {
		return "Holder1 {data=" + data + "}";
	}



	public T getData() {
		return data;
	}

	public void steData(T data) {
		this.data = data;
	}

	
	
	
	
	
	
	
}
