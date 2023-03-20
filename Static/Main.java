package Static;

public class Main {

    public static void main(String[] args) {

        //print company name
        //System.out.println(Employee.company);

        System.out.println(Employee.getCompany());

        Employee e1 = new Employee(101, "AA", 1000);
        Employee e2 = new Employee(101, "BB", 2000);
        Employee e3 = new Employee(303, "CC", 3000);

        System.out.println(e1.getCompany());
        System.out.println(e2.getCompany());

        e1.display();
        e2.display();
        e3.display();

        System.out.println();

      //  e1.setCompany("BitCode Tech");
        /*e2.setCompany("BitCode Tech");
        e3.setCompany("BitCode Tech");*/

        e1.display();
        e2.display();
        e3.display();

    }
	
}
