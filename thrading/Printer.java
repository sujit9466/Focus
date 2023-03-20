package thrading;

public class Printer {
	
	private String model;
	private String srNo;
	public Printer(String model, String srNo) {
		this.model = model;
		this.srNo = srNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSrNo() {
		return srNo;
	}
	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}
	public void printInfo() {
		System.out.println(model+ " "+ srNo);
	}
	
	
	public void print(String filePath) {
		
		try {
			
			System.out.println("{");
			
			Thread.sleep(100);
			
			System.out.println(filePath);
			Thread.sleep(100);

			System.out.println("}");
			Thread.sleep(100);
			
		}
		catch(InterruptedException e) {
			
		}
		
		
	}
	
	
}
