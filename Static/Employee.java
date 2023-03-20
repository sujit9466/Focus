package Static;

public class Employee {
    private int id;
    private String name;
    private int sal;
    private static String company = "BitCode";

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void display() {
        System.out.println(id + " " + name + " " + sal + " " + company);
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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

    //when i need to not create object of class that time we directly access static keyword.
	// Static keyword is used to access variable without creating object of class.
    //static functions can access only static data members of class
    //static functions can not access non-static(instance) members of class as the
    //static function does not receive implicit parameter this
    


    
   
    }
