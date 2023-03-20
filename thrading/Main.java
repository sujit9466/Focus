package thrading;

public class Main {
    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getId());
        System.out.println(mainThread.getName());
        System.out.println(mainThread.getPriority());


        Car c1 = new Car(101, "Swift", 5);
        c1.setPriority(Thread.MAX_PRIORITY);
        c1.setName("Swift Thread");

        Car c2 = new Car(202, "Tata", 6);
        Car c3 = new Car(303, "Honda", 9);




        //attempt 1
        /*
        c1.move();
        c2.move();
        c3.move();
        */

        //attempt 2
        /*c1.run();
        c2.run();
        c3.run();*/

        c1.start();
        c2.start();
        c3.start();

        System.out.println("c1 is alive: " + c1.isAlive());
        System.out.println("c2 is alive: " + c2.isAlive());
        System.out.println("c3 is alive: " + c3.isAlive());

    

		
		
//		Printer p= new Printer("HP","fduydygfyieeg");
//		
//		User u1=new User("suit",p);
//		
//		User u2=new User("vishal",p);
//		User u3=new User("rohit",p);
//		User u4=new User("Dipak",p);
//
//		
//		u1.start();
//		u2.start();
//		u3.start();
//		u4.start();
//
		
	}
	
}
