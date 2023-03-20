package Interface4;
public interface Loggable {

    public int TYPE_VISA = 1;
    static int TYPE_RUPAY = 2;
    final int TYPE_MASTER = 3;
    public static final int TYPE_XYZ = 4;

    void log(String filePath);
    void info();
}

interface Comparable {
    int compareTo(Object obj);
}

interface Printable extends Loggable, Comparable{
    void print();
}


interface Rules {

    default void rule1() {
        System.out.println("this is rule1");
    }

    void rule2();
}



















