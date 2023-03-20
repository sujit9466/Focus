
public class Bitcode implements Iso{

	private int id;
	private String name;
	
	
	
	
	
	
	
	public Bitcode( int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void quality() {
		System.out.println("Qualicty of"+name+"is good ");
	}
	@Override
	public void hrPolicy() {
		System.out.println("hrpolicy of"+name+"approved");
	}
	
	
	
	
}
