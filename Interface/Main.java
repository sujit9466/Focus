package Interface;

public class Main {

	public static void main(String[] args) {
	     //2
        Rules r;

        r = new BitCodeStudent(11, "Maithili");
        r.study();
        r.innovate();

        if(r instanceof BitCodeStudent) {
            ((BitCodeStudent) r).setRoll(111);
        }
        System.out.println(r);


        System.out.println();
        //r = new OtherStudent(23, "AA"); //will not work

        r = new MPSCStudent(1011, "Sarthak", 3);
        r.study();
        r.innovate();

        if(r instanceof MPSCStudent) {
            ((MPSCStudent)r).setAttempts(4);
        }
        System.out.println(r);


        //1
        /*BitCodeStudent bs1 = new BitCodeStudent(11, "Maithili");
        BitCodeStudent bs2 = new BitCodeStudent(22, "Nazim");

        OtherStudent os1 = new OtherStudent(23, "AA");
        OtherStudent os2 = new OtherStudent(24, "BB");

        bs1.study();
        bs1.innovate();
        bs2.study();
        bs2.innovate();

        System.out.println();
        os1.study();
        os1.innovate();
        os2.study();
        os2.innovate();

        System.out.println();*/


    }
}


/**
 * You can not create object of an interface.
 * You can create a reference variable of an interface.
 * Interfaces behave like base classes. (An interface reference can refer
 * to an object of such a class which is implementing that interface. )
 */



