
public class Tata implements Iso{

	private int id;
	private String name;
	private String licno;
	
	
	
	
	
	public String getLicno() {
		return licno;
	}
	public Tata(int id, String name, String licno) {
		this.id=id;
		this.licno=licno;
		this.name=name;
		}
	public void setLicno(String licno) {
		this.licno = licno;
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
	
	
	public void Display() {
		
		System.out.println("Id ="+id);
		System.out.println("Company Name="+name);
		System.out.println("licens number="+licno);
		
	}
	
	
	
}
