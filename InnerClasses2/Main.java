package InnerClasses2;

public class Main {
    public static void main(String[] args) {
        Holder holder = new Holder(10);

        Object obj = holder.task();

        System.out.println(obj.toString());

    }
}
