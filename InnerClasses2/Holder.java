package InnerClasses2;

public class Holder {
    private int data;
    private  int sdata = 900;

    public Holder(int data) {
        this.data = data;
    }

    public Object task() {

        final int local = 99;

         class Maths {
          public  int increment(int val) {
        	  
                 System.out.println("sdata = " + sdata);
                System.out.println("data = " + data);
                
                System.out.println("*********************************");
                return ++val;
            }

            @Override
            public String toString() {
                return "Maths tostring " + local ;
            }
        }

        Maths maths = new Maths();
        data = maths.increment(data);
        System.out.println("task1: " + data);
        data = maths.increment(data);
        System.out.println("task2: " + data);
        data = maths.increment(data);
        System.out.println("task3: " + data);
        System.out.println("______________--");


        return maths;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "data=" + data +
                '}';
    }
    
    
    
    public static void main(String[] args) {
        Holder holder = new Holder(10);

        Object obj = holder.task();
        // hear we can create object of outer class and then we call task method
        //and store task into obj that is return type is object.

        System.out.println(obj.toString());
    } 
}


/**
 * you want to call  local inner classes then you create object of inner class inside method.
 * then you call method of inner class on reference of inner class.
 *
 * If a local variable is accessed within a method local inner class
 * it has to be final or effectively final.
 *
 *
 */