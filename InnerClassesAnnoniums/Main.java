package InnerClassesAnnoniums;

public class Main {
    public static void main(String[] args) {

        int num = 90;
        String filePath1 = "/home/java/one:jpeg";
        String filePath2 = "/home/java/one:mp3";


        MyUtil myUtil = new MyUtil();
        System.out.println( myUtil.toggle(num));
        System.out.println( myUtil.increment(num) );
        System.out.println( myUtil.decrement(num) );
        myUtil.fun();
        System.out.println("------------------------");

        MyReadable myReadable = new MyReadable();
        myReadable.read(filePath1);
        myReadable.read(filePath2);

        System.out.println("****************************");

        Util util = new Util() {
            @Override
            int toggle(int val) {
                return -1 * val;
            }
            

            @Override
            int increment(int val) {
                return ++val;
            }

            @Override
            int decrement(int val) {
                return --val;
            }

            public void fun() {
                System.out.println("this is fun");
            }
        };
        System.out.println("=======================================");
        System.out.println( util.toggle(num));
        System.out.println( util.increment(num) );
        System.out.println( util.decrement(num) );
        //util.fun();
        //we cannot call fun becose of fun is not override
        // it is own define in annonyums class 

        System.out.println();

        Readable readable = new Readable() {
            @Override
            public void read(String filePath) {
                switch ( filePath.split(":")[1] ) {
                    case "jpeg" :
                        System.out.println("Reading image: " + filePath);
                        break;
                    case "mp3":
                        System.out.println("Reading audio: " + filePath);
                        break;
                }
            }
        };

        readable.read(filePath1);
        readable.read(filePath2);
    }
}

class MyReadable implements Readable {
    @Override
    public void read(String filePath) {
        switch ( filePath.split(":")[1] ) {
            case "jpeg" :
                System.out.println("Reading image: " + filePath);
                break;
            case "mp3":
                System.out.println("Reading audio: " + filePath);
                break;
        }
    }
}


class MyUtil extends Util {
    @Override
    int toggle(int val) {
        return -1 * val;
    }

    @Override
    int increment(int val) {
        return ++val;
    }

    @Override
    int decrement(int val) {
        return --val;
    }

    public void fun() {
        System.out.println("this is also fun...");
    }
}

//we can create object of interface or abstract class.
//on object we write annonymous function 
//we need to override all abstract methods.
//we can perform any opration on abstract methods in annum class.








