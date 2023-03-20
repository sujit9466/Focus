package StaticBlock;

public class Main {
	
	 public static void main(String[] args) {

	     //print company name
	     //System.out.println(Employee.company);

	     System.out.println(Employe.getCompany());

	     
	     Employe e1 = new Employe("AA", 1000);
	     Employe e2 = new Employe("BB", 2000);
	     Employe e3 = new Employe("CC", 3000);

	     System.out.println(e1.getCompany());

	     e1.display();
	     e2.display();
	     e3.display();

	     System.out.println();

	  //   e1.setCompany("BitCode Tech");
	     /*e2.setCompany("BitCode Tech");
	     e3.setCompany("BitCode Tech");*/

	     e1.display();
	     e2.display();
	     e3.display();

	 }


}
