package Demo_Class;

public class Student {
    private int roll;
    private String name;
    private float marks;

    //constructor -- job is to initialize the object the moment it is created
    //user defined default constructor
    public Student() {
        System.out.println("Student()");
        roll = 100;
        name = "NA";
        marks = 0f;
    }

    //parameterized constructor
    public Student(int r, String n, float m) {
        //validations
        System.out.println("Student(int, String, float)");
        roll = r;
        name = n;
        marks = m;
    }

    public void setRoll(int r) {
        if(r > 0) {
            this.roll = r;
        }
    }

    public void init(int r, String n, float m) {
        roll = r;
        name = n;
        marks = m;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String str) {
        //check str
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setMarks(float m) {
        if(m < 0) {
            return;
        }

        marks = m;
    }

    public float getMarks() {
        return marks;
    }

    public void display() {
        System.out.println("roll = " +  roll + " name = " + name + " marks = " + marks);
    }

    public static void main(String[] args) {
		
	
    Student s1 = new Student();
    s1.init(11, "AA", 34.48f);
    s1.display();

    Student s2 = new Student(22, "BB", 44.56f);
    s2.display();

    
    //s1 is a reference capable of referring to Student object
    s1 = new Student();

    s1.setRoll(100);
    s1.setRoll(-100);
    s1.setName("vishal");
    s1.setMarks(-55.42f);
    s1.setMarks(58.42f);
//Student s2 =new Student();
 //   Student s2 = s1;
    s2.display();

    System.out.println();

    s1.setName("ABC");
    s1.setMarks(44.44f);
    s2.display();

    s1.roll = -100;
    s1.marks = 40.1f;
    s1.name = "Swati";

    System.out.println(s1.roll  + " " + s1.marks  + " " +s1.name);
    s1.display();
    
    
    
    

}
    
   
    
    
    
    
}




//s,getroll(); 




//Making sure that the state of an object can be changed only through it's
//behaviours is encapsulation

