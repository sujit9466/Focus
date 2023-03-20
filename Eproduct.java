
public class Eproduct extends Cartp {

	private String srno;
	 private int waranty;
	 
	 
	 public Eproduct() {
		 srno="Na";
		 waranty=0;
		 
		 
	 }
	 
	public Eproduct(int id, String title , float price, String srno,int waranty) {
		super(id,title,price);
		this.srno = srno;
		this.waranty = waranty;
	}
	public String getSrno() {
		return srno;
	}
	public void setSrno(String srno) {
		this.srno = srno;
	}
	public int getWaranty() {
		return waranty;
	}
	public void setWaranty(int waranty) {
		this.waranty = waranty;
	}
	 
	 public void Display() {
		 super.display();
		 System.out.println("serial no=" +srno);
		 System.out.println("Waranty period(in months)="+waranty);
		 System.out.println("-----------------------------------------------");
	 }
	 
	 
	 
}
