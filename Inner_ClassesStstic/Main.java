package Inner_ClassesStstic;

public class Main {
    public static void main(String[] args) {

        Outer o1 = new Outer(100);

        Outer.Inner in1 = new Outer.Inner(10);
        in1.display();

        Outer.Inner in2 = new Outer.Inner(20);
        in2.display();
    }
}


/**
 * Static inner class has existence even if there are no objects of outer class.
 * As the inner class is static it could be accessed using the outer class directly.
 *
 * As the static inner class is not dependent on the object of outer class, the static inner
 * class object will not be holding a reference to outer class object. And because of this
 * static inner class object can not access the instance members(non-static members) of outer class.
 *
 * Static inner class can access only the static members of outer class, as to access the
 * static members of outer class we don't need a reference to outer class object.
 */