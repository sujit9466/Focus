package Inner_Classes;

public class Main {
    public static void main(String[] args) {

        //Outer.out = 100; //out is an instance member. it is not a static member
        //Outer.Inner in1 = new Outer.Inner(100); //will not work as Inner a non-static

        Outer o1 = new Outer(10);
        
        Outer.Inner in11 = o1.new Inner(100);
        in11.display();
//        Outer.Inner in12 = o1.new Inner(1000);
//        in12.display();

//        System.out.println("*************************");
//
//        Outer o2 = new Outer(20);
//        o2.display();
//
//        Outer.Inner in21 = o2.new Inner(200);
//        in21.display();
//        Outer.Inner in22 = o2.new Inner(2000);
//        in22.display();
//
//        System.out.println("*************************************");
//        in11.increment();
//        in11.display();
//        in12.display();
//

    }
}

/**
 * 1. To create an object the class should have existence.
 * 2. Non-static (instance) members of a class will have existence when
 * you create an object.
 * 3. Inner class is member of Outer class.
 * 4. Inner class is a non-static member of Outer class.
 */


/**
 * An object of non-static inner class, will implicitly
  hold a reference to outer class object using which it was created.
 * That is why inner class can access the members of outer class.
 */


/**
 * Inner class methods will implicitly receive two this references.
 - first this refers to inner class object
 - the other this refers to outer class object.
 */


/**
 * If there is an object of non-static inner class, means that there is at least
 * one object of outer class existing.
 *
 * If there is an object of outer class, not necessarily there is an object of inner class existing.
   This is the reason why an outer class object does not hold reference(s)to inner class object(s).
 - Based on above statements we can conclude that the outer class can not access the members of inner class.
 */






